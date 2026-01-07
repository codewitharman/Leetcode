# Write your MySQL query statement below
select product_id, product_name, description 
from products 
where cast(concat(' ',description,' ') AS BINARY) REGEXP BINARY '(^| )SN[0-9]{4}-[0-9]{4}( |$)'
order by product_id;