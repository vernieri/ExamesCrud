<html>
<head>
<title>Update</title>
</head>
<body>
	<h2>Struts 2 CRUD USANDO JDBC</h2>
	<form action=updatedetails method="post">
		<pre>
<b>Nome:         </b><input type="text" name="unome" value='<s:property value="unome"/>'>
		
		
<b>CPF:        </b><input type="ecpf"  name="ucpf" value='<s:property value="ucpf"/>'>
		            <input type="hidden" name="ucpfhidden" value='<s:property value="ucpf"/>'>
		
<b>NOTA:     </b><input type="nota" name="unota" value='<s:property value="unota"/>'>
		
		
<b>Cargo:  </b><input type="text" name="ucargo" value='<s:property value="ucargo"/>'>
		
		<button name="submitType" value="update" type="submit">Update</button>
		</pre>
	</form>
	<s:if test="ctr>0">
		<span style="color: red;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
</body>
</html>
