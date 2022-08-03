package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapInitialization {
	public static Map<String,Integer> marksmap;
	
	//no need to use in programming : static method create  method inside internal anonymous class to create stack overflow
	static{
		marksmap = new HashMap<>();
		marksmap.put("A", 10);
		marksmap.put("B", 20);
	}

	public static void main(String[] args) {
		//1.using HashMap class
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		Map<String,Integer> map2 = new HashMap<String,Integer>();
		
		//2.static way:using static HashMap
		System.out.println(HashMapInitialization.marksmap.get("A"));
		
		//3.immutable map with only one single entry:
		Map<String,Integer> map3 = Collections.singletonMap("dummy",100);
		System.out.println(map3.get("dummy"));
		//map3.put("test",200);//UnSupportedOperationException
		

	}

}
