package j13_인터페이스;

public class ConnectMain {
	
	public static void main(String[] args) {
		
		//객체 생성
		LGMonitor lgMonitor = new LGMonitor();
		EpsonBeamProject epsonBeamProject = new EpsonBeamProject();
		
		ConnectionTerminal connectionTerminal = epsonBeamProject;
		
		Computer computer = new Computer(connectionTerminal); //인터페이스로 구성된 객체는 뭐든 들어올 수 있음
		
		computer.onPower();
		
		System.out.println("컴퓨터가 실행 중입니다.");
		computer.onSound();
		
		computer.offPwer();
		System.out.println();
	}

}
