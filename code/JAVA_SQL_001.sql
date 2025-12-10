[
    {
        "id": 1,
        "name": "Get All Users",
        "query": "SELECT * FROM users WHERE active = true ORDER BY created_at DESC"
    },
    {
        "id": 2,
        "name": "Count Orders by Status",
        "query": "SELECT status, COUNT(*) as count FROM orders GROUP BY status"
    },
    {
        "id": 3,
        "name": "Top 5 Products",
        "query": "SELECT product_name, SUM(quantity) as total_sold FROM order_items GROUP BY product_name ORDER BY total_sold DESC LIMIT 5"
    },
    {
        "id": 4,
        "name": "User Purchase History",
        "query": "SELECT u.name, o.order_date, o.total_amount FROM users u JOIN orders o ON u.id = o.user_id WHERE u.id = 101"
    }
]