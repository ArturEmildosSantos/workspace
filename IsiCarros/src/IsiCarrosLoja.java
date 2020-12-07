
public class IsiCarrosLoja {
	public static void main(String[] args) {
		
		// declaração do tipo de classe
		Carro c1, c2;
		
		// objetos iniciados da classe
		c1 = new Carro();
		c2 = new Carro();
		
		c1.marca = "Ford";
		c1.modelo = "Ka";
		c1.cor = "Azul";
		c1.ano = 2010;
		c1.preco = 30000.00;
		
		c2.marca = "GM";
		c2.modelo = "Vectra";
		c2.cor = "Prata";
		c2.ano = 2007;
		c2.preco = 31000.00;
		
		c1.print();
		c2.print();
		
	}
}
