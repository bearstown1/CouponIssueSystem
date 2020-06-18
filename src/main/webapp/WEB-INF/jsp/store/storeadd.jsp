<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="css/main.css" />
<title>매장등록</title>
</head>
<body>
		<%@ include file="/WEB-INF/jsp/common/top.jsp"%>
		<!-- Main -->
			<section id="main">
				<div class="inner">
					<header class="major special">
						<h1>매장등록</h1>
					</header>

					<section>
							<h3>매장정보 입력</h3>
							<form method="post" action="#">
								<div class="row uniform 50%">
									<div class="4u 12u$(xsmall)">
										<input type="text" name="demo-name" id="demo-name" value="" placeholder="매장 이름" />
									</div>
									<br>
									<br>
									<div class="4u 12u$(xsmall)">
										<input type="email" name="demo-email" id="demo-email" value="" placeholder="매장 번호" />
									</div>
									<br>
									<br>
									<div class="4u 12u$(xsmall)">
										<input type="text" name="demo-email" id="demo-text1" value="" placeholder="매장 운영시간" />
									</div>
									<br>
									<br>
									<div class="4u 12u$(xsmall)">
										<input type="text" name="demo-email" id="demo-text1" value="" placeholder="매장 사진등록칸 예정" />
									</div>
									<div class="12u$">
										<textarea name="demo-message" id="demo-message" placeholder="도로명주소api 및 주소api 들어갈 예정" rows="6"></textarea>
									</div>
									<div class="12u$">
										<ul class="actions">
											<li><input type="submit" value="등록" class="special" /></li>
											<li><input type="reset" value="되돌아가기" /></li>
										</ul>
									</div>
								</div>
							</form>
						</section>

				</div>
			</section>

		<!-- Scripts -->
			<script src="js/jquery.min.js"></script>
			<script src="js/skel.min.js"></script>
			<script src="js/util.js"></script>
			<script src="js/main.js"></script>
	
</body>
</html>