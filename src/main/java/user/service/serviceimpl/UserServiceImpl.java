package user.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.dao.*;
import user.entity.FcUser;
import user.entity.Role;
import user.service.UserService;
@Service
public  class UserServiceImpl implements UserService{
     @Autowired
     UserDao userDao;
	public boolean register(String userName, String password) {
		// TODO Auto-generated method stub
		FcUser fcUser=new FcUser();
		fcUser.setUsername(userName);
		fcUser.setPassword(password);
		if(userName.indexOf("@")>0) {
			fcUser.setEmail(userName);
		}else {
			fcUser.setTel(userName);
		}
		userDao.register(fcUser);
		return true;
	}

	public FcUser login(String userName, String password) {
		// TODO Auto-generated method stub
		return userDao.login(userName, password);
	}

	public FcUser adminlogin(String userName, String password) {
		// TODO Auto-generated method stub
		FcUser fcUser=userDao.login(userName, password);
		if(fcUser!=null) {//是否存在
				if(fcUser.getRole_id()!=0)
					return fcUser;
			}
		return null;
	}

	public void updateUserInfo() {
		// TODO Auto-generated method stub
		
	}

	public void addFcUser(String userName, String passWord, int roleId, int priviledgeId) {//添加会员
		// TODO Auto-generated method stub
		FcUser fcUser=new FcUser();
		fcUser.setUsername(userName);
		fcUser.setPassword(passWord);
		fcUser.setRole_id(roleId);
		fcUser.setPrivilege_id(priviledgeId);
		userDao.register(fcUser);
	}

	public void removeFcUser(int fcUserId) {
		// TODO Auto-generated method stub
		userDao.removeFcUser(fcUserId);
	
	}

	public void updateFcUser(int fcUserId) {
		// TODO Auto-generated method stub
		FcUser fcUser= userDao.findFcUser(fcUserId);
		userDao.updateFcUser(fcUser);
	}

	public List<FcUser> getFcUser(String tel, String password, String operAddr) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<FcUser> register() {
		// TODO Auto-generated method stub
		return null;
	}

	public FcUser appFree(int fcUserId) {
		// TODO Auto-generated method stub
		return null;
	}



}
