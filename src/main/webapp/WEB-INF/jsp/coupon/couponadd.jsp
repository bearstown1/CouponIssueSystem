<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="css/main.css" />
<title>쿠폰등록</title>
</head>
<body>
<%@ include file="/WEB-INF/jsp/common/top.jsp"%>
		<!-- Main -->
			<section id="main">
				<div class="inner">
					<header class="major special">
						<h1>쿠폰등록</h1>
					</header>

					<section>
							<h3>쿠폰정보 입력</h3>
							<form method="post" action="#">
								<div class="row uniform 50%">
									<div class="4u 12u$(xsmall)">
										<input type="text" name="demo-name" id="demo-name" value="" placeholder="쿠폰 이름" />
									</div>
									<br>
									<br>
									<div class="4u 12u$(xsmall)">
										<input type="email" name="demo-email" id="demo-email" value="" placeholder="쿠폰 내용" />
									</div>
									<br>
									<br>
									<div class="4u 12u$(xsmall)">
										<input type="text" name="demo-email" id="demo-text1" value="" placeholder="쿠폰 사용가능시간" />
									</div>
									<br>
									<br>
									<div class="4u 12u$(xsmall)">
										<input type="text" name="demo-email" id="demo-text1" value="" placeholder="쿠폰 개수" />
									</div>
									<br>
									<br>
									<div class="4u 12u$(xsmall)">
										<input type="text" name="demo-email" id="demo-text1" value="" placeholder="쿠폰 원래가격" />
									</div>
									<br>
									<br>
									<div class="4u 12u$(xsmall)">
										<input type="text" name="demo-email" id="demo-text1" value="" placeholder="쿠폰 할인가격" />
									</div>
									<br>
									<br>
									
									<div class="12u$">
										<textarea name="demo-message" id="demo-message" placeholder="유의사항" rows="6"></textarea>
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