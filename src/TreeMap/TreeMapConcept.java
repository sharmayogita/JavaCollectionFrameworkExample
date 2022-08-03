package TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(2000,"Saurav");
		map.put(1000,"YOgita");
		
		map.put(3000,"Kriyansh");
		map.put(4000,"Shanaya");
		System.out.println(map);
		
		map.forEach((k,v) -> System.out.println("key = "+k + " value = "+v));
		System.out.println(map.lastEntry());
		System.out.println(map.firstEntry());
		System.out.println(map.lastKey());
		
		Set<Integer> keyslessthan3k = map.headMap(3000).keySet();
		System.out.println(keyslessthan3k);
		
		Set<Integer>  keysgrthan3k = map.tailMap(3000).keySet();
		System.out.println(keysgrthan3k);
		
		System.out.println("-----------------");
		TreeMap<String,Integer> Usermap = new TreeMap<>();
		Usermap.put("Saurav",30);
		Usermap.put("YOgita",40);
		
		Usermap.put("Kriyansh",10);
		Usermap.put("Shanaya",70);
		System.out.println(Usermap);
		Usermap.forEach((k,v) -> System.out.println("key = "+k + " value = "+v));
		
		System.out.println("-----------------");
		//for reverse order
		TreeMap<Integer,String> map1 = new TreeMap<Integer,String>(Comparator.reverseOrder());
		map1.put(2000,"Saurav");
		map1.put(1000,"YOgita");
		
		map1.put(3000,"Kriyansh");
		map1.put(4000,"Shanaya");
		System.out.println(map1);
	}

}
