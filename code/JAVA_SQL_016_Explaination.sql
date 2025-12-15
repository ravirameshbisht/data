The query groups employees by department_id.

- CASE WHEN gender = 'M' THEN 1 END counts only male employees.
- CASE WHEN gender = 'F' THEN 1 END counts only female employees.
- COUNT() ignores NULL, so only matching genders are counted.
- The result shows male and female counts for each department.