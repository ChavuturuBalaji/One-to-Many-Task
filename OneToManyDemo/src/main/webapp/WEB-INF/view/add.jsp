<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

</head>
<body>
<!DOCTYPE html>

<style>
    .button-container {
        text-align: center;
    }

    .button-container form {
        display: inline-block;
        margin: 0 10px;
    }
</style>
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

<form:form modelAttribute="restaurantModel" action="store">
    <table>
        <tr>
            <td>Restaurant Name</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Type</td>
            <td><form:input path="type"/></td>
        </tr>
        <tr>
            <td>Location</td>
            <td><form:input path="location"/></td>
        </tr>
    </table>
    <input type="submit" value="Submit">
</form:form>


</body>
</html>
