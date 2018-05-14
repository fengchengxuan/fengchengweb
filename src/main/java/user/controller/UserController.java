package user.controller;


import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import FreeAppNum.service.FreeAppNumService;
import freeapply.entity.FreeApplyNum;
import user.entity.FcUser;
import user.service.UserService;

@Controller
public class UserController {
	@Autowired
	Map<String ,Object> map;
	@Autowired
	UserService   userService;
	@Autowired
	FreeAppNumService   freeAppNumService;

    @ModelAttribute
    public void init(){
        map=new HashMap();
        map.put("ok", false);
     
    }

	@RequestMapping("/reqister")//注册
	public @ResponseBody Map<String, Object> register(String userName ,String password) {
		boolean ok=userService.register(userName,password);
		map.put("ok", ok);
		return map;
	}
	@RequestMapping("/login")//首页登录
	public @ResponseBody Map<String, Object> login(HttpServletRequest request,String userName ,String password) {
	FcUser fcUser=	userService.login(userName, password);
	if(fcUser!=null) {
		HttpSession session=request.getSession();
		session.setAttribute("user", fcUser);//存入session
		map.put("megs", fcUser);
	}
	return map;
	}
	@RequestMapping("/adminLogin")//后台登录
	public @ResponseBody Map<String, Object>  adminLogin(HttpSession session,String userName ,String password) {
		FcUser fcUser=	userService.adminlogin(userName, password);
		if(fcUser!=null) {
			session.setAttribute("adminUser", fcUser);//存入session
			map.put("megs", fcUser);
		}
		return map;
	}
	
	@RequestMapping("/logOut")//前台退出
	public @ResponseBody Map<String, Object> logOut(HttpSession session) {
		session.removeAttribute("user");
		map.put("ok", true);
		return map;
	}
	@RequestMapping("/adminLogOut")//后台退出
	public @ResponseBody Map<String, Object> adminLogOut(HttpSession session) {
		session.removeAttribute("adminUser");
		map.put("ok", true);
		return map;
	}
	
	@RequestMapping("/updateUserInfo")//会员基本信息
	public @ResponseBody Map<String, Object> updateUserInfo() {
		userService.updateUserInfo();
		return map;
	}
	@RequestMapping("/addFcUser")//添加会员
	public  @ResponseBody Map<String, Object> addFcUser(String userName ,String Password ,int roleId ,int priviledgeId) {
		userService.addFcUser(userName, Password, roleId, priviledgeId);
		return map;
	}
	@RequestMapping("/removeFcUser")//删除会员
	public  @ResponseBody Map<String, Object>  removeFcUser(int fcUserId) {
		userService.removeFcUser(fcUserId);
		map.put("ok", true);
		return map;
	}
	@RequestMapping("/updateFcUser")//修改会员
	public  @ResponseBody Map<String, Object>  updateFcUser(int fcUserId) {//修改会员（具体参数没有）
		userService.updateFcUser(fcUserId);
		map.put("ok", true);
		return map;
	}
	
	@RequestMapping("/getFreeAppNum")//获取免费体验名额
	public List<FreeApplyNum> getFreeAppNum() {
		//return userService
		return freeAppNumService.getFreeAppNum();
	}

}
