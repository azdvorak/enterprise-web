package enterpriseweb101.service;

import java.util.List;

import enterpriseweb101.model.User;

public interface UserService {
	
	User findById(long id);
	User findByName(String name);
	void saveUser(User user);
	void updateUser(User user);
	void deleteUserById(long id);
	List<User> findAllUsers();
	void deleteAllUsers();
	public boolean isUserExist(User user);

}
