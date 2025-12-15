{
  "id": 28,
  "name": "Find the most recent purchase per customer using window functions",
  "query": "SELECT * FROM ( SELECT *, ROW_NUMBER() OVER (PARTITION BY customer_id ORDER BY purchase_date DESC) AS rn FROM sales ) sub WHERE rn = 1;"
}
