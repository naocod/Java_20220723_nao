package j18_컬렉션;

import java.util.Scanner;

import j18_컬렉션.Set.UserSetRepository;
import j18_컬렉션.repository.UserRepository;
import j18_컬렉션.repository.List.UserListRepository;
import j18_컬렉션.service.UserService;
import j18_컬렉션.service.UserServiceImpl;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserManagementApplication {
	
	private Scanner scanner;
	private UserService userService;
	
	public void start() {
		while(true) {
			String select = null;
			
			System.out.println("[ 사용자 정보 관리 프로그램 ]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 전체 조회");
			System.out.println("3. 사용자 아이디로 검색");
			System.out.println("4. 사용자 이메일 수정");
			System.out.println("5. 사용자 비밀번호 수정");
			System.out.println("6. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			
			System.out.print("메뉴 선택: ");
			select = scanner.nextLine();
			
			if(select.equals("1")){
				userService.addUser();
			}else if(select.equals("2")) {
				userService.showUserAll();
			}else if(select.equals("3")) {
				userService.findUser();
			}else if(select.equals("4")) {
				userService.modifyUserEmail();
			}else if(select.equals("5")) {
				userService.modifyUserPassword();
			}else if(select.equals("6")) {
				userService.removeUser();
			}else if(select.equals("q")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("다시 선택");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
//		UserRepository userRepository = new UserListRepository(); // userRepository 객체 생성 (업캐스팅) > List
		UserRepository userRepository = new UserSetRepository(); // userRepository 객체 생성 (업캐스팅) > Set
		UserService userService = new UserServiceImpl(scanner, userRepository); // scanner와 userRepository를 가진 userService 객체 생성
		
		UserManagementApplication application = new UserManagementApplication(scanner, userService);
		application.start();

	}

}
