package br.com.ciandt.enovais.execucoes;

import br.com.ciandt.enovais.classes.ContaCorrente;

public class ContaCorrenteMain {

	public static void main(String[] args) {
		
		/* Contas referente ao Hands on! 8b */
		ContaCorrente cc1 = new ContaCorrente(50);
		ContaCorrente cc2 = new ContaCorrente(200);
		ContaCorrente cc3 = new ContaCorrente(100);
		ContaCorrente cc4 = new ContaCorrente(100);
		ContaCorrente cc5 = new ContaCorrente(50);

		cc1.depositar(100);
		cc2.depositar(100);
		cc3.depositar(200);
		cc4.depositar(100);
		cc5.depositar(100);
		
		System.out.println("Saldo da conta1: R$" + cc1.getSaldo() + "\nLimite da conta1: R$" + cc1.getLimite() + "\n");
		System.out.println("Saldo da conta2: R$" + cc2.getSaldo() + "\nLimite da conta2: R$" + cc2.getLimite() + "\n");
		System.out.println("Saldo da conta3: R$" + cc3.getSaldo() + "\nLimite da conta3: R$" + cc3.getLimite() + "\n");
		System.out.println("Saldo da conta4: R$" + cc4.getSaldo() + "\nLimite da conta4: R$" + cc4.getLimite() + "\n");
		System.out.println("Saldo da conta5: R$" + cc5.getSaldo() + "\nLimite da conta5: R$" + cc5.getLimite() + "\n");
		
		/* Contas referente ao Hands on! 9b */
		
		ContaCorrente cc6 = new ContaCorrente(100);
		ContaCorrente cc7 = new ContaCorrente(100);
		ContaCorrente cc8 = new ContaCorrente(100);
		ContaCorrente cc9 = new ContaCorrente(100);
		
		cc6.depositar(50);
		cc7.depositar(50);
		cc8.depositar(50);
		cc9.depositar(50);
		
		cc6.sacar(151);				
		cc7.sacar(40);				
		cc8.sacar(70);				
		cc9.sacar(150);				
		
		System.out.println("Saldo da conta6: R$" + cc6.getSaldo() + "\nLimite da conta6: R$" + cc6.getLimite() + "\n");
		System.out.println("Saldo da conta7: R$" + cc7.getSaldo() + "\nLimite da conta7: R$" + cc7.getLimite() + "\n");
		System.out.println("Saldo da conta8: R$" + cc8.getSaldo() + "\nLimite da conta8: R$" + cc8.getLimite() + "\n");
		System.out.println("Saldo da conta9: R$" + cc9.getSaldo() + "\nLimite da conta9: R$" + cc9.getLimite() + "\n");
	}

}
