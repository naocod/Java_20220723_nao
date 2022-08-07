package j18_컬렉션.repository;

import java.util.Iterator;

public interface UserRepository {

	public boolean addUser(User user);
	public Iterator<User> getUserListAll();
	public User findUserByUsername(String username);
	public boolean updateUserEmail(User user, String email);
	public boolean updateUserPassword(User user, String password, String newPassword);
	public boolean deleteUserByUsername(User user);
}
