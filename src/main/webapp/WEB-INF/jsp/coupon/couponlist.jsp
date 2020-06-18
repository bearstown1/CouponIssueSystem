<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="css/main.css" />
<title>쿠폰발급정보</title>
</head>
<body>
	<%@ include file="/WEB-INF/jsp/common/top.jsp"%>
	<section>
	<div class="inner">
		<br>
		<h1>내가 발급한 쿠폰 리스트</h1>
		<div class="table-wrapper">
			<table>
				<thead>
					<tr>
						<th>Number</th>
						<th>Name</th>
						<th>Price</th>
						<th>button</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Item 1</td>
						<td>후라이드치킨 할인쿠폰</td>
						<td>11,000</td>
						<td><a href="#" class="button alt small">쿠폰수정</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a
							href="#" class="button alt small">쿠폰삭제</a></td>
					</tr>
					<tr>
						<td>Item 2</td>
						<td>양념치킨 할인쿠폰</td>
						<td>13,000</td>
						<td><a href="#" class="button alt small">쿠폰수정</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a
							href="#" class="button alt small">쿠폰삭제</a></td>
					</tr>
					<tr>
						<td>Item 3</td>
						<td>간장치킨 할인쿠폰</td>
						<td>12,000</td>
						<td><a href="#" class="button alt small">쿠폰수정</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a
							href="#" class="button alt small">쿠폰삭제</a></td>
					</tr>
					<tr>
						<td>Item 4</td>
						<td>파닭치킨 할인쿠폰</td>
						<td>9,000</td>
						<td><a href="#" class="button alt small">쿠폰수정</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a
							href="#" class="button alt small">쿠폰삭제</a></td>
					</tr>
					<tr>
						<td>Item 5</td>
						<td>어니언치킨 할인쿠폰</td>
						<td>8,000</td>
						<td><a href="#" class="button alt small">쿠폰수정</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a
							href="#" class="button alt small">쿠폰삭제</a></td>
					</tr>
				</tbody>

			</table>
		</div>
		</div>
	</section>

</body>
</html>