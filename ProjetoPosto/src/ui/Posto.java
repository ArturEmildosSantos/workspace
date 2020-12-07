package ui;

import model.Bombas;

public class Posto {
	public static void main(String[] args) {
		
		Bombas b1;
		
		
		
		b1 = new Bombas("Diesel" , 5.00 );
		
		b1.totallitro(50.00);
		System.out.println(b1.recibo());
		
		System.out.println("\n");
		
		b1.totaldinheiro(30.00);
		System.out.println(b1.recibo());
	}
}
