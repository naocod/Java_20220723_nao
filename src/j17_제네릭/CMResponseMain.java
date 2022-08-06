package j17_제네릭;

public class CMResponseMain {

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		
		CMRespDto<?> cmRespDto = controller.getUserData(); // 자료형 User
		System.out.println(cmRespDto);
		
		CMRespDto<?> cmRespDtoUsername = controller.getUsernameData(); // 자료형 String
		System.out.println(cmRespDtoUsername);
		
		
		
	}
}
