{
  "id": 13,
  "name": "Compare two tables and find rows with differences in any column (all columns)",
  "query": "SELECT * FROM table1 t1 FULL OUTER JOIN table2 t2 ON t1.id = t2.id WHERE t1.col1 IS DISTINCT FROM t2.col1  OR t1.col2 IS DISTINCT FROM t2.col2 OR t1.col3 IS DISTINCT FROM t2.col3;"
}
