package br.com.arrays.aplicacao;

import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int posicao = sc.nextInt();
		
		double[] notas = new double[posicao];
		double nota = 0;
	
		for (int index = 0; index < notas.length; index++) {
			System.out.printf("Digite a nota %d: ", index + 1);
			nota = Double.parseDouble(sc.next());
			notas[index] = nota;
		}
		double total = 0;
		for (double soma : notas) {
			total += soma;
		}
		
		double media = total / notas.length;
		
		System.out.printf("Media: %.2f = ", media);
		sc.close();
	}
}
