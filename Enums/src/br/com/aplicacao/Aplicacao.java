package br.com.aplicacao;

import br.com.enums.DiaDaSemanaEnum;

public class Aplicacao {

	public static void main(String[] args) {
		DiaDaSemanaEnum hoje = DiaDaSemanaEnum.SEXTA;
		
		int num = DiaDaSemanaEnum.QUARTA.getNum();
		System.out.println(num);
		
		DiaDaSemanaEnum d = DiaDaSemanaEnum.valueOf("TERCA");
		//imprime um string do enum da terça
		System.out.println(d);
		//Outra forma de imprimir o string do enum
		String ds = DiaDaSemanaEnum.SABADO.name();
		System.out.println(ds);
		//imprime o valor do dia da string em inteiro
		System.out.println(d.getNum());
		
	}

}
