package j17_제네릭;

public class Controller {
	
	public CMRespDto<?> getUserData() { // 리턴타입을 명시해야하기 때문에 <?> 자료형 받을 때 사용
		System.out.println("사용자 정보를 가져다 줍니다.");
		User user = null;
		user = new User("junil", "1234");
		
		if(user == null) {
			return new CMRespDto<>(-1, "사용자 정보 가져오기 실패", "실패"); // 생성할때는 생략가능 <>, 만들어질 때 사용
		}
		
		return new CMRespDto<>(1, "사용자 정보 가져오기 성공", user); // 생략해서 쓰면 알아서 자료형을 인식함
	}
	
	public CMRespDto<? extends String> getUsernameData() { // 문자열을 상속받은 클래스들만 리턴 가능
		System.out.println("사용자 이름을 가져다 줍니다");
		
		return new CMRespDto<>(1, "사용자 이름 가져오기 성공", "junil");
	}

}
