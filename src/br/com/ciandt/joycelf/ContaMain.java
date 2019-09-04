package br.com.ciandt.joycelf;

public class ContaMain {
	public static void main(String[] args) {
		Conta contaA = new Conta();
		
		contaA.depositar(50.00);
		contaA.depositar(100.00);
		
		System.out.println(contaA.getSaldo());
		
		Conta contaB = new Conta();
		contaB.depositar(100.0);
		contaB.sacar(40.0);
		
		System.out.println(contaB.getSaldo());
	}
}
