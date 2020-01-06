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
<f:form action="list" method="post" modelAttribute="g" enctype="multipart/form-data">
	关键字：<f:input path="gjz"/>
	描述：<f:input path="ms"/><br>
	编号：<f:input path="id"/>
	公司名称：<f:input path="gsmc"/><br>
	主营产品：<f:input path="ztcp"/>
	地址：<f:input path="dz"/>
	注册资本（万元）<f:input path="zczb"/>
	成立时间：<f:input path="clsj" readonly="readonly" onclick="WdatePicker()"/><br>
	年检日期：<f:input path="njrq" readonly="readonly" onclick="WdatePicker()"/>
	年检状态:<select name="nkzt">
		<option value="通过">通过</option>
		<option value="不通过">不通过</option>
		<option value="待定">不通过</option>
	</select><br>
	备注：<input type="text" style=" width: 200px;height: 100px;" value="各种资料齐全，合规">
	<input type="button" value="提交" onclick="aaa()">
</f:form>
<script type="text/javascript">
	function aaa() {
		alert("审核成功");
		location="list";
	}
</script>
</body>
</html>