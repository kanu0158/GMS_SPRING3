<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- jstl.jar 사용하기 위해 한 것 -->
<!doctype html>
<html lang="en">
<body>
<div id="wrapper">
	<div id="header">
	</div> 	<!-- header end -->
	<div id="content">
	이동페이지 : ${pageName}
	<c:choose>
		<c:when test="${pageName eq 'add'}">
			<jsp:include page="add.jsp"></jsp:include>
		</c:when>
		<c:when test="${pageName eq 'login'}">
			<jsp:include page="login.jsp"></jsp:include>
		</c:when>
		<c:when test="${pageName eq 'search'}">
			<jsp:include page="search.jsp"></jsp:include>
		</c:when>
		<c:when test="${pageName eq 'remove'}">
			<jsp:include page="remove.jsp"></jsp:include>
		</c:when>
		<c:when test="${pageName eq 'modify'}">
			<jsp:include page="modify.jsp"></jsp:include>
		</c:when>
		<c:otherwise>
			<jsp:include page="retrieve.jsp"></jsp:include>
		</c:otherwise>
	</c:choose>
	</div> <!-- content end -->
	<div id="footer">
	</div>
</div>
<script> 
member.main({
		context : '${context}',
		pageName : '${pageName}',
		result : '${result}',
		userId : '${user.userId}',
		userPass : '${user.password}',
		teamId : '${user.teamId}',
		roll : '${user.roll}'
		});
</script>
</body>
</html>