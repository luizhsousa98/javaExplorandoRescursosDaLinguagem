package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		
		User u1 = new User("Ana");
		list.add(u1);
		list.add(new User("Bia"));
		list.add(new User("Carlos"));
		list.add(new User("Lia"));
		list.add(new User("Pedro"));
		list.add(new User("Julia"));
		list.add(new User("Manu"));
		
		System.out.println(list.get(4)); //Acessing by index
		System.out.println("Removing index from list, " + list.remove(2)); //Remove index Carlos
		//Removing by user object
		System.out.println(list.remove(new User("Manu")));
		System.out.println("Contains? " + list.contains(new User("Lia")));
		System.out.println("Contains? " + list.contains(u1));
		
		list.forEach(user -> System.out.println(user));
	}
}
