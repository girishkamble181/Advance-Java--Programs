<html>
<head>
	<title> Calci App by GK </title>
	<style>
		* { font-size:40px }
		.btn{ width:20%; color:red; background-color:white; }
	</style>

</head>
<body>
<center>
	<h1> Calci App</h1>
	<form>
		<input type="number" name="n1" placeholder="enter first number" required>
		<br><br>
		<input type="number" name="n2" placeholder="enter second number" required>
		<br><br>
		<input type="submit" value="Add" name="b1" class="btn">
		<input type="submit" value="Sub" name="b2" class="btn">
		<input type="submit" value="Mul" name="b3" class="btn">
		<input type="submit" value="Div" name="b4" class="btn">
	</form>

	<%
		if (request.getParameter("b1") != null )
		{
			int n1 = Integer.parseInt(request.getParameter("n1"));
			int n2 = Integer.parseInt(request.getParameter("n2"));
			int res = n1 + n2;
			String msg = "addition = " + res;
			out.println(msg);
		}
		else if (request.getParameter("b2") != null )
		{
			int n1 = Integer.parseInt(request.getParameter("n1"));
			int n2 = Integer.parseInt(request.getParameter("n2"));
			int res = n1 - n2;
			String msg = "subtraction = " + res;
			out.println(msg);
		}
		else if (request.getParameter("b3") != null )
		{
			int n1 = Integer.parseInt(request.getParameter("n1"));
			int n2 = Integer.parseInt(request.getParameter("n2"));
			int res = n1 * n2;
			String msg = "multiplication = " + res;
			out.println(msg);
		}
		else if (request.getParameter("b4") != null )
		{
			int n1 = Integer.parseInt(request.getParameter("n1"));
			int n2 = Integer.parseInt(request.getParameter("n2"));
			try
			{
			int res = n1 / n2;
			String msg = "division = " + res;
			out.println(msg);
			}
			catch(ArithmeticException e)
			{
				out.println("2nd number shuld not be zero");
			}
		}	
	%>
</center>
</body>
</html>