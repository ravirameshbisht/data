{
  "id": 17,
  "name": "Write a query to calculate the difference between current row and previous row's salary (lag function)",
  "query": "SELECT name, salary, salary - LAG(salary) OVER (ORDER BY id) AS salary_diff FROM employees"
}
