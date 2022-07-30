package j11_상속;

public class Human extends Animal { //extends Animal > Animal 클래스를 상속받음
	
	public Human() {
		super(); // 부모의 생성자를 의미함. 생략 가능 / this는 자기 자신의 주소, super는 부모의 주소
		super.move(); // 부모의 메소드를 사용할 수 있음
		System.out.println("사람 객체 생성");
	}
	
	// 메소드 [오버라이딩] > 재정의
	@Override // @ > 어노테이션, 오버라이드 어노테이션은 메소드를 재정의 했음을 표기하기 위한 것이므로 생략되어도 실행가능
		public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
		
	}

}
