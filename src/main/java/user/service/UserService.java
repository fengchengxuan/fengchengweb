package user.service;

import java.util.List;

import user.entity.FcUser;

public interface UserService {
	
	boolean register(String userName ,String password);//账号 密码 
	FcUser login(String userName ,String password);//登录	
	FcUser adminlogin(String userName ,String password);//后台登录		
	void updateUserInfo();//会员基本信息
	void addFcUser(String userName ,String Password ,int roleId ,int priviledgeId);
	void removeFcUser(int fcUserId);
	void updateFcUser(int fcUserId);
	List<FcUser> getFcUser(String tel,String password,String operAddr);
	List<FcUser> register();
	FcUser appFree(int fcUserId);
	
}
