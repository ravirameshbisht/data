{
    "id": 4,
    "name": "Count employees in each department having more than 5 employees",
    "query": "SELECT department_id, COUNT(*) AS num_employees FROM employees GROUP BY department_id HAVING COUNT(*) > 5;"
}