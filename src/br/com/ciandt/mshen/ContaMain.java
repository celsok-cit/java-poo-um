package br.com.ciandt.mshen;

public class ContaMain {

    public static void main(String[] args) {
	Conta contaA = new Conta();
	Conta contaB = new Conta();

	contaA.depositar(100);
	contaA.depositar(50);
	System.out.println("Valor do saldo: " + contaA.getSaldo());

	contaB.depositar(100);
	contaB.sacarValor(40);
	System.out.println("Valor do saldo: " + contaB.getSaldo());
    }

}
