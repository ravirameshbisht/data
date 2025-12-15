{
  "id": 29,
  "name": "Detect hierarchical depth of each employee in the org chart",
  "query": "WITH RECURSIVE employee_depth AS ( SELECT id, name, manager_id, 1 AS depth FROM employees WHERE manager_id IS NULL UNION ALL SELECT e.id, e.name, e.manager_id, ed.depth + 1 FROM employees e JOIN employee_depth ed ON e.manager_id = ed.id ) SELECT * FROM employee_depth;"
}
