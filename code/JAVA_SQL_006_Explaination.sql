1. This query finds all departments that do not have any employees.
2. It performs a LEFT JOIN, meaning all departments are included even if no matching employee exists.
3. The condition e.department_id matches employees to their department.
4. The WHERE e.id IS NULL filter keeps only those rows where no employee was found for that department.
5. As a result, it returns only the department names with zero employees.