<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
table {
  border-collapse: collapse;
  width: 80%;
  color:white;
 margin:auto;;
}

th, td {
  text-align: center;
  padding: 8px;
}

tr:nth-child(even) {background-color: #858584;}
</style>

<body style="background-color:black">
<h1 style="color:white;text-align:center">REGISTER PAGE</h1>
	<form action="submit" method="POST">
	<table>
		<tr><td>NAME<input type="text" name="ename"></td></tr>
		<tr><td>JOB<input type="text" name="job"></td></tr>
		<tr><td>SALARY<input type="text" name="sal"></td></tr>
		<tr><td>DEPARTMENT NO<input type="text" name="deptno"></td></tr>
		<tr><td><input type="submit" value="submit"></td></tr>
	</table>
	</form>
	
	<a href="./">HOME</a>

</body>