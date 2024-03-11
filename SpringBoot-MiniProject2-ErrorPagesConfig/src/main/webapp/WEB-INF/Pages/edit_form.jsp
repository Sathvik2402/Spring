<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

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
<h1 style="color:white;text-align:center">EDIT PAGE</h1>
	<frm:form modelAttribute="emp">
	<table>
	<tr>
		<td>EMP ID</td>
		<td><frm:input path="empno" readonly="true"/></td>
		</tr>
		
		<tr>
		<td>NAME</td>
		<td><frm:input path="ename"/></td>
		</tr>
		
		<tr><td>JOB</td>
		<td><frm:input path="job"/></td>
		</tr>
		
		<tr><td>SALARY</td>
		<td><frm:input path="sal"/></td>
		</tr>
		
		<tr><td>DEPARTMENT NO</td>
		<td><frm:input path="deptno"/></td>
		</tr>
		
		<tr><td><input type="submit" value="submit"></td>
		</tr>
	</table>
	</frm:form>
	
	<a href="./">HOME</a>

</body>