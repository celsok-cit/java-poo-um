package br.com.ciandt.thiagodf;

public class ContaMain extends Conta {

	public static void main(String[] args) {
		
		Conta contaUm = new Conta();
		contaUm.setDeposito(100);
		contaUm.setDeposito(50);
		
		double saldoContaUm = contaUm.getSaldo();
		
		System.out.println("Saldo: R$" + saldoContaUm);
		
		Conta contaDois = new Conta();
		contaDois.setDeposito(100);
		contaDois.setSaque(40);
		
		double saldoContaDois = contaDois.getSaldo();
		
		System.out.println("Saldo: R$" + saldoContaDois);

	}

}
