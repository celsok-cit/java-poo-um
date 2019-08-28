package br.com.ciandt.enovais.classes;

public class ContaCorrente extends Conta {
	
	private int limite;
	
	public ContaCorrente(int limite) {
		this.limite = limite;
	}
	
	public int getLimite() {
		return this.limite;
	}
	
	public void sacar(int valor) {
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
