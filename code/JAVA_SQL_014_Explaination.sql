This query uses a window function to rank employees by salary.
- RANK() assigns a ranking number to each employee based on salary.
- ORDER BY salary DESC ensures higher salaries get better (lower) ranks.
- Employees with the same salary receive the same rank.
- When there are ties, the next rank is skipped (e.g., 1, 1, 3).
- The query returns each employee’s name, salary, and their salary rank.