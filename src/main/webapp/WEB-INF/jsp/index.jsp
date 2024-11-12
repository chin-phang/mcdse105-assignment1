<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Homepage</title>
	<link href="/static/css/bootstrap.min.css" rel="stylesheet">
</head>
</head>
<body>
	<h2>Welcome to KA Inventory Management System!</h2>

	<div class="container">
		<ul>
			<li><a href="/about">About</a></li>
			<li><a href="/contact">Contact</a></li>
			<li><a href="/products">Products</a></li>
			<li><a href="/register">Register</a></li>
			<li><a href="/login">Login</a></li>
		</ul>
	</div>

	<footer style="margin-top: 20px;"><a href="/">KA Inventory System</a> &copy; 2024. Made with love in Penang.</footer>

	<script src="/static/js/bootstrap.bundle.min.js"></script>
</body>
</html>