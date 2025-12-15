{
  "id": 21,
  "name": "Find employees who have the same salary as their manager",
  "query": "SELECT e.name AS Employee, e.salary, m.name AS Manager FROM employees e JOIN employees m ON e.manager_id = m.id WHERE e.salary = m.salary"
}
