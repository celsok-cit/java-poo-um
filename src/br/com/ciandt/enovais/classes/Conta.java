package br.com.ciandt.enovais.classes;

public class Conta {
	 
	private int saldo;

	public int getSaldo() {
		return this.saldo;
	}

	public void depositar(int saldo) {
		this.saldo += saldo;
	}
	
}
