{
  "id": 14,
  "name": "Write a query to rank employees based on salary with ties handled properly",
  "query": "SELECT name, salary, RANK() OVER (ORDER BY salary DESC) AS salary_rank FROM employees"
}
