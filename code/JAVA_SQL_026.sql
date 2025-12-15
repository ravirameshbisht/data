{
  "id": 26,
  "name": "Write a query to find the difference in days between two dates in the same table",
  "query": "SELECT id, DATEDIFF(day, start_date, end_date) AS days_difference FROM projects"
}
