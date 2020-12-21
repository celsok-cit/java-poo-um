package br.com.ciandt.mshen;

public class ContaCorrente extends Conta {

    private double limite;

    public double getLimite() {
	return limite;
    }

    public ContaCorrente(double limite) {
	this.limite = limite;
    }

    public void sacar(double valor) {
	if (valor > getSaldo() && valor <= (getSaldo() + getLimite())) {
	    sacarValor(valor);
	    limite += getSaldo();
	} else if (valor < getSaldo()) {
	    sacarValor(valor);
	} else if (valor > getSaldo() && valor > getLimite()) {
	    System.out.println("Saldo insuficiente");
	}
    }

}
