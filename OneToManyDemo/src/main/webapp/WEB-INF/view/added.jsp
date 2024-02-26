<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success Message</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }
        .success-container {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .success-message {
            text-align: center;
            padding: 20px;
            background-color: #d4edda;
            color: #155724;
            border: 1px solid #c3e6cb;
            border-radius: 5px;
            margin-bottom: 20px;
        }
        .success-message h1 {
            margin-top: 0;
        }
        .link {
            text-decoration: none;
            color: #007bff;
        }
    </style>
</head>
<body>
<div class="success-container">
    <div class="success-message">
        <h1>Restaurant is added</h1>
    </div>
    <a href="selectRestaurant">Add items</a>
</div>
</body>
</html>
