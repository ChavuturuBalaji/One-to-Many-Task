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

<form:form modelAttribute="itemsModel" method="post" action="updatedItem">
    <table>
        <tr>
            <td>Item ID</td>
            <td><form:input path="itemID"  readonly="true" value="${itemsModel.getItemID()}"/></td>
        </tr>
        <tr>
            <td>Item Name</td>
            <td><form:input path="name" value="${itemsModel.getName()}"/></td>
        </tr>
        <tr>
            <td>Category</td>
            <td><form:input path="category" value="${itemsModel.getCategory()}"/></td>
        </tr>
        <tr>
            <td>Cuisine</td>
            <td><form:input path="cuisine" value="${itemsModel.getCuisine()}"/></td>
        </tr>
    </table>
    <input type="submit" value="update">
</form:form>


</body>
</html>
