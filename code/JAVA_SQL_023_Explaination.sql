This query finds departments with the highest average salary
- The CTE avg_salaries calculates the average salary for each department.
- GROUP BY department_id ensures one average per department.
- The main query selects all rows from the CTE.
- The subquery finds the maximum average salary among all departments.
- The result returns the department(s) with the highest average salary.