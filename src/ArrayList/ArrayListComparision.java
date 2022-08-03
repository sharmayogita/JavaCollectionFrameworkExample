package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparision {

	public static void main(String[] args) {

		// 1. sorting and compare
		ArrayList<String> L1 = new ArrayList<String>(Arrays.asList("A", "b", "c", "c", "a"));

		ArrayList<String> L2 = new ArrayList<String>(Arrays.asList("A", "b", "c", "d", "a"));

		ArrayList<String> L3 = new ArrayList<String>(Arrays.asList("A", "b", "c", "c", "a"));

		Collections.sort(L1);
		Collections.sort(L2);
		Collections.sort(L3);

		System.out.println(L1.equals(L2));

		System.out.println(L1.equals(L3));

		// 2.compare two list--find out additional elements

		ArrayList<String> L4 = new ArrayList<String>(Arrays.asList("A", "b", "c", "d", "e"));

		ArrayList<String> L5 = new ArrayList<String>(Arrays.asList("A", "b", "c", "d", "f"));
		L4.removeAll(L5);
		System.out.println(L4);

		// 3. find out missing elements
		L5.removeAll(L4);

		// 4. find out common elements

		ArrayList<Integer> L6 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 50, 70));

		ArrayList<Integer> L7 = new ArrayList<Integer>(Arrays.asList(10, 50, 30, 80, 90));

		L6.retainAll(L7);

		System.out.println(L6);

	}

}
