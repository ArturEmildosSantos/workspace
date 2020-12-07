package model;

public class Bombas {
	private double qtdLitro;
	private double preco;
	private String tipo;
	private double total;
	
	public Bombas(String nome, double precoC) {
		 this.tipo = nome;
		 this.preco = precoC;
		
	}
	
	public double getLitro() {
		return qtdLitro;
	}
	public void setLitro(int qtdLitro) {
		this.qtdLitro = qtdLitro;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void totallitro (double totallitro) {
		total = totallitro * preco;
		
	}
	
	public void totaldinheiro (double totaldinheiro) {
		total = totaldinheiro / preco;
		
	}

	public String recibo () {
		String recibo = "==========================================\n"+
                " I S I D R O C O R P - Gas & Energy       \n"+
		        "------------------------------------------\n"+
                " Recibo de Pagamento \n"+
		        " Combustivel: "+tipo+"\n"+
                " Preço do Litro   R$ "+String.format("%.3f",this.preco)+"\n"+
		        " Litros Abastecidos: "+String.format("%.3f",this.qtdLitro) +"\n"+
                " Total a Pagar    R$ "+String.format("%.2f",this.total)+"\n"+
		        "==========================================";
return recibo;	
	}
}


