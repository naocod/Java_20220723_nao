package j18_컬렉션.repository.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import j18_컬렉션.repository.User;
import j18_컬렉션.repository.UserRepository;


public class UserListRepository implements UserRepository {
	
	private List<User> userList;
	
	public UserListRepository() {
		System.out.println("List를 생성하여 데이터를 관리");
		userList = new ArrayList<User>();
	}

	//추가
	@Override
	public boolean addUser(User user) {
		return userList.add(user);
	}

	//조회
	@Override
	public Iterator<User> getUserListAll() {
		return userList.iterator();
	}

	@Override
	public User findUserByUsername(String username) {
		
		for(User user : userList) {	// userList 전체에서 첫번째 값을 꺼내서 user에 대입
			if(user.getUsername().equals(username)) {
				return user;
			}
		}
		
//		for(int i = 0; i < userList.size(); i++) {
//			if(userList.get(i).getUsername().equals(username)) {
//				return userList.get(i);
//			}
//		}
		
		return null;
	}

	//수정
	@Override
	public boolean updateUserEmail(User user, String email) {
		user.setEmail(email);
		
		return true;
	}

	@Override
	public boolean updateUserPassword(User user, String password, String newPassword) {
		if(user.getPassword().equals(password)) {
			user.setPassword(newPassword);
			return true;
		}
		
		return false;
	}

	//삭제
	@Override
	public boolean deleteUserByUsername(User user) {
		userList.remove(user);
		return true;
	}
	
}
