<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%= request.getContextPath() %>/css/css.css" rel="stylesheet"type="text/css"/>
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.validate.js"></script>
</head>
<body>
<form action="list" method="post">
	编号：<input type="text" name="id" value="${v.id }">
	关键字：<input type="text" name="gjz" value="${v.gjz }">
	描述：<input type="text" name="ms" value="${v.ms }"> 
	公司名称：<input type="text" name="gsmc" value="${v.gsmc }"> 
	主营产业：<input type="text" name="zycp" value="${v.zycp }"><br> 
	地址：<input type="text" name="dz" value="${v.dz }"><br> 
	注册资本：<input type="text" name="z1" value="${v.z1 }">至<input type="text" name="z2" value="${v.z2 }">
	成立日期：<input type="text" name="d2" value="${v.d2 }" readonly="readonly" onclick="WdatePicker()">至<input type="text" name="d1" value="${v.d1 }" readonly="readonly" onclick="WdatePicker()">
	<input type="submit" value="查询">
</form>
<table>
	<tr>
		<td>编号</td>
		<td>关键字</td>
		<td>描述</td>
		<td>公司名称</td>
		<td>主营产品</td>
		<td>地址</td>
		<td>注册资本</td>
		<td>成立日期</td>
		<td>年检日期</td>
		<td>年检状态</td>
		<td>备注</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${list }" var="s">
		<tr>
			<td>${s.id }</td>
			<td>${s.gjz }</td>
			<td>${s.ms }</td>
			<td>${s.gsmc }</td>
			<td>${s.ztcp }</td>
			<td>${s.dz }</td>
			<td>${s.zczb }</td>
			<td>${s.clsj }</td>
			<td>${s.njrq }</td>
			<td>${s.nkzt }</td>
			<td></td>
			<td><a href="toUpdate?id=${s.id }">年检审核</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>