package HashTable;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<String,Integer> hashtable = new Hashtable<String,Integer>();
		hashtable.put("JAVA",100);
		hashtable.put("Python",100);
		hashtable.put(".net",100);
		hashtable.put("Angular",100);
		//hashtable.put("null",100);

		System.out.println(hashtable.get("JAVA"));
		// System.out.println(hashtable.get(null));
	}

}
