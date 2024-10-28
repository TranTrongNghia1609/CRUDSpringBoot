<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h2>${category.isEdit ? 'Edit category': 'Add New Category'}</h2>
<form action="${pageContext.request.contextPath }/admin/categories/save" method="post">
	<input type ="hidden" value="${category.isEdit}" name = "isEdit">
	<input type ="hidden" value="${category.id}" name = "id">
	<label> Category Name:</label><br>

	<input type="text" name="name" value="${category.name}"><br>

	
	<label>Images: </label><br>
	<input type="text" name="images" value="${category.images}"><br>
	<%--<div style="width:100px; height:100px">
	<img alt="images" id="imagess" src="" width="150px" height="150px" /> 
	</div><br>
	Nhập link: <input type="text" id="images1" name="images1"><br>
	Hoặc tải file:
	<input type="file" onchange="chooseFile(this)" id="images" name="images"><br>--%>
	
	<label>Status: </label><br>
	<input type="text" name="status" value="${category.status}"><br>
	<%--<input id="statuson" type="radio" name="status" value="1" ${cate.status==1?'checked': ''}>
	<label for="statuson">Hoạt động</label>
	<input id="statusoff" type="radio" name="status" value="0" ${cate.status==0?'checked': ''}>
	<label for="statusoff">Khóa</label>--%>
	
	<br> <input type="submit" value="Submit">
</form>
  