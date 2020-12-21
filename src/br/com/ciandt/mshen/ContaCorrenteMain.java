package br.com.ciandt.mshen;

public class ContaCorrenteMain {

    public static void main(String[] args) {
	ContaCorrente contaA = new ContaCorrente(100);
	contaA.depositar(50);
	contaA.sacar(150);
	System.out.println("Valor do saldo: " + contaA.getSaldo());
	System.out.println("Limite: " + contaA.getLimite());
    }

}
