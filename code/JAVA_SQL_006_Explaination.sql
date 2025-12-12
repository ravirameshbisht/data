This query finds all departments that do not have any employees.
It performs a LEFT JOIN, meaning all departments are included even if no matching employee exists.
The condition e.department_id matches employees to their department.
The WHERE e.id IS NULL filter keeps only those rows where no employee was found for that department.
As a result, it returns only the department names with zero employees.