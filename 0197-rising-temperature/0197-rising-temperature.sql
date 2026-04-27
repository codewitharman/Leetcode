# Write your MySQL query statement below
select w1.id
from weather w1, weather w2
where w1.temperature>w2.temperature
AND DATEDIFF(w1.Recorddate, w2.Recorddate) = 1