
public class Conta {
		private int Numbercc;
		private String NomeTitular;
		private String CpfTitular;
		private double Saldo;
		Boolean sacar ; 
		
				
		public int getNumbercc() {
			return Numbercc;
		}
		public void setNumbercc(int numbercc) {
			Numbercc = numbercc;
		}
		public String getNomeTitular() {
			return NomeTitular;
		}
		public void setNomeTitular(String nomeTitular) {
			NomeTitular = nomeTitular;
		}
		public String getCpfTitular() {
			return CpfTitular;
		}
		public void setCpfTitular(String cpfTitular) {
			CpfTitular = cpfTitular;
		}
		public double getSaldo() {
			return Saldo;
		}
		public void setSaldo(double saldo) {
			Saldo = saldo;
		}
		
		public String MostrarDadosdaConta() {
			String resultado = "Numero da Conta : " +Numbercc+  " Titular :"  +NomeTitular+ " CPF :" +CpfTitular+ " Saldo" +Saldo;
			return resultado;
		}
		

		public double deposito(double deposito) {
			Saldo= Saldo + deposito;
			return Saldo;
		}
		
		public double saque (double saque) {
			if (Saldo >= saque ) {
				Saldo = Saldo - saque;
				return Saldo;
			}
			else {
					System.out.println("Saldo Insuficiente para sacar :"+saque );
					return Saldo;
			}
		}
}

