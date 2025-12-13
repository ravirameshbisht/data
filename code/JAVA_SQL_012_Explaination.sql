This query calculates the cumulative distribution of salaries in the employees table.
- SELECT name, salary retrieves each employee’s name and salary.
- CUME_DIST() is a window function that computes the cumulative distribution.
- OVER (ORDER BY salary) orders employees by salary in ascending order.
- salary_cdf shows the fraction of employees earning less than or equal to that salary.
- The value ranges from 0 to 1, where higher values mean higher relative salary.
