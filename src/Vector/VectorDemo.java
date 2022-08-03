package Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		vec.add(1);
		vec.add(5);
		vec.add(7);
		vec.add(13);
		vec.add(3);
		vec.add(2);
		
		System.out.println(vec);
		System.out.println(vec.get(3));
		
		Vector<Integer> vec1 = new Vector<>();
		
		vec.add(2);
		vec.add(18);
		vec.addAll(vec1);
		System.out.println(vec);
		
		System.out.println("--------------------");
		//iterate value using iterator
		
		Iterator<Integer>it = vec.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println("--------------------");
		
		//using for loop
		for(int i=0;i<vec.size();i++){
			System.out.println(vec.get(i));
		}
		
		Collections.sort(vec);
		System.out.println(vec);
	}

}
