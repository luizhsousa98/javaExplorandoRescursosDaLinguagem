package collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionHashSet {
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args) {
		//Por padrão sempre usar a interface SET, estou usando como exemplo para estudo hashset antes do new
		HashSet conjunto = new HashSet();
		conjunto.add(1.2); // converte double -> Double
		conjunto.add("Teste"); // String
		conjunto.add(true);// converte boolean -> Boolean
		conjunto.add(1);// converte int -> Integer
		conjunto.add("x");// String
		
		System.out.println("A quantidade de elementos é " + conjunto.size());
		
		conjunto.add("Teste"); 
		conjunto.add("teste"); //adicionou na lista por conta que esta iniciando com t minusculo
		conjunto.add("x");
		
		System.out.println("A quantidade de elementos é " + conjunto.size());
		
		//Deleta elementos
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("x"));
		System.out.println("A quantidade de elementos é " + conjunto.size());
		
		System.out.println(conjunto.contains("x"));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(conjunto);
	}
}
