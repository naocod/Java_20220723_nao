package j16_스태틱;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student("김준일"); // 1
		Student student2 = new Student("김준이"); // 2
		Student.autoNumber++;
		Student student3 = new Student("김준삼"); // 4
		Student student4 = new Student("김준사"); // 5
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		System.out.println(Student.autoNumber);
	}
}
