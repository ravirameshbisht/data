{
  "id": 7,
  "name": "Write a query to find the median salary",
  "query": "SELECT AVG(salary) AS median_salary\nFROM (\n    SELECT salary\n    FROM employees\n    ORDER BY salary\n    LIMIT 2 - (SELECT COUNT(*) FROM employees) % 2\n    OFFSET (SELECT (COUNT(*) - 1) / 2 FROM employees)\n) AS median_subquery;"
}
