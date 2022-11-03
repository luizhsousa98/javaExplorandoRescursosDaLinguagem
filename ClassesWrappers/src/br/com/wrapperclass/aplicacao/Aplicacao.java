package br.com.wrapperclass.aplicacao;

/**
 * Wrappers class sao para situacoes que voce precisa levar os valores
 * primitivos para o mundo das classes por exemplo nas collections
 * 
 * @author lhsousa
 *
 */
public class Aplicacao {
	public static void main(String[] args) {
		Integer i = Integer.valueOf(20);
		imprimir(i);
		Double d = Double.valueOf(25.5);
		imprimir(d);
		//obtendo o valor da wrappers integer para tipo primitivo
		int idade = i.intValue();
		double preco = d.doubleValue();
		
		Integer i2 = Integer.valueOf("23");
		Double d2 = Double.valueOf("23.5");
		imprimir(d2);
		imprimir(i2);
		
		//convertendo para o tipo primitivo correspondente
		int idade2 = Integer.parseInt("24");
		double preco2 = Double.parseDouble("20.6");
		System.out.println(idade2);
		System.out.println(preco2);
	}

	private static void imprimir(final Object obj) {
		System.out.println(obj);
	}
}
