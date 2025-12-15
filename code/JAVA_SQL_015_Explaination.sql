This query finds customers who have never made a sale.
- LEFT JOIN keeps all records from customers, even if there is no match in sales.
- Matching sales records are joined using customer_id.
- If a customer has no sales, columns from sales become NULL.
- WHERE s.sale_id IS NULL filters only those customers with no sales.
- The result lists inactive / non-purchasing customers.