# Write your MySQL query statement below
select e.employee_id 
from Employees e left join Salaries  s
on e.employee_id=s.employee_id
where s.employee_id  is null

 UNION 

 select s.employee_id 
from  Salaries  s left join employees e
on s.employee_id=e.employee_id
 WHERE e.employee_id is null
order by employee_id;