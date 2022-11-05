package br.com.arrays.aplicacao;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int qtdeAlunos = sc.nextInt();
		
		System.out.print("Quantas notas por aluno? ");
		int qtdeNotas = sc.nextInt();
		
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for (int indiceAluno = 0; indiceAluno < notasDaTurma.length; indiceAluno++) {
			for (int indiceTurma = 0; indiceTurma < notasDaTurma[indiceAluno].length; indiceTurma++) {
				System.out.printf("Informe a nota %d do aluno %d:", indiceAluno + 1, indiceTurma + 1 );
				notasDaTurma[indiceAluno][indiceTurma] = Double.parseDouble(sc.next());
				total += notasDaTurma[indiceAluno][indiceTurma];
			}
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("A média da classe é: " + media);
		
		for (double[] notas : notasDaTurma) {
			System.out.println(Arrays.toString(notas));
		}
		sc.close();
	}
}
