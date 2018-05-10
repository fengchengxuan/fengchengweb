package user.service;

import java.util.List;

import user.entity.FcUser;

public interface UserService {
	
	boolean register(String userName ,String password);//�˺� ���� ע������
	FcUser login(String userName ,String password);
	FcUser adminlogin(String userName ,String password);
	void updateUserInfo();
	void addFcUser(String userName ,String Password ,String roleId ,String priviledgeId);
	void removeFcUser(String fcUserId);
	void updateFcUser(String fcUserId);
	List<FcUser> getFcUser(String tel,String password,String operAddr);
	List<FcUser> register();
	FcUser appFree(String fcUserId);
	
}
