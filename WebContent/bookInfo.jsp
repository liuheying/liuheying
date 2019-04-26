<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.4.3/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.4.3/themes/default/easyui.css">
<script type="text/javascript" src="js/jquery-easyui-1.4.3/jquery.min.js"></script>
<script type="text/javascript"
	src="js/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="js/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
	
<script type="text/javascript">
	 $(function() {
		 searchBook();
		$("#bookId").combobox({
			url:'selectCategroy',
			method:'post',
			valueField:'categoryId',//填充进 <option value='id'>text</option>    
			textField:'cname'//标签中间（<option>text</option>）   

		})
	})
	function searchBook() {
       var CategoryBook=$("#bookId").combobox('getValue');
		if(CategoryBook=="--请选择书籍类型--"){
			CategoryBook='';
		}
		$("#tab").datagrid({
			url : 'showBooks',
			method : 'post',
			fitColumns : true,
			pagination : true,
			singleSelect : true,
			toolbar:"#bookTool",
			queryParams:{
				bname:$("#bname").val(),
				startPrice:$("#startPrice").val(),
				endPrice:$("#endPrice").val(),
				categoryId:CategoryBook
			}

		});
		/* 重置表格 */
		$("#tb-frm").form("reset");
	}
	
	function formatterCaozuo(value,row,index) {
		return "<a href='javascript:void(0)' onclick='updateBook("+index+")'>修改</a>  <a href='javascript:void(0)' onclick='delBook("+index+")'>删除</a>"
	}
	
	function formatterCategory(value,row,index) {
		return value.cname;
	}
	
	
	
</script>
	
</head>
<body>
<div id="bookTool">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="addBook()">添加</a>
		<form id="tb-frm" class="easyui-form">
			<label for="name">名称:</label> 
			<input class="easyui-validatebox"
				type="text" id="bname" name="bname" data-options="required:true" />
			<label for="price">价格:</label>   
			<input class="easyui-textbox" type="text" id="startPrice" name="startPrice" data-options="required:true">~
			<input class="easyui-textbox" type="text" id="endPrice" name="endPrice" data-options="required:true"> 
			<label for="categoryId">书籍类型:</label> 
			<!-- 下拉列表 -->
			<select id="bookId" class="easyui-combobox">
				<option selected="selected" >--请选择书籍类型--</option>
			</select>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-search'" onclick="searchBook()">搜索</a>
		</form>
	</div>
	<div>
		  <table id="tab" class="easyui-datagrid">
			<thead>
				<tr>
					<th data-options="field:'id'">编号</th>
					<th data-options="field:'name'">名称</th>
					<th data-options="field:'price'">价格</th>
					<th data-options="field:'writer'">作者</th>
					<th data-options="field:'describtion'">介绍</th>
				    <th data-options="field:'CategoryBook',formatter:formatterCategory">书籍类型</th>
				    <th data-options="field:'caozuo',title:'操作',formatter:formatterCaozuo"></th>
				</tr>
			</thead>
		</table>
	</div>
</body>
</html>