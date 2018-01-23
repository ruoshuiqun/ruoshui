<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户更新</title>
</head>
<body>
  <form action="${pageContext.request.contextPath}/user2" method="post">
      <input type="hidden" name ="action" value="update"/>
    用户名:<input type="text" name="username" value="${command.username }" /><br/>
 真实姓名:<input type="submit" value="更新"/>   
  </form>
</body>
</html>