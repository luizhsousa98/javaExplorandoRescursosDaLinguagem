package br.com.enums;

public enum DiaDaSemanaEnum {
	
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	
	private int num;
	
	DiaDaSemanaEnum(final int num){
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}
