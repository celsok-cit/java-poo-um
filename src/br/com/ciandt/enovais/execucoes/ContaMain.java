package br.com.ciandt.enovais.execucoes;

import br.com.ciandt.enovais.classes.Conta;

public class ContaMain {

	public static void main(String[] args) {
	
		Conta c1 = new Conta();
		
		c1.depositar(100);
		c1.depositar(50);
		
		System.out.println( c1.getSaldo() );
		
		
	}
}
