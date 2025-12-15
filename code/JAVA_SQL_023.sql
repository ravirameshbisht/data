{
  "id": 23,
  "name": "Find departments with the highest average salary",
  "query": "WITH avg_salaries AS ( SELECT department_id, AVG(salary) AS avg_salary FROM employees GROUP BY department_id ) SELECT * FROM avg_salaries WHERE avg_salary = (SELECT MAX(avg_salary) FROM avg_salaries)"
}