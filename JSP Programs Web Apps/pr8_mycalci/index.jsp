<html>
<head>
	<title> My Calci by GK 2 </title>
	<style>
		* { font-size:30px; }
	</style>
</head>

<body>
	<center>
		<h1>My Calci</h1>
		<form method="POST">
			<input type="number" name="n1" placeholder="enter first integer" required>
			<br> <br>
			<input type="number" name="n2" placeholder="enter second integer" required>
			<br> <br>
			
			<input type="radio" name="r1" value="add" checked> Add </input>
			<input type="radio" name="r1" value="sub" > Sub </input>
			<input type="radio" name="r1" value="mul" > Mul </input>
			<br><br>
			<input type="submit" value="Find" name="b1">
		</form>
		
		<%
			if(request.getParameter("b1") != null)
			{
				long res = 0;
				int n1 = Integer.parseInt(request.getParameter("n1"));
				int n2 = Integer.parseInt(request.getParameter("n2"));
				String op = request.getParameter("r1");
				if (op.equals("add"))
				{
					res = n1 + n2;
					out.println("Addition = "+ res);
				}
				else if (op.equals("sub"))
				{
					res = n1 - n2;
					out.println("Subtraction = "+ res);
				}
				else
				{
					res = n1 * n2;
					out.println("Multiplication = "+ res);
				}
			}
		%>
	</center>

</body>
</html>