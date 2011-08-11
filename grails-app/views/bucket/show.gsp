<html>
  <head>
    <title>${bucket?.name}</title>
    <meta name="layout" content="main" />
  </head>
  <body>
    <h1>${bucket?.name}</h1>
    <div class="members">
      <g:each in="${bucket.members}" var="member">
        ${member.user.toString()}
      </g:each>
    </div>
  </body>
</html>