-- 코드를 입력하세요
select date_format(sales_date, '%Y-%m-%d') as sales_date, product_id, user_id, sales_amount from 
(SELECT sales_date, product_id, user_id, sales_amount
from online_sale
 where sales_date >= '2022-03-01' and sales_date < '2022-04-01'
union
SELECT sales_date, product_id, null, sales_amount
from offline_sale
where sales_date >= '2022-03-01' and sales_date < '2022-04-01'
) tmp
order by sales_date, product_id, user_id