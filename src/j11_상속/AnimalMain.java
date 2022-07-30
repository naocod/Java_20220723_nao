package j11_상속;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		//animal.move();
		
		Human human = new Human();
		//human.move(); // Animal에서 상속받음
		// 부모객체가 먼저 생성이 되어서 Animal 클래스에 있는 "동물 객체 생성" 출력
		human.move(); // 오버라이딩해서 Human의 move가 실행됨
		
		Tiger tiger = new Tiger();
		tiger.move();
		
		
	}

}
