{
    "id": 3,
    "name": "Retrieve employees who earn more than their manager",
    "query": "SELECT e.name AS Employee, e.salary, m.name AS Manager, m.salary AS ManagerSalary FROM employees e JOIN employees m ON e.manager_id = m.id WHERE e.salary > m.salary"
}