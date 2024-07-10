package lk.ijse.dep12;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import lk.ijse.dep12.to.ErrorResponse;
import lk.ijse.dep12.to.User;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.*;
import java.util.HashMap;
import java.util.Set;

/**
 * @author : L.H.J
 * @File: UserServlet
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-04, Thursday
 **/


@WebServlet(name = "user-servlet" ,urlPatterns = "/users/*")
@MultipartConfig(location = "/tmp",maxFileSize = 5 * 1024 * 1024 * 1024)
public class UserServlet extends HttpServlet {
    @Resource(lookup = "java:comp/env/jdbc/dep12-todo_app-db")
    DataSource dataSource;
    private final ObjectMapper mapper = new ObjectMapper();
    private final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private final Validator validator = validatorFactory.getValidator();


    @Override
    public void destroy() {
        validatorFactory.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>GET USER</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        Part picture = req.getPart("picture");


        User user1 = new User(null, name, email, password, picture);
            Set<ConstraintViolation<User>> violations = validator.validate(user1);

            if (!violations.isEmpty()){
                HashMap<String, String> errors = new HashMap<>();
                resp.setContentType("application/json");
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                mapper.writeValue(resp.getWriter(),new ErrorResponse(req.getRequestURI(),400,
                        "Bad Request",
                        "Validation Failed",
                        violations));
                return;
            }

        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement stm = connection.prepareStatement("""
                    INSERT INTO `user`(email, password, name, picture) VALUES (?, ?, ?, ?)
                    """, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, email);
            stm.setString(2, password);
            stm.setString(3, name);
            stm.setBinaryStream(4, picture.getInputStream());
            stm.executeUpdate();
            ResultSet rs = stm.getGeneratedKeys();
            rs.next();
            int newUserId = rs.getInt(1);

            resp.setContentType("application/json");
            resp.setStatus(HttpServletResponse.SC_CREATED);

//            User user = new User(newUserId,name,email);
//            mapper.writeValue(resp.getWriter(),user);
        } catch (SQLException e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String stackTrace = sw.toString();
            resp.getWriter().println("<h1>Error: " + stackTrace + "</h1>");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>DELETE USER</h1>");
    }

    protected void doPatch(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>DELETE USER</h1>");
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getMethod().equals("PATCH")) {
            doPatch(req, resp);
        } else {
            super.service(req, resp);
        }
    }
}
