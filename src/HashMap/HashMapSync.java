package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Python");
		map.put(2, "JAVA");
		map.put(3, ".Net");
		
		//create synchronized map
		Map<Integer,String> map1 = Collections.synchronizedMap(map);
		System.out.println(map1);
		
		//concurrentHashMap:it does not throw any ConcurrentModificationException
		  
		ConcurrentHashMap<Integer, String> concurrhashmap = new ConcurrentHashMap<>();
		concurrhashmap.put(1, "yogi");
		concurrhashmap.put(2, "Sam");
		concurrhashmap.put(3, "Ranu");
		concurrhashmap.put(4 ,"");
		
		System.out.println(concurrhashmap.get(2));
		

	}

}
