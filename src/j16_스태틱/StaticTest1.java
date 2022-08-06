package j16_스태틱;


public class StaticTest1 {
	
	private static int num;
	
	public static void setNum(int num) {
//		StaticTest1 staticTest1 = new StaticTest1();
//		staticTest1.num = num; // 변수명에서 접근
		
		StaticTest1.num = num; // 클래스명에서 접근
		// 변수에 static이 없다면 꼭 생성하여 변수에서 접근해야함
		// 생성된 객체가 없어 this를 사용할 수 없음
	}
	
	public static int getNum() {
		return num;
	}
	

}
