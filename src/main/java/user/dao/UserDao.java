package user.dao;

import java.util.List;

import user.entity.FcUser;
import user.entity.Role;

public interface UserDao {
	void register(FcUser fcUser);//����
	FcUser login(String userName ,String password );//��ѯ
	Role findRole(int id);//Ȩ��
	void removeFcUser(int fcUserId);//ɾ��
	 void updateFcUser(FcUser fcUser);//����
	 FcUser findFcUser(int fcUserId);//��ѯ
}
