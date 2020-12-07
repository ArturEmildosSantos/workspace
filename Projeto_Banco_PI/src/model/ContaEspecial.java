package model;

public class ContaEspecial extends Conta {
	private double Limite;

	
		public boolean debitar (double valor) {
			if (super.saldo + Limite >= valor) {
				super.saldo = saldo -valor;
				return true;
			}
			else {
				System.out.println("Saldo Insuficiente para sacar conta especial :"+valor );
				return false;
			}
		}
	
	
		public String toString() {
			return "Conta Especial :"+super.numeroConta+"/" +super.nomeTitular+"(" +
					super.cpf+") R$"+String.format("%.2f",super.saldo)+" Limite : R$"+(this.Limite);
		}
		
	
	public double getLimite() {
		return Limite;
	}

	public void setLimite(double limite) {
		Limite = limite;
	}
	
			
}

	
	
	


