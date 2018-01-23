<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户新增</title>
</head>
<body>
  <form action="${pageContext.request.contextPath}/user2" method="post">
        用户名:<input type="text" name="username" value="$command.username" /><br/> 
   真实姓名:<input type="text" name="realname" value="${command.realname}"/>
   <input type="submit" name="create" value="新增"/>
  </form> 
</body>
</html>