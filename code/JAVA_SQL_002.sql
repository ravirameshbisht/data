{
    "id": 2,
    "name": "Find duplicate records in a table",
    "query": "SELECT name, COUNT(*) FROM employees GROUP BY name HAVING COUNT(*) > 1;"
}