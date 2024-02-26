<!DOCTYPE html>
<html>
<head>
    <title>File Upload</title>
</head>
<body>
<h2>Upload Image</h2>
<form action="/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file" id="file"><br><br>
    Description: <input type="text" name="description"><br><br>
    <input type="submit" value="Upload">
</form>
</body>
</html>
