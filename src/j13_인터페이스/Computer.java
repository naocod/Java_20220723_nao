package j13_인터페이스;

public class Computer {
	
	private ConnectionTerminal connectionTerminal;
	
	public Computer(ConnectionTerminal connectionTerminal) {
		this.connectionTerminal = connectionTerminal;
	}
	
	public void onPower() {
		System.out.println("컴퓨터의 전원을 켭니다.");
		connectionTerminal.connect();
		System.out.println();
	}
	
	public void offPwer() {
		connectionTerminal.disConnect();
		System.out.println("컴퓨터의 전원을 끕니다.");
		System.out.println();
	}
	
	public void onSound() {
		if(connectionTerminal instanceof HDMI) {
			HDMI hdmi = (HDMI) connectionTerminal; // 업캐스팅: cinnectionTerminal에서 HDMI의 outputSound를 사용하기 위해 업캐스팅(형변환)
			hdmi.ouputSound();
		}else {
			System.out.println("사운드를 출력할 수 없습니다.");
			System.out.println("별도의 사운드 장치 연결이 필요합니다.");
		}
		System.out.println();
	}

}
