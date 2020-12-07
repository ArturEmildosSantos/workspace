package model;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected double saldo;
	
	public String toString() {
		return "Conta: "+numeroConta+" / "+nomeTitular+"("+cpf+")R$ " +String.format("%.2f",saldo);
	}
	
	public void credito(double valor) {
		this.saldo += valor;
	
	}
	
	public boolean debitar (double valor) {
		if (this.saldo >= valor ) {
			this.saldo -= valor;
			return true;
		}
		else {
				System.out.println("Saldo Insuficiente para sacar :"+valor );
				return false;
		}
	}
	
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}

	
	
	public String MostrarDadosdaConta() {
		String resultado = "Numero da Conta : " +numeroConta+  " Titular :"  +nomeTitular+ " CPF :" +cpf+ " Saldo" +saldo;
		return resultado;
	}
	


}

	


