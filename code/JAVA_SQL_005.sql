{
    "id": 5,
    "name": "Find employees who joined in the last 6 months",
    "query": "SELECT * FROM employees WHERE join_date >= CURRENT_DATE - INTERVAL '6 months';"
}