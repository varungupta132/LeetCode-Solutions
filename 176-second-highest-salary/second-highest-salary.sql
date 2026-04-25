# Write your MySQL query statement below
-- select max(salary) As SecondHighestSalary from Employee where (salary < (select max(salary) from Employee )) 


-- select max(salary) from Employee


-- select salary As SecondHighestSalary from Employee order by salary DESC limit 1, 


SELECT (
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1,1
) AS SecondHighestSalary;