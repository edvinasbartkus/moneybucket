<html>
  <head>
    <title>New bucket</title>
    <meta name="layout" content="main" />
  </head>
  <body>
    <g:form action="save">
      <g:if test="${bucket?.id}">
        <g:hiddenField name="id" value="${bucket.id}" />
      </g:if>

      <g:textField name="name" value="${bucket?.name}" />
      <g:submitButton value="Save" />
    </g:form>
  </body>
</html>