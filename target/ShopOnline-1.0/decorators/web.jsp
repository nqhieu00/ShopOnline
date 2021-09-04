<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<title><dec:title default="Trang chu"/></title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="<c:url value='/template/web/assets/favicon.ico' />" />
<!-- Bootstrap icons-->
<link
	href="<c:url value='https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet' />"  />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="<c:url value='/template/web/css/styles.css" rel="stylesheet'/>" />
</head>
<body>
	<%@ include file="/common/web/header.jsp" %>
	<div class="container">
		<dec:body/>
	</div>
	<%@ include file="/common/web/footer.jsp" %>
	<script src="<c:url value='https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js'/>"></script>
        <!-- Core theme JS-->
    <script src="<c:url value='/template/web/js/scripts.js'/>"></script>
</body>
</html>