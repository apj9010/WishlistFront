<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Wishlist</title>
</head>
<body>
	
		<form action="removeItems" method="get">
			<table border=1px solid black>
				<tr>
					<th colspan="4">Wishlist</th>
				</tr>
				<%-- <c:forEach items="${wishlist }" var="wishlist"> --%>
				<tr>
					<td>
						Wishlist Id: <br/> ${wishlist.wishlistId}
					</td>
					<c:forEach items="${wishlist.product }" var="wishlist.product">
					<td>
						Product Name <br /> ${wishlist.product.productName}
					</td>
					<td>
						Product price <br />${wishlist.product.price}
					</td>
					<td>
						Product Image <br />${wishlist.product.imageId}
					</td>
					<td>
						<input type="submit" value="Remove">
					</td>
					</c:forEach>					
				</tr>
				
			</table>
		</form>
</body>
</html>