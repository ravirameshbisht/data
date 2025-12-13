{
  "id": 11,
  "name": "Write a query to find gaps in a sequence of numbers (missing IDs).",
  "query": "SELECT (id + 1) AS missing_id\nFROM employees e1\nWHERE NOT EXISTS (\n  SELECT 1\n  FROM employees e2\n  WHERE e2.id = e1.id + 1\n)\nORDER BY missing_id;"
}
