The query selects each employee’s name and salary.
- LAG(salary) fetches the previous employee’s salary based on the given order.
- OVER (ORDER BY id) defines the sequence of rows using employee id.
- salary - LAG(salary) calculates the salary difference from the previous row.
- The first row returns NULL for salary_diff since no previous record exists.