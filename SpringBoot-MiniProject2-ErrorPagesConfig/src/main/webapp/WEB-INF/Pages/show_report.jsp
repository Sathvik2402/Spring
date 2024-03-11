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
 text-align : center;
  padding: 8px;
}
.a{
:center;
}
p{
font-size:20px;
text-align:center;
color:white;
}
tr:nth-child(even) {background-color: #858584;}
</style>
<body style="background-color:black">
<h1 style="color:white;text-align:center">REPORT PAGE</h1>
<c:choose>
	<c:when test="${!empty list }">
	<table >
		<tr>
			<th>EMPNO</th><th>ENAME</th><th>JOB</th><th>SAL</th><th>DEPTNO</th>
		</tr>
		<c:forEach var="emp" items="${list}">
		<tr>
		<td>${emp.empno}</td>
		<td>${emp.ename}</td>
		<td>${emp.job}</td>
		<td>${emp.sal}</td>
		<td>${emp.deptno}</td>
		<td><a href="emp_edit?no=${emp.empno}"><img src="images/edit.png" width="30px" height="30px"></a>
			<a href="emp_delete?no=${emp.empno}" onclick="return confirm ('Are you sure?')"><img src="images/del.png" width="30px" height="30px"></a></td>
		</tr>
		</c:forEach>
	</table>
	</c:when>
	<c:otherwise>
	<h1 style="color:green;text-align:center">NO RECORDS FOUND!</h1>
	</c:otherwise>
</c:choose>
<c:choose>
	<c:when test="${!empty resultMsg }">
	<p>Employee with Employee ID : ${resultMsg} </p>
	</c:when>
	</c:choose>
<table class="a">
<tr>
<td>
<a href="./" style="font-size:10px">
<img src="images/home.png" width="20px" height="15px"><br>
HOME
</a></td>
<td>
<a href="add" style="font-size:10px">
<img src="images/add.png" width="30px" height="20px"><br>
REGISTER
</a></td></tr></table>
</body>