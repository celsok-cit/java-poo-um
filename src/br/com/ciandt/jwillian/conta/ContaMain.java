package br.com.ciandt.jwillian.conta;

public class ContaMain {
	
	public static void main (String[] args) {
		Conta ccA = new Conta();
		Conta ccB = new Conta();
		
		ccA.depositar(100);
		ccA.depositar(50);
		
		ccB.depositar(100);
		ccB.sacar(40);
		
		System.out.println("Saldo conta A: R$ " + ccA.getSaldo());
		System.out.println("Saldo conta B: R$ " + ccB.getSaldo());
	}
}
