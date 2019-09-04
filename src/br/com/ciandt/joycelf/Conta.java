package br.com.ciandt.joycelf;

public class Conta {
	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double deposito) {
		saldo = saldo + deposito;
	}
	
	public void sacar(double saque) {
		saldo = saldo - saque;
	}
}
