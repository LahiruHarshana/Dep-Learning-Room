CREATE TABLE `order`(
                        id VARCHAR (10) PRIMARY KEY,
                        date DATE NOT NULL,
                        customer_name VARCHAR(100) NOT NULL
);

CREATE TABLE item(
                     code VARCHAR(10) Primary Key,
                     name VARCHAR(200) NOT NULL,
                     price DECIMAL(8,2) NOT NULL
);

CREATE TABLE order_detail(
                             order_id VARCHAR(10) NOT NULL,
                             item_code VARCHAR(10) NOT NULL,
                             qty INT NOT NULL,
                             price DECIMAL(8,2) NOT NULL,
                             CONSTRAINT pk_order_detail PRIMARY KEY (order_id,item_code),
                             CONSTRAINT fk_order FOREIGN KEY (order_id) REFERENCES `order` (id),
                             CONSTRAINT fk_item FOREIGN KEY (item_code) REFERENCES item(code)
);


# sudo docker run --name mysql_container -e MYSQL_ROOT_PASSWORD=mysql -p 3307:3306 --name mysql_container -v ~/mysql:/var/lib/mysql -d mysql