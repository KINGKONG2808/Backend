package com.dev;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.dev.beans.Cart;
import com.dev.entities.Post;

public class CartUtils {
	private CartUtils() {
	}

	@SuppressWarnings("unchecked")
	public static void checkCart(Post post, HttpServletRequest request) {
		Integer productId = post.getId();

		// 1. Lấy danh sách sản phẩm trong giỏ hàng từ SESSIOn.
		List<Cart> carts = new ArrayList<Cart>();
		HttpSession httpSession = request.getSession();
		if (httpSession.getAttribute("giohang") != null) {
			carts = (List<Cart>) httpSession.getAttribute("giohang");
		}

		// 2. kiểm tra sản phẩm đã có trong giỏ hàng chưa?
		boolean isExists = false;
		for (Cart cart : carts) {
			if (cart.getProductId() == productId) {
				isExists = true;
				break;
			}
		}

		// 3.
		if (!isExists) { // nếu chưa có trong giỏ hàng thì thêm mới.
			Cart cart = new Cart();
			cart.setProductId(productId);
			cart.setCategoryName(post.getCategory().getName());
			cart.setPrice(post.getPrice());
			cart.setProductName(post.getTitle());
			cart.setQuality(1.0d);
			carts.add(cart);
		} else { // ngược lại cộng thêm số lượng cho sản phẩm đó.
			for (Cart cart : carts) {
				if (cart.getProductId() == productId) {
					cart.setQuality(cart.getQuality() + 1);
					break;
				}
			}
		}

		httpSession.setAttribute("giohang", carts);
	}
}
