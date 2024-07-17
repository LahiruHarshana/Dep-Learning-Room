CREATE TABLE `user` (
                        nic VARCHAR(12) PRIMARY KEY,
                        name VARCHAR(200) NOT NULL,
                        address VARCHAR(500) NOT NULL,
                        dob DATE NOT NULL,
                        gender ENUM('MALE', 'FEMALE') NOT NULL
);

CREATE TABLE partner (
                           user1_nic VARCHAR(12) PRIMARY KEY,
                           user2_nic VARCHAR(12) NOT NULL UNIQUE,
                           date DATE NOT NULL,
                           CONSTRAINT fk_user1 FOREIGN KEY (user1_nic) REFERENCES user(nic),
                           CONSTRAINT fk_user2 FOREIGN KEY (user2_nic) REFERENCES user(nic)
);

DROP TABLE user;