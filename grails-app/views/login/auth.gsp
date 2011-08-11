<html>
<head>
	<meta name='layout' content='main' />
	<title><g:message code="springSecurity.login.title" /></title>
</head>

<body>
	<g:form action="${postUrl}" method="POST">
		<g:textField name="j_username" />
		<g:passwordField name="j_password" />

		<g:submitButton value="Login" />
	</g:form>
</body>
</html>