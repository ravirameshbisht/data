{
  "id": 9,
  "name": "Find the longest consecutive streak of daily logins for each user.",
  "query": "WITH login_dates AS (\n  SELECT user_id, login_date,\n         login_date - INTERVAL ROW_NUMBER() OVER (PARTITION BY user_id ORDER BY login_date) DAY AS grp\n  FROM user_logins\n)\nSELECT user_id,\n       COUNT(*) AS streak_length,\n       MIN(login_date) AS start_date,\n       MAX(login_date) AS end_date\nFROM login_dates\nGROUP BY user_id, grp\nORDER BY streak_length DESC;"
}
