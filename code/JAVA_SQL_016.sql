{
  "id": 16,
  "name": "Write a query to perform a conditional aggregation (count males and females in each department)",
  "query": "SELECT department_id, COUNT(CASE WHEN gender = 'M' THEN 1 END) AS male_count, COUNT(CASE WHEN gender = 'F' THEN 1 END) AS female_count FROM employees GROUP BY department_id;"
}


