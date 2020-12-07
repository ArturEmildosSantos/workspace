
public class LojaVirtual {
	public static void main(String[] args) {
		Produto e1,e2,e3;
		
		e1 =  new Produto();
		e2 = new Produto();
		e3 = new Produto();
		
		e1.setCodBarras(5656);
		e1.setProduto("batata");
		e1.setPreco(10.00);
		e1.setDepart("Feira");
		
		e2.setCodBarras(8888);
		e2.setProduto("uva");
		e2.setPreco(20.00);
		e2.setDepart("Feira");
		
		e3.setCodBarras(4545);
		e3.setProduto("laranja");
		e3.setPreco(1.00);
		e3.setDepart("Feira");
		
		
		
		System.out.println("-----> BlackFriday....");
		e1.imprimir();
		System.out.print("-----> Por apenas");
		System.out.println(e1.desconto(10.0));
		e2.imprimir();
		System.out.print("-----> Por apenas");
		System.out.println(e2.desconto(10.0));
		e3.imprimir();
		System.out.print("-----> Por apenas");
		System.out.println(e3.desconto(10.0));
		
	}
	
}
