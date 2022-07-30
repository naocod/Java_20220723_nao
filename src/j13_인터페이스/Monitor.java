package j13_인터페이스;

public class Monitor implements HDMI, VGA {

	@Override
	public void connect() {
		System.out.println("모니터를 연결합니다.");
	}

	@Override
	public void disConnect() {
		System.out.println("모니터 연결을 해제합니다.");
	}

	@Override
	public void ouputSound() {
		System.out.println("모니터에서 사운드를 출력합니다.");
	}

	

}
