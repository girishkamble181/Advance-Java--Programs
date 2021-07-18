<html>
<head>
	<title> Second App by GK </title>
	<style>
		*{ font-size:40px; }
	</style>
</head>
<body>
<center>
	<h1 style="color:red;"> Welcome App </h1>
	<form>
		<input type="text" name="n1" placeholder="enter ur name">
		<br><br>
		<input type="submit" name="b1">
	</form>

	<%
		if(request.getParameter("b1") != null)
		{
			String name = request.getParameter("n1");
			String msg = "";
			if (name.length() != 0)
			{
				msg = "welcome " + name;
			}
			else
			{
				msg = "u shuld enter name";
			}
			out.println(msg);
		}

	%>

</center>
</body>
</html>