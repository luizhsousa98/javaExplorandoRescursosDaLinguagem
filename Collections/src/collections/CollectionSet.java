package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionSet {
	
	public static void main(String[] args) {
		
		//Nao indexada, Nao ordenada e Nao aceita repeticao
		Set<String> nomes = new HashSet<>();
		nomes.add("Luiz");
		nomes.add("Juca");
		nomes.add("Leo");
		nomes.add("Lais");
		nomes.add("Rebeca");
		
		nomes.forEach(nome -> System.out.println(nome));
		
		//Ordenando lista conforme letra do alfabeto
		System.out.println("****Ordenando por ordem de insercao*****");
		SortedSet<String> emails = new TreeSet<>();
		emails.add("luiz@gmail.com.br");
		emails.add("juca@gmail.com.br");
		emails.add("leo@gmail.com.br");
		emails.add("lais@gmail.com.br");
		emails.add("rebeca@gmail.com.br");
		
		for (final String email : emails) {
			System.out.println(email);
		}
	}

}
