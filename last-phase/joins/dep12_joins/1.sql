CREATE TABLE customer(
    id VARCHAR(8) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    address VARCHAR(100) NOT NULL
);


INSERT INTO customer(id, name, address) VALUES
                                            ('C001','Kasun Sampath','Galle'),
                                            ('C002','Saman saman','Weligama'),
                                            ('C003','chamru maru','Galle'),
                                            ('C004','sandun Menaka','Matara '),
                                            ('C005','Lahiru Senaru','Galle'),
                                            ('C006','senaka sena','Panadura');


CREATE TABLE `order`(
                        id VARCHAR(8) PRIMARY KEY,
                        customer_id VARCHAR(8),
                        date DATE NOT NULL DEFAULT (CURRENT_DATE()),
                        total DECIMAL(8,2) NOT NULL
);

INSERT INTO `order`(id, customer_id, total) VALUES
                                                ('O001','C001',45353.00),
                                                ('O002','C002',35345.00),
                                                ('O003','C003',2342.00),
                                                ('O004','C001',4453.00),
                                                ('O005','C002',1343.00),
                                                ('O006','C006',234.00),
                                                ('O007','C007',4534.00),
                                                ('O008','C001',2354.00),
                                                ('O009','C003',1343.00),
                                                ('O010','C002',3465.00),
                                                ('O011','C001',5345.00),
                                                ('O012','C005',1233.00);


INSERT INTO `order`(id, customer_id, total) VALUES
                                                ('O013',null,45353.00),
                                                ('O014',null,42234.00),
                                                ('O015',null,2442.00),
                                                ('O016',null,3424.00),
                                                ('O017',null,123.00),
                                                ('O018',null,5535.00);



table customer;
table `order`;
SELECT c.id,c.name,o.id,o.customer_id FROM customer c CROSS JOIN `order` o order by customer_id; #CROSS JOIN
SELECT c.id,c.name,o.id,o.customer_id FROM customer c INNER JOIN `order` o WHERE c.id = o.customer_id order by customer_id;#INNER JOIN
SELECT c.id,c.name,o.id,o.customer_id FROM customer c INNER JOIN `order` o ON c.id = o.customer_id order by customer_id;#INNER JOIN
SELECT c.id,c.name,o.id,o.customer_id FROM customer c INNER JOIN `order` o ON c.id = o.customer_id order by customer_id;#INNER JOIN


SELECT c.id,c.name,o.id,o.customer_id FROM customer c LEFT JOIN `order` o ON c.id = o.customer_id WHERE o.id IS NULL order by customer_id;#LEFT JOIN
SELECT c.id,c.name,o.id,o.customer_id FROM customer c LEFT JOIN `order` o ON c.id = o.customer_id order by customer_id;#LEFT JOIN


SELECT c.id,c.name,o.id,o.customer_id FROM customer c RIGHT OUTER JOIN `order` o ON c.id = o.customer_id order by customer_id;#RIGHT JOIN



# A - B
SELECT c.id,c.name,o.id,o.customer_id FROM customer c LEFT JOIN `order` o ON c.id = o.customer_id WHERE o.id IS NULL order by customer_id;#LEFT JOIN
# A Intersection B
SELECT c.id,c.name,o.id,o.customer_id FROM customer c INNER JOIN `order` o ON c.id = o.customer_id order by customer_id;#INNER JOIN
# B - A
SELECT c.id,c.name,o.id,o.customer_id FROM customer c RIGHT OUTER JOIN `order` o ON c.id = o.customer_id where c.id IS NULL order by customer_id;#RIGHT JOIN

# == outer Join
# 1st method
(SELECT c.id,c.name,o.id,o.customer_id FROM customer c LEFT JOIN `order` o ON c.id = o.customer_id WHERE o.id IS NULL order by customer_id)
UNION (SELECT c.id,c.name,o.id,o.customer_id FROM customer c INNER JOIN `order` o ON c.id = o.customer_id order by customer_id)
UNION (SELECT c.id,c.name,o.id,o.customer_id FROM customer c RIGHT OUTER JOIN `order` o ON c.id = o.customer_id where c.id IS NULL order by customer_id);



#2nd method
# Left outer = (A-B) UNION (A intersection B) UNION (B-A)
(SELECT c.id,c.name,o.id,o.customer_id FROM customer c LEFT OUTER JOIN `order` o ON c.id = o.customer_id order by customer_id)
UNION
(SELECT c.id,c.name,o.id,o.customer_id FROM customer c RIGHT OUTER JOIN `order` o ON c.id = o.customer_id where c.id IS NULL order by customer_id);



# 3rd method
SELECT c.id,c.name,o.id,o.customer_id FROM customer c RIGHT OUTER JOIN `order` o ON c.id = o.customer_id order by customer_id;
SELECT c.id,c.name,o.id,o.customer_id FROM customer c LEFT JOIN `order` o ON c.id = o.customer_id WHERE o.id IS NULL order by customer_id;

(SELECT c.id,c.name,o.id,o.customer_id FROM customer c RIGHT OUTER JOIN `order` o ON c.id = o.customer_id order by customer_id)
UNION
(SELECT c.id,c.name,o.id,o.customer_id FROM customer c LEFT JOIN `order` o ON c.id = o.customer_id WHERE o.id IS NULL order by customer_id);




INSERT INTO customer (id, name, address) VALUES ('C0022','CHAMUTH','Moratuwa');
