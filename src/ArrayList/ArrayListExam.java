package ArrayList;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		//default class
		//dynamic array
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Yogita");
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add("Automation Testing");
		ar.add(10);
		ar.add(2.00);
		ar.add(true);
		ar.add('t');
		System.out.println(ar);
		System.out.println(ar.get(2));
		System.out.println(ar.size());
		System.out.println("LI = "+0);     //lower index
		System.out.println("HI = "+(ar.size()-1));  //higher index

	}

}
