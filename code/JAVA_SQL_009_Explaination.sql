The query identifies consecutive login streaks for each user by grouping login dates using row-number arithmetic and returns the streak length with start and end dates.
- The inner query assigns each user’s login records a row number ordered by date.
- It subtracts this row number from the login date to create a “group key” that stays the same for consecutive days.
- Each unique group represents one login streak.
- The outer query counts how many days are in each streak and finds the start and end dates.
- The results are sorted to show the longest login streaks first.