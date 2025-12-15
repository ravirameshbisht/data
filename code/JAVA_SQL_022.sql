{
  "id": 22,
  "name": "Write a query to get the first and last purchase date for each customer",
  "query": "SELECT customer_id, MIN(purchase_date) AS first_purchase, MAX(purchase_date) AS last_purchase FROM sales GROUP BY customer_id"
}
