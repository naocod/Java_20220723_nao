package j11_상속.factory;

public class LGFactory extends Factory {
	
	public LGFactory(int factoryNumber) { // 외부로부터 받은 번호를 부모에 전달
		super(factoryNumber);
	}
	
	@Override
	public void start() {
		System.out.print("LG ");
		super.start();
	}
	
	@Override
	public void stop() {
		System.out.print("LG ");
		super.stop();
	}
	
	public void produceSmartTV() {
		System.out.println("LG 스마트 TV를 생산합니다.");
	}
	
}
