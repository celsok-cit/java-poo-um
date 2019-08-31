package br.com.ciandt.thiagodf;

/**
 * Class Conta.
 * 
 * @author thiagodf
 *
 */
public class Conta {
	
	private double saldo;
	private double deposito;
	private double saque;
	private double limite;
	
	
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
	public double getLimite() {
		return limite;
	}
	
	// Sets
	public void setDeposito(double deposito) {
		saldo = saldo + deposito;
	}
	public void setSaque(double saque) {
		this.saque = saque;
		saldo = saldo - saque;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
