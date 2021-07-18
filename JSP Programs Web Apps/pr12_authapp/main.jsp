<html>
<head>
	<title> App Designed by GK </title>
	<style>
		* { font-size:40px; font-family:Courier; }
		button a{ text-decoration: none; color:red;}
	</style>
</head>

<body style="background-color:powderblue;">
	<center>
		<%
			if (session.getAttribute("user") == null)
			{
				response.sendRedirect("index.jsp");
			}	
			else
			{
		%>
		
		<h1> Main Page </h1>
		<h2> Welcome <%= session.getAttribute("user") %> </h2>
		<form method="POST">
			<input type="submit" value="Logout" name="b1">
			<br>
		</form>
		<button><a href="index.jsp"> Home </a> </button>

		<%
			if (request.getParameter("b1") != null )
			{
				session.invalidate();
        			response.sendRedirect("index.jsp");

			}
			}

		%>
	</center>
</body>
</html>