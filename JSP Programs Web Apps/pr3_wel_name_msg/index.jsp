<%@ page import="java.time.*"%>

<html>
<head>
	<title>Third App by GK</title>
	<style>
		*{ font-size:40px; }
	</style>
</head>

<body>
<center>
	<h1>Welcome App</h1>
	<form>
		<input type="text" name="n1" placeholder="enter ur name" required>
		<br><br>
		<input type="submit" value="Find" name="b1">
	</form>

	<%
		if(request.getParameter("b1") != null)
		{
			String name = request.getParameter("n1");
			LocalTime t = LocalTime.now();
			int h = t.getHour();
			String msg = "";
			if (h < 12) msg = "Good Morning";
			else if (h < 17) msg = "Good Afternoon";
			else msg = "Good Evening";
			msg = "Welcome " + name + " " + msg;
			out.print(msg);
		}
	%>	
</center>
</body>
</html>