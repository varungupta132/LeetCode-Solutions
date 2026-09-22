# Write your MySQL query statement below
with xyz as (
    select * , sum(weight) over(order by turn ) as rnk
    from Queue 
)

-- select * from xyz;


select person_name from xyz where rnk <= 1000 order by turn desc limit 1;
