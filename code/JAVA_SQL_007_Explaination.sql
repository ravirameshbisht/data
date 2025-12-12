1. The inner query sorts all employee salaries in ascending order.
2. It then skips rows until it reaches the middle position using the OFFSET value.
3. The LIMIT decides whether to pick 1 value (odd count) or 2 values (even count).
4. These selected middle salary values are returned as a temporary result.
6. The outer query takes the average of those values, giving the median salary.