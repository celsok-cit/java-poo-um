package br.com.ciandt.jwillian.conta;

public class ContaCorrente extends Conta {
	
	//Atributo limite
	private double limite;
	
	// Construtor
	public ContaCorrente(double limite) {
		this.limite = limite;
	}
	
	//Metodo Saque
	public void sacar (double vlrSaque) {
		
		if (vlrSaque > this.limite + this.getSaldo()) {
			System.out.println("Saldo insuficiente, para saque no valor de R$" + vlrSaque);
		} else if (vlrSaque < this.getSaldo()) {
			super.sacar(vlrSaque);
		} else if (vlrSaque > this.getSaldo() && vlrSaque <= (this.getSaldo() + this.limite)) {
			super.sacar(vlrSaque);
			this.limite -= -getSaldo();
		}
	}
	
	//Metodo Get Limite
	public double getLimite() {
		return this.limite;
	}
}
