<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<body style ="background-color:black">
<div style="container">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Cosmos</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link " href="./">Home </a>
      <a class="nav-item nav-link" href="add">Register</a>
      <a class="nav-item nav-link active" href="page_report">Report</a>
    </div>
  </div>
</nav>
</div>
<div style="container" >
<h1 style="color:white;text-align:center">REPORT | PAGE: ${list.getNumber()+1}</h1>
<c:choose>
	<c:when test="${!empty list }">
	<table class="table table-hover table-dark table-bordered table-sm">
		<thead class="thead-light">
		<tr>
			<th>EMPNO</th>
			<th>ENAME</th>
			<th>JOB</th>
			<th>SAL</th>
			<th>DEPTNO</th>
			<th>EDIT/DELETE</th>
		</tr>
		</thead>
		<c:forEach var="emp" items="${list.getContent()}">
		<tbody>
		<tr>
		<td>${emp.empno}</td>
		<td>${emp.ename}</td>
		<td>${emp.job}</td>
		<td>${emp.sal}</td>
		<td>${emp.deptno}</td>
		<td><a href="emp_edit?no=${emp.empno}"><img src="images/edit.png" width="30px" height="30px"></a>
			<a href="emp_delete?no=${emp.empno}" onclick="return confirm ('Are you sure?')"><img src="images/del.png" width="30px" height="30px"></a></td>
		</tr></tbody>
		</c:forEach>
	</table>
	<center>
	<c:if test="${!list.isFirst()}">
	<a href="page_report?page=0" style="color:white;text-decoration: none">First</a>&nbsp;&nbsp;
	</c:if>
	<c:if test="${!list.isLast()}">
	<a href="page_report?page=${list.getNumber()+1}" style="color:white;text-decoration: none">Next</a>&nbsp;&nbsp;
	</c:if>
	<c:forEach var="i" begin="0" end="${list.getTotalPages()-1}" step="1">
	[<a href="page_report?page=${i}" style="color:white;text-decoration: none">${i+1}</a>]&nbsp;&nbsp;	
	</c:forEach>
	<c:if test="${!list.isFirst()}">
	<a href="page_report?page=${list.getNumber()-1}" style="color:white;text-decoration: none">previous</a>&nbsp;&nbsp;
	</c:if>
	<c:if test="${!list.isLast()}">
	<a href="page_report?page=${list.getTotalPages()-1}" style="color:white;text-decoration: none">Last</a>&nbsp;&nbsp;
	</c:if>
	</center>
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
	</div>

<<!-- ul class="nav justify-content-center">
 
  <li class="nav-item">
    <a class="nav-link" href="./">HOME</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="add">REGISTER</a>
  </li>
 
</ul> -->

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
