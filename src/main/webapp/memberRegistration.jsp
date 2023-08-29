<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        form {
            margin: 20px;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #f9f9f9;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid #ccc;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 8px;
            margin: 4px 0;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        .header {
            text-align: center;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            font-size: 24px;
        }
    </style>
</head>
<body>
<!-- Header -->
    <div class="header">
        H9 Consulting LLC
    </div>

    <form action="Register" method="post">
        <table>
            <tr>
                <td>First Name</td>
                <td><input type="text" name="firstName"></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="lastName"></td>
            </tr>
            <tr>
                <td>Technology</td>
                <td><input type="text" name="technology"></td>
            </tr>
            <tr>
                <td>Masters Completion Year</td>
                <td><input type="number" name="mastersCompletionYear"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>Contact Number</td>
                <td><input type="text" name="contactNumber"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Register"></td>
            </tr>
        </table>
    </form>
</body>
</html>
