{
    "id": 1,
    "name": "Find the second highest salary from the Employee table",
    "query": "SELECT MAX(salary) AS SecondHighestSalary FROM employees WHERE salary < ( SELECT MAX(salary) FROM employees )"
}