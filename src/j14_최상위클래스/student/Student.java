package j14_최상위클래스.student;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name); // Object 클래스의 스태틱을 호출해서 만듬
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	// 서로 주소가 같으면 true
			return true;
		if (obj == null)	// obj의 주소가 null이면 false
			return false;
		if (getClass() != obj.getClass())	// 클래스의 종류가 다르면 무조건 false
			return false;
		Student other = (Student) obj; // 다운캐스팅
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [이름=" + name + ", 나이=" + age + "]";
	}
	
	// lombok 라이브러리 

}
