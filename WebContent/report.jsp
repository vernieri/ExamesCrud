<html>
<head>
<title>Report</title>
<style>
table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 60%;}
th {height: 30px;}
.button-update {background-color: #008CBA;color: white;}
.button-delete {background-color: red;color: white;}
</style>
</head>
<body>
	<h2>Struts 2 CRUD USANDO JDBC</h2>
	<div style="margin-top: 40px;">
		<s:if test="noData==true">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>Sr.No.</th>
						<th>Nome</th>
						<th>CPF</th>
						<th>Nota</th>
						<th>Cargo</th>
						<th>Action</th>
					</tr>
				</thead>
				<s:iterator value="beanList">
					<tr>
						<td><s:property value="srNo" /></td>
						<td><s:property value="unome" /></td>
						<td><s:property value="ucpf" /></td>
						<td><s:property value="unota" /></td>
						<td><s:property value="ucargo" /></td>
						<td>
							<a href="updatedetails.action?submitType=updatedata&uemail=<s:property value="ucpf"/>">
								<button class="button-update">Update</button>
							</a>
							<a href="deleterecord.action?uemail=<s:property value="ucpf"/>">
								<button class="button-delete">Delete</button>
							</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
		<s:else>
			<div style="color: red;">Nenhum Dado encontrado!.</div>
		</s:else>
	</div>
</body>
</html>
