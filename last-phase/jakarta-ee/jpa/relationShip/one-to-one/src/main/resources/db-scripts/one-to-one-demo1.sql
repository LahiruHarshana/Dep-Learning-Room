CREATE TABLE employee(
    id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(200) primary key,
    address VARCHAR(400) NOT NULL,
    contact VARCHAR(20)
);

CREATE TABLE spouse(
    id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    contact VARCHAR(10),
    employee_id VARCHAR(10) NOT NULL,
    CONSTRAINT fk_employee FOREIGN KEY (employee_id) REFERENCES  employee(id)
);

DROP TABLE employee;
DROP TABLE spouse;


ALTER TABLE