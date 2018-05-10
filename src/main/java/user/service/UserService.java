package user.service;

import java.util.List;

import user.entity.FcUser;

public interface UserService {
	
	boolean register(String userName ,String password);//�˺� ���� 
	FcUser login(String userName ,String password);//��¼	
	FcUser adminlogin(String userName ,String password);//��̨��¼		
	void updateUserInfo();//��Ա������Ϣ
	void addFcUser(String userName ,String Password ,int roleId ,int priviledgeId);
	void removeFcUser(int fcUserId);
	void updateFcUser(int fcUserId);
	List<FcUser> getFcUser(String tel,String password,String operAddr);
	List<FcUser> register();
	FcUser appFree(int fcUserId);
	
}
