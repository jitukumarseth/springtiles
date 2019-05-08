<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JLCLayout</title>
</head>
<body>
	<table width="90%" height="90%">
		<tr height="10%">
			<td colspan="3" bgcolor="purple" align="center"><tiles:insertAttribute
					name="HEADER" /></td>
		</tr>

		<tr height="80%">
			<td width="20" bgcolor="orange" align="left"><tiles:insertAttribute
					name="LMENU"></tiles:insertAttribute></td>

			<td width="80" bgcolor="lightgray" align="center"><tiles:insertAttribute
					name="BODY"></tiles:insertAttribute></td>
		</tr>

		<tr height="10%">
			<td colspan="3" bgcolor="purple" align="center"><tiles:insertAttribute
					name="FOOTER"></tiles:insertAttribute></td>
		</tr>

	</table>
</body>
</html>