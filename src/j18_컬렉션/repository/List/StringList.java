package j18_컬렉션.repository.List;

import java.util.ArrayList;

public class StringList {
	
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("이름");
		strList.add("나이");
		strList.add("주소");
		
//		System.out.println(strList);
//		
//		
//		for(int i = 0; i < strList.size(); i++) {
//			System.out.println(strList.get(i));
//		}
		
		
		ArrayList<Object> arrayList = new ArrayList<Object>();
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("김준일");
		nameList.add("김준이");
		nameList.add("김준삼");
		nameList.add("김준사");
		nameList.add("김준오");
		
		ArrayList<Integer> ageList = new ArrayList<Integer>();
		ageList.add(29);
		ageList.add(30);
		ageList.add(31);
		ageList.add(32);
		ageList.add(33);

		ArrayList<String> addressList = new ArrayList<String>();
		addressList.add("부산");
		addressList.add("서울");
		addressList.add("경남");
		addressList.add("경북");
		addressList.add("울산");
		
		arrayList.add(nameList);
		arrayList.add(ageList);
		arrayList.add(addressList);
		
		
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i) + ":" + arrayList.get(i));
		}
		
		System.out.println();
		nameList.remove(4);
		ageList.remove(4);
		addressList.remove(4);
		
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i) + ":" + arrayList.get(i));
		}
		
		System.out.println();
		
		
		String name = "김준이";
		
		if(nameList.contains(name)) {
			int index1 = nameList.indexOf(name);
			nameList.remove(index1);
			ageList.remove(index1);
			addressList.remove(index1);
			
			for(int i = 0; i < strList.size(); i++) {
				System.out.println(strList.get(i) + ":" + arrayList.get(i));
			}
			
		}else {
			System.out.println("해당 이름은 없습니다");
		}
		
		int index = nameList.indexOf("김준이");
		System.out.println(index);
		
		
	}

}
