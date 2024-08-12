CREATE TABLE student(
    student_id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE program(
    program_id VARCHAR(10) Primary Key,
    name VARCHAR(100) NOT NULL,
    student_id VARCHAR(10) NOT NULL REFERENCES student(student_id)
);

INSERT INTO student (student_id, name) VALUES
                                           ('S001','Kasun'),
                                           ('S002','Sandun'),
                                           ('S003','Chanaka'),
                                           ('S004','sachini'),
                                           ('S005','lahiru'),
                                           ('S006','saman');

INSERT INTO program (program_id, name, student_id) VALUES
                                                       ('P001','CMJD','S001'),
                                                       ('P002','DEP','S001'),
                                                       ('P003','DEP','S002'),
                                                       ('P004','CMJD','S004'),
                                                       ('P005','CMJD','S002');


INSERT INTO program (program_id, name, student_id) VALUES
                                                       ('P006','Sandun','S002');

SELECT * FROM student INNER JOIN program p on student.student_id = p.student_id;
SELECT * FROM student INNER JOIN program p USING (student_id);
SELECT * FROM student NATURAL INNER JOIN program;