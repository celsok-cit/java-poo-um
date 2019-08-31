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
	private double saque;
	
	
	// Gets
	public double getSaldo() {
		return saldo;
	}
	public double getDeposito() {
		return deposito;
	}
	public double getSaque() {
		return saque;
	}
	
	// Sets
	public void setDeposito(double deposito) {
		saldo = saldo + deposito;
	}
	public void setSaque(double saque) {
		saldo = saldo - saque;
	}
	
}
