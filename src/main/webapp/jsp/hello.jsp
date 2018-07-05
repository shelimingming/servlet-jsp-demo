<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/6
  Time: 1:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>hello jsp</title>
</head>
<body>
<!--html 注释-->
<%--jsp 注释--%>
<%="hello jsp"%><br/>
${'hello el'}<br/>
<f:formatDate value="<%=new Date()%>" pattern="yyyy-MM-dd hh-mm-ss"/><br/>
<%@include file="include.jsp"%>
<jsp:include page="include.jsp"/>
</body>
</html>
