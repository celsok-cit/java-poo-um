package br.com.ciandt.thiagodf;

public class ContaCorrenteMain {

	public static void main(String[] args) {
		
		// 8a - Print Saldo: 100 e Limite: 50
		ContaCorrente contaUm = new ContaCorrente(50);
		contaUm.setDeposito(100);
		
		System.out.println("Conta Um, Saldo: R$ " + contaUm.getSaldo());
		System.out.println("Conta Um, Limite: R$ " + contaUm.getLimite());
		
		
		System.out.println("------------------------------");
		
		// 9a - Print Saque: 150, Saldo: -100 e Limite: 100
		ContaCorrente contaDois = new ContaCorrente(100);
		contaDois.setDeposito(50);
		contaDois.sacar(150);
		
		if (contaDois.getSaque() < 1 ) {
			
			
		} else {
		
		System.out.println("Conta Dois, Saque: R$ " + contaDois.getSaque());
		System.out.println("Conta Dois, Saldo: R$ " + contaDois.getSaldo());
		System.out.println("Conta Dois, Limite: R$ " + contaDois.getLimite());
		
		}
		
	}

}
