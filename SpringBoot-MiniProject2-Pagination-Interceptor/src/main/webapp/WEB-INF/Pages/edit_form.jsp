<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

<style>
td{
padding:40px;
}
input[type=text]{
background-color:black;
color:white;
border:none;
}
</style>
<body style="background-color:black">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Cosmos</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link " href="./">Home</a>
      <a class="nav-item nav-link active" href="add">Register</a>
      <a class="nav-item nav-link" href="page_report">Report</a>
    </div>
  </div>
</nav>
<h1 style="color:white;text-align:center">EDIT PAGE</h1>
	<frm:form modelAttribute="emp">
	<table class="table table-hover table-dark table-sm" style="text-align:left ;width:40%; margin:auto;">
	<tr>
		<td >EMP ID</td>
		<td ><frm:input path="empno" readonly="true"/></td>
		</tr>
		
		<tr >
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
	</table>
	<div style="text-align:center;margin-top:10px" >
	<input type="submit" value="submit" style="background-color:black;color:white; padding-left:10px;padding-right:10px">
	</div>
	</frm:form>
	
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>