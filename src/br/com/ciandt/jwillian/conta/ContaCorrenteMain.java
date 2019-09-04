package br.com.ciandt.jwillian.conta;


public class ContaCorrenteMain {
	
	public static void main (String[] args) {
		
		//Contas e limites das contas 8b
		ContaCorrente ccA = new ContaCorrente(200);
		ContaCorrente ccB = new ContaCorrente(100);
		ContaCorrente ccC = new ContaCorrente(100);
		ContaCorrente ccD = new ContaCorrente(50);
		
		//depositos contas 8b
		ccA.depositar(100);
		ccB.depositar(200);
		ccC.depositar(100);
		ccD.depositar(100);
		
		//Saida esperada da primeira tabela 8b
		System.out.println("Saída esperada da primeira tabela 8b:\n");
		System.out.println("Saldo conta A: R$ " + ccA.getSaldo());
		System.out.println("Limite conta A: R$ " + ccA.getLimite());
		System.out.println("------------------------");
		System.out.println("Saldo conta B: R$ " + ccB.getSaldo());
		System.out.println("Limite conta B: R$ " + ccB.getLimite());
		System.out.println("------------------------");
		System.out.println("Saldo conta C: R$ " + ccC.getSaldo());
		System.out.println("Limite conta C: R$ " + ccC.getLimite());
		System.out.println("------------------------");
		System.out.println("Saldo conta D: R$ " + ccD.getSaldo());
		System.out.println("Limite conta D: R$ " + ccD.getLimite() + "\n");
		
		//---------------------------------------------------------------------------------
		
		//Contas e limites contas 9b
		ContaCorrente ccE = new ContaCorrente(100);
		ContaCorrente ccF = new ContaCorrente(100);
		ContaCorrente ccG = new ContaCorrente(100);
		ContaCorrente ccH = new ContaCorrente(100);
		
		//depositos das contas 9b
		ccE.depositar(50);
		ccF.depositar(50);
		ccG.depositar(50);
		ccH.depositar(50);
		
		//saques das contas 9b
		ccF.sacar(40);
		ccG.sacar(70);
		ccH.sacar(150);
		
		//Saída esperada da segunda tabela 9b
		System.out.println("Saída esperada da segunda tabela 9b:\n");
		ccE.sacar(151); //saque 
		System.out.println("Saldo conta E: R$ " + ccE.getSaldo());
		System.out.println("Limite conta E: R$ " + ccE.getLimite());
		System.out.println("------------------------");
		System.out.println("Saldo conta F: R$ " + ccF.getSaldo());
		System.out.println("Limite conta F: R$ " + ccF.getLimite());
		System.out.println("------------------------");
		System.out.println("Saldo conta G: R$ " + ccG.getSaldo());
		System.out.println("Limite conta G: R$ " + ccG.getLimite());
		System.out.println("------------------------");
		System.out.println("Saldo conta H: R$ " + ccH.getSaldo());
		System.out.println("Limite conta H: R$ " + ccH.getLimite());	
	}
}