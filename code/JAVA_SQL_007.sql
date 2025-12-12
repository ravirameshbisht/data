{
    "id": 7,
    "name": "Write a query to find the median salary",
    "query": 'SELECT AVG(salary) AS median_salary
                FROM (
                SELECT salary
                FROM employees
                ORDER BY salary
                LIMIT 2 - (SELECT COUNT(*) FROM employees)
                % 2
                OFFSET (SELECT (COUNT(*) - 1) / 2 FROM
                employees)
                ) AS median_subquery;'
}
