package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	//ll default class in JAVA
	//it can be used as list,stack,queue
	//it allows the null  entry
	//dynamic collection , insertion,deletion easily implemented, contain duplicate elements
	//not synchronized, not thread safe
	public static void main(String[] args) {
	LinkedList<String> myllname = new LinkedList<>();
	
	System.out.println(myllname.size());
	myllname.add("Selenium");
	myllname.add("QTP");
	myllname.add("LoadRunner");
	myllname.add("UFT");
	
	System.out.println(myllname.size());
	
	Iterator<String> it = myllname.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	
	myllname.add(4, "Selenium RC");
	myllname.add(2, "Selenium IDE");
	System.out.println(myllname);
	
	LinkedList<String> username = new LinkedList<>();
	username.add("Yogi");
	username.add("Sam");
	myllname.addAll(username);
	
	System.out.println(myllname);
	myllname.addFirst("Java");
	myllname.addLast("c#");
	myllname.remove(1);
	
	myllname.removeAll(username);
	username.clear();
	System.out.println(myllname);
	
	
	LinkedList<String> city = new LinkedList<>();
	city.add("hyderabad");
	city.add("banglore");
	city.add("mumbai");
	city.add("pune");
	
	//reverse the linkedlist
	Iterator<String> its = city.descendingIterator();
	while(its.hasNext()){
		System.out.println(its.next());
	}
	
	System.out.println("--------------------");
	for(String i:city){
		System.out.println(i);
	}
	
	//sort:
	System.out.println("--------------------");
	Collections.sort(city);
	System.out.println(city);
	}

}
