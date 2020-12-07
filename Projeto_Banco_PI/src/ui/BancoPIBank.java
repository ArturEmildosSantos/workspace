package ui;

import model.Conta;
import model.ContaEspecial;

public class BancoPIBank {
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		
		c1.setNumeroConta(1234);
		c1.setNomeTitular("Jose Joao");
		c1.setCpf("12345678900");
		c1.credito(100);
		
		System.out.println(c1);
		
		ContaEspecial c2 = new ContaEspecial();
		
		c2.setNumeroConta(4747);
		c2.setNomeTitular("Paula Abdu");
		c2.setCpf("12345678911");
		c2.setLimite(500.00);
		c2.credito(100);
		
		System.out.println(c2);
		
		
		if (c1.debitar(200)) {
			System.out.println("Saque autorizado"+c1.getSaldo());
		}
			else {
				System.out.println("Nao Autorizado"+c1.getSaldo());
			}
		
		
		if (c2.debitar(200)) {
			System.out.println("Saque autorizado"+c2.getSaldo());
		}
			else {
				System.out.println("Nao Autorizado"+c2.getSaldo());
			}
		
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
