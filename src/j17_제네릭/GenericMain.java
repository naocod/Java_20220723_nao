package j17_제네릭;

import j16_스태틱.Student;

public class GenericMain {

	public static void main(String[] args) {
		
		Generic1<String> generic1 = new Generic1<String>();
		
		generic1.setCode(10);
		generic1.setData("김준일");
		
		System.out.println(generic1);
		System.out.println();
		
////////////////////////////////////////////////////////////////////////////////////////////
		
		Generic1<Integer> generic2 = new Generic1<Integer>(20, 1000000);
		System.out.println(generic2);
		System.out.println();

////////////////////////////////////////////////////////////////////////////////////////////
		
		Generic1<Student> generic3 = new Generic1<Student>(); // 자료형대신 객체도 입력가능
		
		Student student = new Student("김준일");
		
		generic3.setCode(30);
		generic3.setData(student);
		
		System.out.println(generic3);
	}
}
