
public class Produto {

		private int codBarras;
		private String produto;
		private double preco;
		private String depart;
 
		
		
		public int getCodBarras() {
			return codBarras;
		}

		public void setCodBarras(int codBarras) {
			this.codBarras = codBarras;
		}

		public String getProduto() {
			return produto;
		}

		public void setProduto(String produto) {
			this.produto = produto;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public String getDepart() {
			return depart;
		}

		public void setDepart(String depart) {
			this.depart = depart;
		}

		void imprimir() {
			System.out.println("Codigo de barra : "+codBarras);
			System.out.println("Produto : "+produto);
			System.out.printf("Preco R$ %.2f%n", preco);
			System.out.println("Departamento :"+depart);
		}
		
		double desconto (double percentual) {
			 return  preco - preco*percentual/100;

		}
}
