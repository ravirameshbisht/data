{
  "id": 12,
  "name": "Calculate cumulative distribution (CDF) of salaries.",
  "query": "SELECT name, salary, CUME_DIST() OVER (ORDER BY salary) AS salary_cdf FROM employees;"
}