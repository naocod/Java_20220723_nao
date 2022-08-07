package j18_컬렉션.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import j18_컬렉션.repository.User;
import j18_컬렉션.repository.UserRepository;

public class UserSetRepository implements UserRepository{
	private Set<User> userSet;
	
	public UserSetRepository() {
		System.out.println("Set을 생성하여 데이터를 관리");
		userSet = new HashSet<User>();
	}
	
	@Override
	public boolean addUser(User user) {
		return userSet.add(user);
	}

	@Override
	public Iterator<User> getUserListAll() {
		return userSet.iterator();
	}

	@Override
	public User findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUserEmail(User user, String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUserPassword(User user, String password, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUserByUsername(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
