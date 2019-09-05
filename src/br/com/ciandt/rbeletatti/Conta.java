package br.com.ciandt.rbeletatti;

public class Conta {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double valor) {
		this.saldo = valor;
		System.out.println(saldo);
	}

	public void sacar(double valor) {
		System.out.println("Valor a ser sacado: " + valor);
		this.saldo = saldo - valor;
		System.out.println("Total do saldo: " + this.saldo);
	}
}
