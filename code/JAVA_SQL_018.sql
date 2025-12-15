{
  "id": 18,
  "name": "Identify overlapping date ranges for bookings",
  "query": "SELECT b1.booking_id, b2.booking_id FROM bookings b1 JOIN bookings b2 ON b1.booking_id <> b2.booking_id WHERE b1.start_date <= b2.end_date AND b1.end_date >= b2.start_date;"
}
