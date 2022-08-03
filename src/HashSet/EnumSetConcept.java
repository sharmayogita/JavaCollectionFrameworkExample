package HashSet;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {

	// its not synchronized,more faster than HashSet
	// high performance java collection member
	// all the methods are implemented using bitwise arithmetic operation

	enum Lang {
		JAVA, Python, JavaScript, ruby
	}

	public static void main(String[] args) {

		// created new enumset using enum
		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);

		System.out.println("-------------");
		// empty enumset
		EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
		System.out.println(l);

		System.out.println("------------");
		
		// range(e1,e2)
		EnumSet<Lang> enumrange = EnumSet.range(Lang.JAVA, Lang.JavaScript);
		System.out.println(enumrange);

		System.out.println("------------");
		
		// Of:
		EnumSet<Lang> of = EnumSet.of(Lang.Python);
		System.out.println(of);

		System.out.println("------------");
		
		// multiple enum
		EnumSet<Lang> multipleenum = EnumSet.of(Lang.JAVA, Lang.ruby);
		System.out.println(multipleenum);
		
		System.out.println("------------");
		
		//add &addAll():
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
		lang2.add(Lang.JavaScript); 
		lang2.addAll(lang1);
		System.out.println(lang2);
		
		System.out.println("------------");
		//iterate enumSet using iterator:
		EnumSet<Lang> enumit = EnumSet.allOf(Lang.class);
		Iterator<Lang> it = enumit.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("------------");
		EnumSet<Lang> newenum = EnumSet.allOf(Lang.class);
		newenum.remove(Lang.ruby);
		System.out.println(newenum);
		
		System.out.println("------------"); 
		EnumSet<Lang> newenumele = EnumSet.allOf(Lang.class);
		newenumele.removeAll(newenumele);
		System.out.println(newenumele);
	}

}
