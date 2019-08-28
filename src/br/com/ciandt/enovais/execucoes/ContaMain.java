package br.com.ciandt.enovais.execucoes;

import br.com.ciandt.enovais.classes.Conta;

public class ContaMain {

	public static void main(String[] args) {
	
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.depositar(100);
		c1.depositar(50);
		c2.depositar(100);
		c2.sacar(40);
		
		
		System.out.println("Conta um: R$" + c1.getSaldo());
		System.out.println("Conta dois: R$" + c2.getSaldo());
		
	}
}
