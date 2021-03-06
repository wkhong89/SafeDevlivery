<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
* {
	margin: 0;
	padding: 0;
}

h1 {
	display: inline-block;
	width: 400px;
	text-align: center;
}

.main {
	position: absolute;
	width: 400px;
	height: 300px;
	left: 50%;
	top: 50%;
	margin-left: -200px;
	margin-top: -200px;
}

td {
	width: 200px;
}

.sub {
	width: 300px;
	margin-left: 50px;
}
.sub_right{
	text-align: center;
}
.space{
	font-size: 30px;
}
</style>
<meta charset="UTF-8">
<title>QR 안심택배</title>
</head>
<body>
	<div class="main">
		<form method="post" action="delivery.qr">
			<div class="left">
				<table>
					<tr>
						<td colspan="2"><hr></td>
					</tr>
					<tr>
						<td colspan="2"><h1>주문자 정보</h1></td>
					</tr>
					<tr>
						<td colspan="2">* 수령인과 정보가 같을 시 입력하지 않으셔도 됩니다.</td>
					</tr>
					<tr>
						<td colspan="2"><hr></td>
					</tr>
					<tr>
						<td><label>이름 </label></td>
						<td><input type="text" name="o_user"></td>
					</tr>
					<tr>
						<td><label>전화번호 </label></td>
						<td><input type="text" name="o_phone"></td>
					</tr>
				</table>
			</div>

			<div class="right">
				<table>
					<tr>
						<td colspan="2"><hr> </td>
					</tr>
					<tr>
					<td colspan ="2"><p class = "space">　</td>
					</tr>
					<tr><td colspan = "2"><hr></tr>
					<tr>
						<td colspan="2"><h1>수령인 정보</h1></td>
					</tr>
					<tr>
						<td><p class = "space"></td>
					</tr>
						<tr>
						<td colspan="2" class = "sub_right">비밀번호는 택배사에도 전해집니다. <br>또한 수령인이 주문자가 아닌 경우, <br>이 비밀번호를 이용하여 정보 확인이 가능합니다.</td>
					</tr>
					<tr>
						<td colspan="2"><hr></td>
					</tr>
					<tr>
						<td><label>이름 </label></td>
						<td><input type="text" name="r_user"></td>
					</tr>
					<tr>
						<td><label>주소 (시, 동, 읍, 면)</label></td>
						<td><input type="text" name="r_address"></td>
					</tr>
					<tr>
						<td><label>상세주소</label></td>
						<td><input type="text" name="r_sub_add"></td>
					</tr>
					<tr>
						<td><label>전화번호 </label></td>
						<td><input type="text" name="r_phone"></td>
					</tr>
					<tr>
						<td><label>상품이름</label></td>
						<td><input type="text" name="product"></td>
					</tr>
					<tr>
						<td><label>비밀번호 </label></td>
						<td><input type="password" name="passwd"></td>
					</tr>
				<tr><td colspan = "2"><hr></tr>
				</table>
			</div>
			<br>
			<div>
				<input type="submit" value="신청하기" class="sub">
			</div>
		</form>
	</div>
</body>
</html>