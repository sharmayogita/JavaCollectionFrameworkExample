package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,3,4,5,6,7,7,8,8,9,9));
		
		//1. using LinkedHashSet
		LinkedHashSet<Integer> removedulicate  =new LinkedHashSet<Integer>(list);
		ArrayList<Integer> listwithoutduplicate = new ArrayList<Integer>(removedulicate);
		
		System.out.println(listwithoutduplicate);
		
		//2. jdk 8 - stream:
		
		ArrayList<Integer> numberlist = new ArrayList<Integer>(Arrays.asList(1,1,3,4,5,6,7,7,8,8,9,9));
		List<Integer> numberlistunique = numberlist.stream().distinct().collect(Collectors.toList());
		
		System.out.println(numberlistunique);
		

	}

}
