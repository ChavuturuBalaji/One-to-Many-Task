<!DOCTYPE html>
<html>
<head>
    <style>
        .button-container {
            text-align: center; /* Align buttons to the center */
        }

        .button-container form {
            display: inline-block; /* Make forms display inline */
            margin: 0 10px; /* Add some spacing between buttons */
        }
    </style>
</head>
<body>
<div class="button-container">
    <form action="/add">
        <input type="submit" value="Add">
    </form>
    <form action="/selectRestaurant">
        <input type="submit" value="Add Item">
    </form>
    <form action="/all">
        <input type="submit" value="Get All">
    </form>

</div>
</body>
</html>
