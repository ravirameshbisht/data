{
  "id": 24,
  "name": "Write a query to find the number of employees in each job title",
  "query": "SELECT job_title, COUNT(*) AS num_employees FROM employees GROUP BY job_title"
}
