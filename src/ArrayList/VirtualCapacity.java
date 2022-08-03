package ArrayList;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		//default capacity of ArrayList always 10
		ArrayList<Object> ar = new ArrayList<Object>();
		
		
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
	}

}
