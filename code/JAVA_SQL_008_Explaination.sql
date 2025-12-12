This query calculates a running total of salaries within each department.
- SUM(salary) OVER (...) is a window function that performs a cumulative sum.
- PARTITION BY department_id means the running total restarts for each department.
- ORDER BY id means the cumulative sum is calculated in the order of employee IDs.
- For each employee, the query returns: name, department_id, salary, and the running total salary so far for that department.
So the result shows how salaries accumulate employee-by-employee inside each department.