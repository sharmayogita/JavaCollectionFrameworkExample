package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HAshMapComparision {

	public static void main(String[] args) {

		HashMap<Integer,String> fl1 = new HashMap<Integer,String>();
		fl1.put(1, "Jally");
		fl1.put(2, "Apple");
		fl1.put(3, "Mango");
		
		HashMap<Integer,String> fl2 = new HashMap<Integer,String>();
		fl2.put(3, "Mango");
		fl2.put(2, "Apple");
		fl2.put(1, "Jally");
		
		HashMap<Integer,String> fl3 = new HashMap<Integer,String>();
		fl3.put(1, "Jally");
		fl3.put(2, "Apple");
		fl3.put(3, "Mango");
		fl3.put(3, "Grapes");
		
		//1.on the basis of key-value using  equals method
		System.out.println(fl1.equals(fl2));
		System.out.println(fl2.equals(fl3));
		
		System.out.println("---------------");
		
		//2.compare hashmaps for the same keys:keySet():
		System.out.println((fl1.keySet()).equals(fl2.keySet())); //true
		System.out.println((fl1.keySet()).equals(fl3.keySet())); //true
		System.out.println("---------------");
		
		//find the extra keys:
		HashMap<Integer,String> fl4 = new HashMap<Integer,String>();
		fl4.put(1, "Jally");
		fl4.put(2, "Apple");
		fl4.put(3, "Mango");
		fl4.put(4, "Grapes");
		
		//combine the keys from both the maps: using HashSets (How to find out extra key in hashset) 
		HashSet<Integer> combileKeys = new HashSet<>(fl1.keySet());
		//add keys from fl4
		combileKeys.addAll(fl4.keySet());
		combileKeys.removeAll(fl1.keySet());
		System.out.println(combileKeys);
		
		//compare HashSets by value
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(4, "A");
		map2.put(5, "B");
		map2.put(6, "C");
		
		HashMap<Integer,String> map3 = new HashMap<Integer,String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(4, "C");
		
		System.out.println("---------------");
		
		//duplicates are not allowed: using ArrayList
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map3.values())));
		
		System.out.println("---------------");
		
		//duplicates are  allowed: using HashSet
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map3.values())));
		

	}

}
