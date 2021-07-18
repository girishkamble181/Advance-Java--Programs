<html>
<head>
	<title>Even Odd App by GK</title>
	<style>
		*{ font-size:40px; }
	</style>
</head>

<body>
<center>
	<h1>Even Odd App</h1>
	<form>
		<input type="number" name="n1" placeholder="enter number" required>
		<br><br>
		<input type="submit" value="Find" name="b1">
	</form>

	<%
		if(request.getParameter("b1") != null)
		{
			String s = request.getParameter("n1");
			int num = Integer.parseInt(s);
			String res = num % 2 == 0 ? "even" : "odd";
			String msg = "number is " + num + " and result = " + res;
			out.print(msg);
		}
	%>	
</center>
</body>
</html>