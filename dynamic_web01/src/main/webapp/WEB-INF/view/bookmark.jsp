<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, model.dto.BookmarkDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기</title>
</head>
<body>
	<div>
		<a href="./">메인으로</a>
	</div>
	<h2>즐겨찾기</h2>
	<form action="./bookmark" method="post">
		<div>
			<label>URL 주소:</label><input type="text" name="url">
		</div>
		<div>
			<label>별칭:</label><input type="text" name="name">
		</div>
		<div>
			<button type="submit">등록</button>
		</div>
	</form>
	<ul>
		<% for(BookmarkDTO d: (List<BookmarkDTO>)request.getAttribute("data")) { %>
			<li>
				<a href="<%=d.getUrl() %>"><%=d.getName() %></a>
				<button type="button" onclick="location.href='./bookmark/update?id=<%=d.getID() %>'">수정</button>
				<button type="submit" form="deleteForm<%=d.getID() %>">삭제</button>
				<form id="deleteForm<%=d.getID() %>" action="./bookmark/delete" method="post">
					<input type="hidden" name="id" value="<%=d.getID() %>">
				</form>
			</li>
		<% } %>
	</ul>
</body>
</html>