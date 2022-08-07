package j18_컬렉션.service;

import java.util.Iterator;
import java.util.Scanner;

import j18_컬렉션.repository.User;
import j18_컬렉션.repository.UserRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserServiceImpl implements UserService {

	private Scanner scanner;
	private UserRepository userRepository;
	
	@Override
	public void addUser() {
		User user = new User();
		System.out.println("[ 사용자 정보 추가 ]");
		System.out.print("아이디: ");
		user.setUsername(scanner.nextLine());
		
		System.out.print("비밀번호: ");
		user.setPassword(scanner.nextLine());
		
		System.out.print("이름: ");
		user.setName(scanner.nextLine());
		
		System.out.print("이메일: ");
		user.setEmail(scanner.nextLine());
		
		userRepository.addUser(user);
	}

	@Override
	public void showUserAll() {
		
		Iterator<User> iterator = userRepository.getUserListAll();
		
		while(iterator.hasNext()) { // 다음이 있는지 확인(boolean)
			User user = iterator.next();
			
			System.out.println("username > " + user.getUsername());
			System.out.println("password > " + user.getPassword());
			System.out.println("name > " + user.getName());
			System.out.println("email > " + user.getEmail());
			System.out.println();

		}
	}

	@Override
	public void findUser() {
		String username = null;
		
		System.out.println("[ 사용자 아이디로 유저 정보 조회 ]");
		System.out.print("조회 할 아이디: ");
		username = scanner.nextLine();
		System.out.println();
		
		User user = userRepository.findUserByUsername(username);
		if(user == null) {
			System.out.println("해당 아이디는 존재하지 않습니다.");
			return;
		}
		System.out.println("username > " + user.getUsername());
		System.out.println("password > " + user.getPassword());
		System.out.println("name > " + user.getName());
		System.out.println("email > " + user.getEmail());
		System.out.println();
		
	}

	@Override
	public void modifyUserEmail() {
		String username = null;
		String email = null;
		
		System.out.println("[ 사용자 아이디로 유저 이메일 수정 ]");
		System.out.print("수정 할 아이디: ");
		username = scanner.nextLine();
		
		User user = userRepository.findUserByUsername(username);
		if(user == null) {
			System.out.println("해당 아이디는 존재하지 않습니다.");
			return;
		}
		
		System.out.println("이메일: ");
		email = scanner.nextLine();
		System.out.println();
		
		boolean status = userRepository.updateUserEmail(user, email);
		
		if(status) {
			System.out.println("수정 완료");
		}
	}

	@Override
	public void modifyUserPassword() {
		String username = null;
		String password = null;
		String newPassword = null;
		
		System.out.println("[ 사용자 아이디로 유저 비밀번호 수정 ]");
		System.out.print("수정 할 아이디: ");
		username = scanner.nextLine();
		
		User user = userRepository.findUserByUsername(username);
		if(user == null) {
			System.out.println("해당 아이디는 존재하지 않습니다.");
			return;
		}
		
		System.out.print("기존 비밀번호: ");
		password = scanner.nextLine();
		
		System.out.print("새 비밀번호: ");
		newPassword = scanner.nextLine();
		
		boolean status = userRepository.updateUserPassword(user, password, newPassword);
		
		if(status) {
			System.out.println("비밀번호 수정 완료");
		}else {
			System.out.println("기존 비밀번호가 일치하지 않습니다.");
		}
				
	}

	@Override
	public void removeUser() {
		String username = null;
		
		System.out.println("[ 사용자 아이디로 유저 삭제 ]");
		System.out.print("삭제 할 아이디: ");
		username = scanner.nextLine();
		
		User user = userRepository.findUserByUsername(username);
		if(user == null) {
			System.out.println("해당 아이디는 존재하지 않습니다.");
			return;
		}
		
		boolean status = userRepository.deleteUserByUsername(user);
		if(status) {
			System.out.println("삭제 완료");
		}else {
			System.out.println("삭제 실패");
		}
	}

}
