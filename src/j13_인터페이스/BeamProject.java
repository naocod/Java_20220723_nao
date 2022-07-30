package j13_인터페이스;

public class BeamProject implements VGA {

	@Override
	public void connect() {
		System.out.println("빔프로젝트를 연결합니다.");
	}

	@Override
	public void disConnect() {
		System.out.println("빔프로젝트 연결을 해제합니다.");
	}

}
