package br.com.ciandt.rbeletatti;

public class ContaCorrente extends Conta {

	private double limite;

	public ContaCorrente(double limite) {
		totalLimite();
	}

	public double getLimite() {
		return limite;
	}

	private void totalLimite() {
		if (getSaldo() >= getLimite()) {
			throw new IllegalArgumentException("Saldo maior que o Limite !");
		}
	}
}
