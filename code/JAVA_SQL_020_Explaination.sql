The query groups employees by department_id.
- JSON_AGG(name) collects all employee names within each department.
- Each group produces a JSON array of names.
- GROUP BY department_id ensures one result row per department.
- The output shows departments with their employees listed in JSON format.