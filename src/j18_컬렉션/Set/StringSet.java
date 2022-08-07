package j18_컬렉션.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringSet {
	
	public static void main(String[] args) {
		Set<String> strSet = new HashSet<String>();
		
		strSet.add("김준일");
		strSet.add("김준일");
		strSet.add("김준일");
		strSet.add("김준일");
		strSet.add("김준일");
		strSet.add("강주현");
		strSet.add("강주현");
		strSet.add("강주현");
		strSet.add("이창엽");
		strSet.add("a");
		strSet.add("b");
		strSet.add("c");
		strSet.add("d");
		strSet.add("e");
		strSet.add("f");
		
		System.out.println(strSet);
				
		Iterator<String> iterator = strSet.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			if(str.equals("강주현")) {
				System.out.println(str);				
			}
		}
		
		strSet.remove("김준일");
		System.out.println(strSet);
		
	}

}
