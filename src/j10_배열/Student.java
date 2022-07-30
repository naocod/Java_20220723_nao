package j10_배열;

public class Student {
	private String name;
	private int year;
	
	
	public Student() {} //기본생성자
	
	public Student(String name, int year) { //전체생성자
		this.name = name;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
