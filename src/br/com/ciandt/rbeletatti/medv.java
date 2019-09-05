package br.com.ciandt.rbeletatti;

import java.util.Scanner;

public class medv {

	public static void main(String[] args) {
		int[] numero = new int[5];
		int soma = 0;

		Scanner input = new Scanner(System.in);

		for (int cont = 0; cont < numero.length; cont++) {
			numero[cont] = input.nextInt();
		}

		for (int cont : numero) {
			soma += cont;
		}
		System.out.println("A soma dos números que você digitou é " + soma);
	}
}
