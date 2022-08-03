package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		//1.Collections.synchronizedList
		
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		nameList.add("Java");
		nameList.add("Python");
		nameList.add(".Net");
		nameList.add("Angular");
		
		//add ,remove - we don't need explicit synchronization
		
		//to fetch.traversh/remove the value from list -- we have to use explicit synchronization
		
		synchronized(nameList){
		
			Iterator<String> nonsync = nameList.iterator();
			while(nonsync.hasNext()){
				System.out.println(nonsync.next());
			}
		}

		
		System.out.println("--------------");
		//2.oi8ooicopyOnWriteArrayList -- its a class:Thread-safe/synchronized already
		
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Java");
		empList.add("Python");
		empList.add(".Net");
		empList.add("Angular");
		
		//we don't need explicit synchronization for any operation like add/remove/traverse
		Iterator<String> it = empList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
