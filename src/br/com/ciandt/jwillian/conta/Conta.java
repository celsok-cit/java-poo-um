package br.com.ciandt.jwillian.conta;

public class Conta {
	
	// Atributos da classe conta
	private double saldo;
	
	//metodo Depositar
	public void depositar(double valorDepositar) {
	
		this.saldo += valorDepositar;
	}
	
	//metodo Sacar
	public void sacar (double valorSaque) {
		this.saldo -= valorSaque;
	}
	
	
	// Metodo Get
	public double getSaldo () {
		return this.saldo;
	}

}
