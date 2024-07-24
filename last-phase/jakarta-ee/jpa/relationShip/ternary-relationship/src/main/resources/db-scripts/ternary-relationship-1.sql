CREATE TABLE customer (
                          id VARCHAR(10) PRIMARY KEY ,
                          name VARCHAR(255) NOT NULL,
                          contact VARCHAR(15) NOT NULL UNIQUE
);

CREATE TABLE supplier (
                          id VARCHAR(10) PRIMARY KEY ,
                          name VARCHAR(255) NOT NULL
);

CREATE TABLE product (
                         code VARCHAR(255) PRIMARY KEY,
                         name VARCHAR(255) NOT NULL
);

CREATE TABLE purchase (
                     customer_id VARCHAR(10) NOT NULL ,
                     supplier_id VARCHAR(10) NOT NULL ,
                     product_code VARCHAR(255) NOT NULL,CONSTRAINT pk_purchase PRIMARY KEY (customer_id, supplier_id, product_code),
                     CONSTRAINT fk_customer FOREIGN KEY (customer_id) REFERENCES customer(id),
                     CONSTRAINT fk_product FOREIGN KEY (supplier_id) REFERENCES supplier(id),
                     CONSTRAINT fk_supplier FOREIGN KEY (product_code) REFERENCES product(code),
                     discount INT NOT NULL,
                     price DECIMAL(10,2) NOT NULL

);
