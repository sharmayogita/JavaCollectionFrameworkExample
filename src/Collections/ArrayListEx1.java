package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("SBI"); // Adding Obj in arrayList
		list.add("HDFC");
		list.add("ICICI");
		list.add("PNB");
		System.out.println(list);
	  
		
		//Traversing list through Iterator
	/*	Iterator itr = list.iterator(); //getting the Iterator 
		 // Iterator,forEach,loop etc getting the iterator 
		  while(itr.hasNext()) {
			  System.out.println(itr.next()); 
		  }
		  
		  //Iterating ArrayList using For-each loop
		  for(String name:list) 
			  System.out.println(name);
		

	*/
		
	/*	
		  //get() accessing the element at the specified index
		  System.out.println("Returning element: "+list.get(1));
		  
		  //changing the element 
		  list.set(1,"Indusind");
		  
		  for(String name:list) 
			  System.out.println(name);
		  System.out.println(list);
		  
	*/	 

	/*	
		  //Creating a list of numbers 
		  List<Integer> list2=new ArrayList<Integer>(); 
		  list2.add(21); 
		  list2.add(11); 
		  list2.add(51);
		  list2.add(1);
		  
		  System.out.println(list2); //Sorting the list
		  Collections.sort(list2); 
		  for(Integer number:list2)
		  System.out.println(number);
	*/
		  
	}

}
