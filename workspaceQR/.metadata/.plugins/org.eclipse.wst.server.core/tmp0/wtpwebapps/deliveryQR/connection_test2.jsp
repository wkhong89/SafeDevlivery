<%@page import="org.apache.jasper.tagplugins.jstl.core.Catch"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="OracleConnection.jsp"%>
<%@ page import="java.util.*,java.text.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.net.URLEncoder"%>
<%@ page import="org.json.simple.*"%>
<%
	int userid = Integer.parseInt(request.getParameter("userid"));
	String name = request.getParameter("name");
	try {
		sql = "update  DELIVERYPART set delivery_android = ?, num = up_of_seq2.nextval where num = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setInt(2, userid);
		int success = pstmt.executeUpdate();
		
		/* sql = "delete from deliverypart where android_id is null";
		 pstmt = con.prepareStatement(sql);
		success = pstmt.executeUpdate(); */

	} catch (SQLException se) {
		out.println(se.getMessage());
	} finally {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}
%>
