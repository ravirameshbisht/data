{
  "id": 31,
  "name": "Write a query to pivot rows into columns dynamically (if dynamic pivot is not supported, simulate it for fixed values)",
  "query": "SELECT department_id, SUM(CASE WHEN job_title = 'Manager' THEN 1 ELSE 0 END) AS Managers, SUM(CASE WHEN job_title = 'Developer' THEN 1 ELSE 0 END) AS Developers, SUM(CASE WHEN job_title = 'Tester' THEN 1 ELSE 0 END) AS Testers FROM employees GROUP BY department_id;"
}
