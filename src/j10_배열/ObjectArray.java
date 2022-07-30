package j10_배열;

public class ObjectArray {

	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		Student[] students = new Student[5]; // student 클래스 객체가 들어갈 수 있음
		students[0] = new Student("김준일", 1); // 객체
		students[1] = new Student("이준우", 2); 
		students[2] = new Student("서태진", 3);
		students[3] = new Student("강주현", 4);
		students[4] = new Student("임나영", 3);
		
		String[] names = new String[students.length]; // 학생의 수만큼 배열 생성
		
		for(int i = 0; i < students.length; i++) {
			// System.out.println(students[i].getName()); // students[i](객체) > 주소값 출력됨 / .getName() 객체에 입력된 이름 출력
			names[i] = students[i].getName();
		}
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		
	}

}
