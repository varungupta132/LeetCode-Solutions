# Write your MySQL query statement below

-- select product_name , year , price from Sales full outer join Product on Sales.product_id = Product.product_id 



SELECT product_name, year, price
FROM Sales
LEFT JOIN Product 
ON Sales.product_id = Product.product_id

-- UNION

-- SELECT product_name, year, price
-- FROM Sales
-- RIGHT JOIN Product 
-- ON Sales.product_id = Product.product_id;