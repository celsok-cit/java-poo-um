package br.com.ciandt.rbeletatti2;

public class Subtracao implements OperacaoMatematica {

	@Override
	public int operacaoCalcula(int digitoUm, int digitoDois) {
		return digitoUm - digitoDois;
	}
}
