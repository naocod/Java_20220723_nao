package j15_lombok;

public class StudentName {

	public static void main(String[] args) {
		Student student1 = new Student(20220001, "김준일", 2, "부산", "010-1234-6789");
		Student student2 = new Student(20220001, "김준일", 2, "부산", "010-1234-6789");
				
		boolean result = student1.equals(student2);
		
		System.out.println(result);
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student1.hashCode() == student2.hashCode());
		
	}
}
