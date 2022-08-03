package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		//no order,no indexing,no duplicacy
		//store data in key/value format,
		//can store n number of  null value but only one null key
		//hashmap is not thread-safe - unsynchronized
		
		HashMap<String,String> capitalmap = new HashMap<String,String>();
		capitalmap.put("India", "Delhi");
		capitalmap.put("UK", "London");
		capitalmap.put("USA", "Washington DC");
		capitalmap.put("UK", "London1");
		
		capitalmap.put("null", "Berlin");
		capitalmap.put("null", "LA");
		capitalmap.put("France", "null");
		capitalmap.remove("France");
		
		System.out.println(capitalmap.get("India"));
		System.out.println(capitalmap.get("null"));
		System.out.println(capitalmap.get("France"));
		
		//iterator:
		
		Iterator<String> it = capitalmap.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = capitalmap.get(key);
			System.out.println("Key = "+key +" value ="+value);
		}
		
		System.out.println("-------------");
		//iterator: Over the set(pair): by using entrySet
		Iterator<Entry<String, String>> it1 = capitalmap.entrySet().iterator();
		while(it1.hasNext()){
			Entry<String, String> entry = it1.next();
			System.out.println("key = "+ entry.getKey() +" value "+entry.getValue());
		}
		
		
		System.out.println("-------------");
		//iterate hashmap using java8 foreach and lamda
		capitalmap.forEach((k,v) -> System.out.println("key = "+ k +" value "+v));

	}

}
