package br.com.ciandt.joycelf;

public class ContaCorrenteMain {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(100); 
		
		contaCorrente.depositar(50);
		contaCorrente.sacar(150);
		
		System.out.println("Limite: " + contaCorrente.getLimite());
		System.out.println("Saldo: " + contaCorrente.getSaldo());
	}
	
}
