package br.com.ciandt.thiagodf;

/**
 * Class Conta Main.
 * Extends Class Conta.
 * 
 * @author thiagodf
 *
 */
public class ContaMain extends Conta {

	public static void main(String[] args) {
		
		// 6 - Print Saldo: 150
		Conta contaUm = new Conta();
		contaUm.setDeposito(100);
		contaUm.setDeposito(50);
		
		System.out.println("Conta Um, Saldo: R$ " + contaUm.getSaldo());
		
		System.out.println("------------------------------");
		
		// 7 - Print Saldo: 60
		Conta contaDois = new Conta();
		contaDois.setDeposito(100);
		contaDois.setSaque(40);
		
		System.out.println("Conta Dois, Saldo: R$ " + contaDois.getSaldo());

	}

}
