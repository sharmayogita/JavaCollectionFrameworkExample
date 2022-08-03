package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



public class ArrayListInteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> StudentList  =new ArrayList<String>();
		StudentList.add("Jenny");
		StudentList.add("Tom");
		StudentList.add("begal");
		StudentList.add("cany");
		
		//using for loop
		for(int i=0;i<StudentList.size();i++){
			System.out.println(StudentList.get(i));
		}
		System.out.println("-----------");
		//using for each loop
		for(String i :StudentList){
			System.out.println(i);
		}
		
		System.out.println("-----------");
		
		//jdk8- streams with lambda:
		StudentList.stream().forEach(lamda -> System.out.println(lamda));
		
		System.out.println("-----------");
		
		//iterator:
		Iterator<String> it = StudentList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//list with other collection:
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(10,20,20,30));
		System.out.println(number);
	}

}
