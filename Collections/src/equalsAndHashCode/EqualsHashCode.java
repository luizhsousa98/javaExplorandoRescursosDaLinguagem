package equalsAndHashCode;

public class EqualsHashCode {

	public static void main(String[] args) {
		Usuario u1 = new Usuario("Luiz Sousa", "luiz.sousa@gmail.com.br");
		
		Usuario u2 = new Usuario("Luiz Sousa", "luiz.sousa@gmail.com.br");
		
		//Objetos distintos da memoria = false
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
	}
}
