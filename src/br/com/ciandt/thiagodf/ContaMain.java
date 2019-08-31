package br.com.ciandt.thiagodf;

public class ContaMain extends Conta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setDeposito(100);
		conta.setDeposito(50);
		
		double saldo = conta.getSaldo();
		
		System.out.println("Saldo: R$" + saldo);

	}

}
