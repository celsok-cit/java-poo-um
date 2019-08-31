package br.com.ciandt.thiagodf;

/**
 * Class Conta
 * 
 * @author thiagodf
 *
 */
public class Conta {
	
	private double saldo;
	private double deposito;
	
	// Gets
	public double getSaldo() {
		return saldo;
	}
	public double getDeposito() {
		return deposito;
	}
	
	// Sets
	public void setDeposito(double deposito) {
		saldo = saldo + deposito;
	}
	
}
