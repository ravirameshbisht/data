{
  "id": 10,
  "name": "Recursive query to find the full reporting chain for each employee",
  "query": "WITH RECURSIVE reporting_chain AS (\n  SELECT id, name, manager_id, 1 AS level\n  FROM employees\n  WHERE manager_id IS NULL\n  UNION ALL\n  SELECT e.id, e.name, e.manager_id, rc.level + 1\n  FROM employees e\n  JOIN reporting_chain rc ON e.manager_id = rc.id\n)\nSELECT *\nFROM reporting_chain\nORDER BY level, id;"
}
