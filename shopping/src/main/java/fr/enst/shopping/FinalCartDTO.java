package fr.enst.shopping;

import java.util.ArrayList;

public class FinalCartDTO {
	private ArrayList<ShoppingCartItemDTO> cartItems;
	private double total;

	public void setCartItems(ArrayList<ShoppingCartItemDTO> carts) {
		// TODO Auto-generated method stub
		cartItems.clear();
		for(ShoppingCartItemDTO sci : carts){
			cartItems.add(sci);
		}
		
	}

	public void setTotal(double total) {
		// TODO Auto-generated method stub
		this.total = total;
	}

}
