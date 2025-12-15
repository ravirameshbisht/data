The query joins the bookings table with itself (self-join).
- b1.booking_id <> b2.booking_id prevents a booking from matching with itself.
- b1.start_date <= b2.end_date checks if booking 1 starts before booking 2 ends.
- b1.end_date >= b2.start_date checks if booking 1 ends after booking 2 starts.
- Together, these conditions identify overlapping bookings.