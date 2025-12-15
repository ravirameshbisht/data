{
  "id": 27,
  "name": "Calculate the moving average of salaries over the last 3 employees ordered by hire date",
  "query": "SELECT name, hire_date, salary, AVG(salary) OVER (ORDER BY hire_date ROWS BETWEEN 2 PRECEDING AND CURRENT ROW) AS moving_avg_salary FROM employees"
}
