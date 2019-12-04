<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" href="css/index3.css">
</head>
<body>
<form action="list" method="post">
<table>
	<tr>
		<td>编号</td>
		<td>电影名字</td>
		<td>地址</td>
		<td>日期</td>
	</tr>
	<c:forEach items="${list}" var="list">
	<tr>
		<td>${list.cid}</td>
		<td>${list.cname}</td>
		<td>${list.trademark}</td>
		<td>${list.rent}</td>
		<td><img alt="找不到" src="${list.picurl}"></td>
	</tr>
	</c:forEach>
	<tr>
 	<td colspan="10">
	<button name="pageNum" value="1" >首页</button> 
          <button name="pageNum" value="${page.prePage==0?1:page.prePage }"  >上一页 </button> 
       	  <button name="pageNum" value="${page.nextPage==0?page.pages:page.nextPage }">下一页</button> 
           <button name="pageNum" value="${page.pages}" >尾页</button>
	</td>  
	</tr>
</table></form>
</body>
</html>