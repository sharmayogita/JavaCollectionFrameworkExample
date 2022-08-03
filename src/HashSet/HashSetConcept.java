package HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		Set<String> namelist = new HashSet<>();
		namelist.add("eclipse");
		namelist.add("Postman");
		namelist.add("Jmeter");
		namelist.add("sql");
		namelist.add("sql");
		namelist.add("");
		namelist.add(null);

		System.out.println(namelist);
		System.out.println(namelist.contains("sql"));

		for (String i : namelist) {
			System.out.println(i);
		}

		Iterator<String> it = namelist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		namelist.remove("sql");
		System.out.println(namelist);

		HashSet<String> hs = new HashSet<>();
		hs.add("mysql");
		hs.add("oracle");

		namelist.addAll(hs);
		System.out.println(namelist);

		namelist.removeAll(hs);
		System.out.println(namelist);

		System.out.println("----------------");
		Set<Integer> firstset = new HashSet<Integer>();
		firstset.addAll((Arrays.asList(1, 2, 4, 5, 7, 8, 8, 9)));

		Set<Integer> secondset = new HashSet<Integer>();
		secondset.addAll((Arrays.asList(1, 2, 4, 5, 7, 6)));

		// get the union operation
		Set<Integer> union = new HashSet<>(firstset);
		union.addAll(secondset);

		System.out.println(union);

		// get the intersection operation
		Set<Integer> intersection = new HashSet<>(firstset);
		union.retainAll(secondset);

		System.out.println(intersection);
		System.out.println("------------------");
		// get the difference operation
				Set<Integer> difference = new HashSet<>(firstset);
				difference.removeAll(secondset);

				System.out.println(difference);
	}

}
