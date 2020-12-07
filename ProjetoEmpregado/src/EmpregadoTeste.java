
public class EmpregadoTeste {
	public static void main(String[]args) {
		Empregado e1 =  new Empregado();
		
		e1.nome = "Artur";
		e1.cargo = "Suporte";
		e1.salario = 1000.00;
		
		System.out.println("-----> Salario antes do aumento....");
		e1.imprimir();
		
		System.out.println("-----> Aumentando salario em 15%");
		e1.aumentarSalario(15.0);
		
		System.out.println("-----> Salario depois do aumento....");
		e1.imprimir();
		
		System.out.printf("Monstando so o salario ",e1.salario);
		
				
		
	}
}
