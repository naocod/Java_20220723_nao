package j13_인터페이스;

/*
 * 인터페이스
 *  1. 모든 메소드가 기본적으로 추상 메소드이다.
 *  2. 생성할 수 없다.
 *  3. 기본적으로 일반 변수는 선언 할 수 없다.
 *  4. 기본적으로 static 상수를 선언해서 사용할 수 있다. (private 안됨 무조건 public)
 */

public interface HDMI extends ConnectionTerminal {
	public String hdmiVersion = "HDMI 2.0";
	
	public void ouputSound();
	
	
	
	
	
	
	
//	public void connectWithHDMI(); // 인터페이스는 모든 메소드가 추상 메소드이기 때문에 abstract이다. 그래서 생략 가능
//		
//	public void disConnectWithHDMI(); // 추상메소드라서 중괄호 X 
	
}
