This query is used to find mismatched or non-matching rows between two tables.
- FULL OUTER JOIN combines all rows from table1 and table2, matching on id.
- Rows with no match on either side are still included (NULLs appear).
- IS DISTINCT FROM safely compares columns, treating NULL values correctly.
- The WHERE clause checks if any column value differs between the two tables.
- The result shows rows where data is different or missing in either table.