<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<title>ItemDetail画面</title>

	<style type="text/css">

	body{
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana, Helvetica, sans-serif;
	font-size:12px;
	color:#333;
	background:#fff;
	}

	table{
	text-align:center;
	margin:0 auto;
	}

	#top{
	width:780px;
	margin:30px auto;
	border:1px solid #333;
	}

	#header{
	width:100%;
	height:80px;
	background-color:black;
	}

	#main{
	width:100%;
	height:500px;
	text-align:center;
	}

	#footer{
	width:100%;
	height:80px;
	background-color:black;
	clear:both;
	}

	#text-right{
	display: inline-block;
	text-align: right;
	}
	</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>ItemDetail</p>
		</div>
		<div>
<%-- 		<s:if test ="itemDetail == null">
			<h3>商品情報はありません。</h3>
		</s:if>
		<s:elseif test="message == null"> --%>
			<h3>商品情報は以下になります。</h3>
			<table border="1">

				<tr>
				<th scope="row">商品名</th>
				<td><s:property value="%{#session.item_name}"/></td>
				</tr>

				<tr>
				<th scope="row">値段</th>
				<td><s:property value="%{#session.item_price}"/>円</td>
				</tr>

				<tr>
				<th scope="row">在庫数</th>
				<td><s:property value="%{#session.item_stock}"/>個</td>
				</tr>

				<tr>
				<th scope="row">登録日</th>
				<td><s:property value="%{#session.insert_date}"/></td>
				</tr>

				<tr>
				<th scope="row">更新日</th>
				<td><s:property value="%{#session.update_date}"/></td>
				</tr>


			</table>

				<%-- <s:form action="ItemDetailAction">
				<input type="hidden" name="deleteFlg" value="1">
				<s:submit value="一括削除" method="delete"/>
				<s:submit value="更新" method="reload"/>
				<s:submit value="削除" method="delete"/>
				</s:form> --%>

		<%-- </s:elseif> --%>
		<s:if test="message != null">
			<h3><s:property value ="message"/></h3>
		</s:if>
		<div id="text-right">

			<p>管理者画面に戻る場合は<a href='<s:url action="AdminAction" />'>こちら</a></p>
			<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
			<p>ログアウトする場合は<a href='<s:url action="LogoutAction"/>'>こちら</a></p>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>