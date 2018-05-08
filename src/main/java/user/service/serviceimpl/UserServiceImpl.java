package user.service.serviceimpl;

import java.util.List;

import user.entity.FcUser;
import user.service.UserService;

public class UserServiceImpl implements UserService{

	public boolean register(String userName, String password, String type) {
		// TODO Auto-generated method stub
		return false;
	}

	public FcUser login(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public FcUser admin(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUserInfo() {
		// TODO Auto-generated method stub
		
	}

	public void addFcUser(String userName, String Password, String roleId, String priviledgeId) {
		// TODO Auto-generated method stub
		
	}

	public void removeFcUser(String fcUserId) {
		// TODO Auto-generated method stub
		
	}

	public void updateFcUser(String fcUserId) {
		// TODO Auto-generated method stub
		
	}

	public List<FcUser> getFcUser(String tel, String password, String operAddr) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<FcUser> register() {
		// TODO Auto-generated method stub
		return null;
	}

	public FcUser appFree(String fcUserId) {
		// TODO Auto-generated method stub
		return null;
	}

}
