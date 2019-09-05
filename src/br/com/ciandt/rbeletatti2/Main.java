package br.com.ciandt.rbeletatti2;

public class Main {

	public static void main(String[] args) {

		Soma soma = new Soma();
		Subtracao sub = new Subtracao();
		Multiplicacao multi = new Multiplicacao();
		Divisao divi = new Divisao();

		System.out.println(soma.operacaoCalcula(2, 2));
		System.out.println(sub.operacaoCalcula(2, 2));
		System.out.println(multi.operacaoCalcula(2, 2));
		System.out.println(divi.operacaoCalcula(2, 2));
	}
}
