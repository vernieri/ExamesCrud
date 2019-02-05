<html>
<head>
<title>Registro</title>
<style type="text/css">
.button-register {background-color: green;color: white;}
.button-report {background-color: #000000;color: white;margin-left: 30%;}
</style>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">	
</head>
<body>
	<h2>Struts 2 CRUD USANDO JDBC</h2>
	<a href="report"><button class="button-report" type="button">Report</button></a>
	<s:form action="registeruser.action" method="post">
		<s:textfield label="NOME COMPLETO" name="unome" />
		<s:textfield label="CPF" name="ucpf" />
		<s:password label="NOTA" name="unota" />
		<s:textfield label="CARGO" name="ucargo" />
		<s:submit cssClass="button-register" value="Resgister" />
	</s:form>
	<s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
</body>
</html>
