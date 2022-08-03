package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConvertHashMapToArrayList {

	public static void main(String[] args) {
		HashMap<String,Integer> countrylist = new HashMap<String,Integer>();
		countrylist.put("India", 1000);
		countrylist.put("UK", 2000);
		countrylist.put("USA", 3000);
		countrylist.put("London", 3000);
		
		Iterator it  = countrylist.entrySet().iterator();
		while(it.hasNext()){
		Map.Entry pairs = 	(Map.Entry)it.next();
		System.out.println(pairs.getKey()+ " = "+pairs.getValue());
		
		//using lamda expression
		countrylist.forEach((k,v) -> System.out.println("key = "+k +" value = "+v));
		
		}
		
		//convert hashmap keys into arraylist
		List<String> comparenamelist = new ArrayList<String>(countrylist.keySet());
		System.out.println(comparenamelist.size());
		
		
		//convert hashmap values into arraylist
				List<Integer> Empvaluelist = new ArrayList<Integer>(countrylist.values());
				System.out.println(Empvaluelist.size());
	}

}
