{
    "id": 6,
    "name": "Get departments with no employees",
    "query": "SELECT d.department_name FROM departments d LEFT JOIN employees e ON d.department_id = e.department_id WHERE e.id IS NULL;"
}