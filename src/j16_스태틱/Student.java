package j16_스태틱;

import lombok.ToString;

@ToString
public class Student {
	
	public static int autoNumber = 2022000;
	private int studentCode;
	private String studentName;
	
	public Student(String studentName) {
		autoNumber++;
		studentCode = autoNumber;
		this.studentName = studentName;
	}

}
