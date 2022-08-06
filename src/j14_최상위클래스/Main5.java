package j14_최상위클래스;

public class Main5 {
	
	public static void main(String[] args) {
		
		Student student = new Student("김준일", 29);
		j14_최상위클래스.student.Student student2 = new j14_최상위클래스.student.Student("김준일", 29);
		
		System.out.println(student.equals(student2));
		
		System.out.println(student.hashCode() == student2.hashCode()); // 값을 조합해서 만듬
		
		
		
		
	}

}
