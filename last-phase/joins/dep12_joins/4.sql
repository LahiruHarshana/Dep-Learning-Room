SELECT
    c.id,
    c.name,
    c.address,
    COUNT(o.id) AS order_count
FROM
    customer c
        LEFT OUTER JOIN
    `order` o
    ON
        c.id = o.customer_id
GROUP BY
    c.id, c.name, c.address HAVING count(o.id) >= 2;


SELECT
    c.id,
    c.name,
    c.address,
    COUNT(o.id),
    SUM(o.total
    )AS order_count
FROM
    customer c
        LEFT OUTER JOIN
    `order` o
    ON
        c.id = o.customer_id
GROUP BY
    c.id, c.name, c.address HAVING count(o.id) >= 2;
