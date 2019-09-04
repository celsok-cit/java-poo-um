package br.com.ciandt.enovais.classes;

public class ContaCorrente extends Conta {
	
	private double limite;
	
	public ContaCorrente(double limite) {
		this.limite = limite;
	}
	
	public double getLimite() {
		return this.limite;
	}
	
	public void sacar(double valor) {
		if(valor > (getSaldo() + limite)) {
			System.out.println("Saldo insuficiente");
		} else if(valor < getSaldo()) {
			super.sacar(valor);
		} else {
			super.sacar(valor);
			this.limite -= -getSaldo();
		}
	}

}
