{
  "id": 20,
  "name": "Aggregate JSON data (if supported) to list all employee names in a department as a JSON array",
  "query": "SELECT department_id, JSON_AGG(name) AS employee_names FROM employees GROUP BY department_id"
}
