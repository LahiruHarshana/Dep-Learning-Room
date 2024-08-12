CREATE TABLE employee(
    employee_id VARCHAR(5) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    address VARCHAR(200) NOT NULL
);

CREATE TABLE contact(
    contact VARCHAR(12) PRIMARY KEY,
    employee_id VARCHAR(5) NOT NULL,
    CONSTRAINT fk_employee FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

INSERT INTO employee (employee_id, name, address) VALUES
                                                      ('E001','Kasun','Galle'),
                                                      ('E002','IIT','Galle'),
                                                      ('E003','SANDARU','Galle'),
                                                      ('E004','Saman','Galle'),
                                                      ('E005','MEnitj','Galle'),
                                                      ('E006','IJSE','Galle'),
                                                      ('E007','GDSE','Galle');


INSERT INTO contact(contact, employee_id) VALUES
                                              ('234324234','E001'),
                                              ('9439430432','E001'),
                                              ('12130032','E002'),
                                              ('234234234','E002'),
                                              ('425234','E002'),
                                              ('23434234','E003'),
                                              ('234532','E005'),
                                              ('345432521','E004'),
                                              ('123004423','E003');



SELECT * FROM employee INNER JOIN contact c ON employee.employee_id = c.employee_id;
SELECT * FROM employee INNER JOIN contact USING(employee_id);
SELECT * FROM employee NATURAL INNER JOIN contact;
SELECT * FROM employee NATURAL LEFT OUTER JOIN contact;
SELECT * FROM employee NATURAL RIGHT OUTER JOIN contact;
SELECT * FROM employee NATURAL FULL OUTER JOIN contact;
SELECT * FROM employee NATURAL JOIN contact;
