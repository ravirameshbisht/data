{
  "id": 15,
  "name": "Find customers who have not made any purchase",
  "query": "SELECT c.customer_id, c.name FROM customers c LEFT JOIN sales s ON c.customer_id = s.customer_id WHERE s.sale_id IS NULL"
}
