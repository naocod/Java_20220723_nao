package j11_상속.factory;

public class SamsungFactory extends Factory {
	
	public SamsungFactory(int factoryNumber) { // 외부로부터 받은 번호를 부모에 전달
		super(factoryNumber);
	}
	
	@Override
	public void start() {
		System.out.print("삼성 ");
		super.start(); //공장을 가동합니다.
	}
	
	@Override
	public void stop() {
		System.out.print("삼성 ");
		super.stop();
	}
	
	public void produceAirConditioner() {
		System.out.println("삼성 에어컨을 생산합니다.");
	}
	
	
}
