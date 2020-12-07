package model;

public class CartaoCashBack extends CartaoPrePago {

	private int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo=tipo;
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean comprar (double valor) {
		if(super;saldo >= valor) {
			
		}
		if (this.tipo == 0) {
			super.saldo += valor * 0.08/100;
			return saldo;
		}
		else if (this.tipo == 1) {
			super.saldo += valor * 0.05/100;
			return saldo;
		}
		else if (this.tipo == 2){
			super.saldo += valor * 0.02/100;
			return saldo;
		}
		return valor;
	}
		
}
