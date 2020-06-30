<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!doctype html>
<html lang="en">
<head>
<tiles:insertAttribute name="header"/>
</head>
<body>
<div id="wrapper">
<tiles:insertAttribute name="navigator"/>
<section>
	<article>
		<tiles:insertAttribute name="noTemplate"/>
	</article>
</section>
</div>	
</body>
</html>