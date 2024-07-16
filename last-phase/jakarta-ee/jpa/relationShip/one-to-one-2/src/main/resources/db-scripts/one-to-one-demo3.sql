CREATE TABLE "user" (
        nic VARCHAR(12) PRIMARY KEY,
        name VARCHAR(200) NOT NULL,
        address VARCHAR(500) NOT NULL,
        dob DATE NOT NULL,
        gender ENUM('MALE', 'FEMALE') NOT NULL
);
