<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Login Application</title>  
</head>  
<body>  

    <form action="loginServlet" method="post">  
        <fieldset style="width: 300px">  
            <legend> Login to App </legend>  
            <table>  
                <tr>  
                    <td>User ID</td>  
                    <td><input type="text" name="username" required="required" /></td>  
                </tr>  
                <tr>  
                    <td>Password</td>  
                    <td><input type="password" name="userpass" required="required" /></td>  
                </tr>  
                <tr>  
                    <td><input type="submit" value="Login" /></td>  
                </tr>  
            </table>  
        </fieldset>  
    </form>  
    
    <form action="passResetServlet" method="post">  
        <fieldset style="width: 300px">  
            <legend> Password Reset </legend>  
            <table>  
                <tr>  
                    <td>User ID</td>  
                    <td><input type="text" name="username" required="required" /></td>  
                </tr>
                <tr>  
                    <td>Existing Password</td>  
                    <td><input type="password" name="oldPass" required="required" /></td>  
                </tr>  
                <tr>  
                    <td>New Password</td>  
                    <td><input type="password" name="newPass" required="required" /></td>  
                </tr>  
                <tr>  
                    <td><input type="submit" value="ResetPass" /></td>  
                </tr>  
            </table>  
        </fieldset>  
    </form>  
    
    <tr>
    <a href="logoutServlet">Logout</a>
    </tr>
    
</body>  
</html>  