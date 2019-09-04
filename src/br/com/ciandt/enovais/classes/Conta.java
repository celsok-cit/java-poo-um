package br.com.ciandt.enovais.classes;

public class Conta {
	 
	private int saldo;

	public int getSaldo() {
		return this.saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
}
