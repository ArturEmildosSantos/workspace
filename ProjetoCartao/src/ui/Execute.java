package ui;

import model.CartaoCashBack;
import model.CartaoPrePago;


public class Execute {
	public static void main(String[] args) {
		
		CartaoPrePago c1 = new CartaoPrePago ("4444", "Artur Emil", 2022, 8, 100.00);
		CartaoCashBack c2 = new CartaoCashBack ("4444CB", "Artur Emil", 2022, 8, 0,0);
		
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		
		
		
		
		
		
		
		
	}

}
