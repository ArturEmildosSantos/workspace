import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cc, p, f;
		Conta c1, c2;

		c1 = new Conta();
		c2 = new Conta();

		c1.setNumbercc(1);
		c1.setNomeTitular("Artur Emil");
		c1.setCpfTitular("111111111-11");

		c2.setNumbercc(2);
		c2.setNomeTitular("Sr. Batata");
		c2.setCpfTitular("222222222-11");

		System.out.println(c1.MostrarDadosdaConta());
		System.out.println(c2.MostrarDadosdaConta());
		System.out.printf("Numero da conta");
		cc = teclado.nextInt();

		switch (cc) {
		case 1:
			System.out.println("Deposito 1 --- Saque 2 --- Sair 0");
			p = teclado.nextInt();

			while (p != 0) {
				if (p == 1) {
					System.out.println("Deposito");
					System.out.printf("%.2f Deposito :", c1.deposito(teclado.nextDouble()));
					System.out.println("Saldo" + c1.getSaldo());
					System.out.println("Deposito 1 --- Saque 2 --- Sair 0");
					p = teclado.nextInt();
				}

				else if (p == 2) {
					System.out.println("Saque");
					System.out.printf("%.2f Saque ", c1.saque(teclado.nextDouble()));
					System.out.println("Saldo" + c1.getSaldo());
					System.out.println("Deposito 1 --- Saque 2 --- Sair 0");
					p = teclado.nextInt();
				}

				else {

					p = 0;

				}
			}
		}

	}

}
