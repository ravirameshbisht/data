{
  "id": 30,
  "name": "Write a query to perform a self-join to find pairs of employees in the same department",
  "query": "SELECT e1.name AS Employee1, e2.name AS Employee2, e1.department_id FROM employees e1 JOIN employees e2 ON e1.department_id = e2.department_id AND e1.id < e2.id;"
}
