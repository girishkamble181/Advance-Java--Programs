<%@ page import="java.text.*" %>
<html>
<head>
	<title>Square Root Finder App by GK</title>
	<style>
		*{ font-size:40px; }
	</style>
</head>

<body>
<center>
	<h1>Square Root Finder App</h1>
	<form>
		<input type="number" step="any" name="n1" placeholder="enter number" required min=0>
		<br><br>
		<input type="submit" value="Find" name="b1">
	</form>

	<%
		if(request.getParameter("b1") != null)
		{
			String s = request.getParameter("n1");
			double num = Double.parseDouble(s);
			double res = Math.sqrt(num);
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMaximumFractionDigits(2);
			String msg = "number is " + num + " and result = " + nf.format(res);
			out.print(msg);
		}
	%>	
</center>
</body>
</html>