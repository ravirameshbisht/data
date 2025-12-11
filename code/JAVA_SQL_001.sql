{
    "id": 1,
    "name": "Get All Users",
    "query": "SELECT MAX(salary) AS SecondHighestSalary FROM employees WHERE salary < ( SELECT MAX(salary) FROM employees )"
}