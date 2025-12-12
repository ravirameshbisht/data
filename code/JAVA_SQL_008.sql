{
  "id": 8,
  "name": "Running total of salaries by department",
  "query": "SELECT name, department_id, salary, SUM(salary) OVER (PARTITION BY  department_id ORDER BY id) AS running_total FROM employees;"
}
