The subquery calculates the average salary of all employees.
- The outer query selects employees whose salary is greater than this average.
- WHERE salary > (SELECT AVG(salary) ...) filters above-average earners.
- ORDER BY salary DESC sorts the result from highest to lowest salary.
- The output lists top-paid employees compared to the company average.