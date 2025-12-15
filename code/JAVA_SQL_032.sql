{
  "id": 32,
  "name": "Find customers who made purchases in every category available",
  "query": "SELECT customer_id FROM sales s GROUP BY customer_id HAVING COUNT(DISTINCT category_id) = (SELECT COUNT(DISTINCT category_id) FROM sales);"
}
