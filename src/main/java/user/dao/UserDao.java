package user.dao;

import java.util.List;

import user.entity.FcUser;
import user.entity.Role;

public interface UserDao {
	void register(FcUser fcUser);//保存
	FcUser login(String userName ,String password );//查询
	Role findRole(int id);//权限
	void removeFcUser(int fcUserId);//删除
	 void updateFcUser(FcUser fcUser);//更新
	 FcUser findFcUser(int fcUserId);//查询
}
