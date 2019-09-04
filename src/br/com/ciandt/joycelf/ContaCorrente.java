package br.com.ciandt.joycelf;

public class ContaCorrente extends Conta {
	private double limite;

	public ContaCorrente(double limite) {
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void sacar(double saque) {
		if (saldo >= saque) {
			saldo = saldo - saque;
		} else if (saque <= saldo) {
			saldo = saldo - saque;
		} else if (saque > saldo + this.limite) {
			System.out.println("Saldo insuficiente");
		} else if (saque <= saldo + limite && saque > saldo) {
			double limiteUsado = saldo - saque;
			saldo = saldo - saque; 
			this.limite = limite + limiteUsado;
		}
	}
}
