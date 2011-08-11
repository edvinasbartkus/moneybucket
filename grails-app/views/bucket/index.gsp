<html>
  <head>
    <title>Buckets</title>
    <meta name="layout" content="main" />
  </head>
  <body>
    <g:each in="${buckets}" var="bucket">
    <h2>${bucket.name}</h2>
    </g:each>

    <g:link action="create">New bucket</g:link>
  </body>
</html>