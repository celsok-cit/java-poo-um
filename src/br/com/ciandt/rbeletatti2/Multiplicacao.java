package br.com.ciandt.rbeletatti2;

public class Multiplicacao implements OperacaoMatematica {

	@Override
	public int operacaoCalcula(int digitoUm, int digitoDois) {
		return digitoUm * digitoDois;
	}

}
