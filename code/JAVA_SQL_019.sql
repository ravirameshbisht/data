{
  "id": 19,
  "name": "Write a query to find employees with salary greater than average salary in the entire company, ordered by salary descending",
  "query": "SELECT name, salary FROM employees WHERE salary > (SELECT AVG(salary) FROM employees) ORDER BY salary DESC"
}
