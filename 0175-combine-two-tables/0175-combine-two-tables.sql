/* Write your PL/SQL query statement below */
select firstName, lastName , city ,  NVL(state,null) as state   
from Person p left join address a
on p.personid=a.personid;
