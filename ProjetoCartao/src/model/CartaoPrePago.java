package model;

public class CartaoPrePago {

	protected String numeroCartao;
	protected String nomeTitular;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	
	public CartaoPrePago(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade) {
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = 0.0;
	}
	
	public void adicionarCredito (double valor) {
		this.saldo += valor;
	}
	
	


	public String toString() {
		return "CartaoPrePago [numeroCartao=" + numeroCartao + ", nomeTitular=" + nomeTitular + ", anoValidade="
				+ anoValidade + ", mesValidade=" + mesValidade + ", saldo=" + saldo + "]";
	}

	public double debito (double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return saldo;
		}
		else {
			System.out.println("Saldo insuficiente"+String.format("%.2f",saldo));
			return saldo;
		}
	}
	
	
	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}

	public int getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	
	
	
	
}
