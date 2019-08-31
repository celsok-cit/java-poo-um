package br.com.ciandt.thiagodf;

/**
 * Class Conta Corrente.
 * Extends Class Conta.
 * 
 * @author thiagodf
 *
 */
public class ContaCorrente extends Conta {
	
	/**
	 * Construtor do limite.
	 * 
	 * 
	 * @param limite
	 */
	public ContaCorrente(double limite) {
		
		this.setLimite(limite);
		
	}
	
	/**
	 * Metodo que valida a possibilidade de saque.
	 * 
	 * @param saque
	 */
	public void sacar(double saque) {
		
		// saque maior que saldo e saque maior que limite + saldo.
		if (saque > this.getSaldo() && saque > (this.getLimite() + this.getSaldo())) {
			
			System.out.println("Saldo insuficiente.");
			
		} else {
			// decrementa do saldo o valor sacado.
			this.setSaque(saque);
			
		}

	}

}
