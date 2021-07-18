<%@ page import="java.text.*" %>
<html>
<head>
	<title>Square Root Finder App 2 by GK </title>
	<style>
		*{ font-size:40px; }
	</style>
	<script>
		function check()
		{
			var n1 = document.getElementById("n1");
			if (n1.value == "" | n1.value < 0)
			{
				alert("invalid number");
				n1.value="";
				n1.focus();
				return false;
			}
			else
			{
				return true;
			}
		}
	</script>
</head>

<body>
<center>
	<h1>Square Root Finder App 2</h1>
	<form onsubmit="return check()">
		<input type="number" step="any" name="n1" placeholder="enter number" id="n1">
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