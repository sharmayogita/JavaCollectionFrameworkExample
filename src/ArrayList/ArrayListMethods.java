package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Java");
		name.add("Python");
		name.add("Angular");
		name.add("javascript");

		ArrayList<String> name1 = new ArrayList<String>();
		name1.add("API");
		name1.add("SQL");

		// name.addAll(name1);

		System.out.println(name);
		name.addAll(1, name1);
		System.out.println(name);

		name.clear();
		System.out.println(name);

		// clone
		ArrayList<String> cloneList = (ArrayList<String>) name1.clone();
		System.out.println(cloneList);

		System.out.println("Contsians"+name.contains("JAva")); // return boolean
		System.out.println(name.indexOf("Java") > 0); // return boolean

		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Yogita", "Artika", "Saurav", "Yogita"));
		
		
		int i = list.indexOf("Yogita");
		System.out.println("indexOf "+i);
		
	//	System.out.println("remove "+list.remove(2));
		
		System.out.println("retailAll "+list.retainAll(Collections.singleton("Artika")));
		System.out.println(list);
		
		
		ArrayList<String> listname = new ArrayList<String>(Arrays.asList("Yogita", "Artika", "Saurav", "Gaurav"));
		Object arr[] = listname.toArray();
		System.out.println("toArray "+Arrays.toString(arr));
		
		
		//remove perticular number in ArrayList
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(2,3,5,7,9,10,20,30,40,50));
		num.removeIf(number -> number%2 ==0);   
		System.out.println(num);//odd number
		
		ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(2,3,15,27,9,10,20,30,40,50));
		num1.removeIf(number -> number%3 ==0); 
		System.out.println("removeIf "+num1); //even number
		
		ArrayList<Integer> subList = new ArrayList<Integer>(num1.subList(2, 5));
		System.out.println("subList "+subList);
	}

}
