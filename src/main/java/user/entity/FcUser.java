package user.entity;

import java.util.Date;

/**
 * 用户表
 * 
 * @author fengcheng
 *
 */
public class FcUser {
	private int id;// id
	private int role_id;// 用户角色id
	private int privilege_id;// 权限id
	private String username;// 用户名
	private String password;// 密码
	private String profile_photo;// 头像地址
	private String pwd_safe_question;// 密保问题
	private String pwd_safe_answer;// 密保问题
	private int prod_kind_id;// 行业类型id
	private int comp_type_id;// 公司类型id
	private int app_type_id;// 申请人类型id
	private String oper_addr;// 经营地址
	private String phone;// 固定电话
	private String tel;// 手机号
	private String email;// 邮箱
	private String wechart;// QQ/微信
	private String demand;// 免费体验需求及服务时间
	private String ip;// 用户ip
	private String location;// 用户位置，根据ip获取
	private String company;// 公司名称
	private String website;// 公司网站
	private int user_status_id;// 用户状态：0：离线； 1：在线
	private String user_intent;// 用户在本站的维度
	private Date regi_time;// 注册时间
	private String user_status;// 0-未注册；1-已注册(未登录)；2-已登录；3-已申请免费体验；4-免费体验审批通过；5-免费体验审批不通过

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getPrivilege_id() {
		return privilege_id;
	}

	public void setPrivilege_id(int privilege_id) {
		this.privilege_id = privilege_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfile_photo() {
		return profile_photo;
	}

	public void setProfile_photo(String profile_photo) {
		this.profile_photo = profile_photo;
	}

	public String getPwd_safe_question() {
		return pwd_safe_question;
	}

	public void setPwd_safe_question(String pwd_safe_question) {
		this.pwd_safe_question = pwd_safe_question;
	}

	public String getPwd_safe_answer() {
		return pwd_safe_answer;
	}

	public void setPwd_safe_answer(String pwd_safe_answer) {
		this.pwd_safe_answer = pwd_safe_answer;
	}

	public int getProd_kind_id() {
		return prod_kind_id;
	}

	public void setProd_kind_id(int prod_kind_id) {
		this.prod_kind_id = prod_kind_id;
	}

	public int getComp_type_id() {
		return comp_type_id;
	}

	public void setComp_type_id(int comp_type_id) {
		this.comp_type_id = comp_type_id;
	}

	public int getApp_type_id() {
		return app_type_id;
	}

	public void setApp_type_id(int app_type_id) {
		this.app_type_id = app_type_id;
	}

	public String getOper_addr() {
		return oper_addr;
	}

	public void setOper_addr(String oper_addr) {
		this.oper_addr = oper_addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWechart() {
		return wechart;
	}

	public void setWechart(String wechart) {
		this.wechart = wechart;
	}

	public String getDemand() {
		return demand;
	}

	public void setDemand(String demand) {
		this.demand = demand;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public int getUser_status_id() {
		return user_status_id;
	}

	public void setUser_status_id(int user_status_id) {
		this.user_status_id = user_status_id;
	}

	public String getUser_intent() {
		return user_intent;
	}

	public void setUser_intent(String user_intent) {
		this.user_intent = user_intent;
	}

	public Date getRegi_time() {
		return regi_time;
	}

	public void setRegi_time(Date regi_time) {
		this.regi_time = regi_time;
	}

	public String getUser_status() {
		return user_status;
	}

	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}

	@Override
	public String toString() {
		return "FcUser [id=" + id + ", role_id=" + role_id + ", privilege_id=" + privilege_id + ", username=" + username
				+ ", password=" + password + ", profile_photo=" + profile_photo + ", pwd_safe_question="
				+ pwd_safe_question + ", pwd_safe_answer=" + pwd_safe_answer + ", prod_kind_id=" + prod_kind_id
				+ ", comp_type_id=" + comp_type_id + ", app_type_id=" + app_type_id + ", oper_addr=" + oper_addr
				+ ", phone=" + phone + ", tel=" + tel + ", email=" + email + ", wechart=" + wechart + ", demand="
				+ demand + ", ip=" + ip + ", location=" + location + ", company=" + company + ", website=" + website
				+ ", user_status_id=" + user_status_id + ", user_intent=" + user_intent + ", regi_time=" + regi_time
				+ ", user_status=" + user_status + "]";
	}

}
