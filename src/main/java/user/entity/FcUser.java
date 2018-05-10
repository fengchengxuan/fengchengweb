package user.entity;

import java.util.Date;

/**
 * �û���
 * 
 * @author fengcheng
 *
 */
public class FcUser {
	private int id;// id
	private int role_id;// �û���ɫid
	private int privilege_id;// Ȩ��id
	private String username;// �û���
	private String password;// ����
	private String profile_photo;// ͷ���ַ
	private String pwd_safe_question;// �ܱ�����
	private String pwd_safe_answer;// �ܱ�����
	private int prod_kind_id;// ��ҵ����id
	private int comp_type_id;// ��˾����id
	private int app_type_id;// ����������id
	private String oper_addr;// ��Ӫ��ַ
	private String phone;// �̶��绰
	private String tel;// �ֻ���
	private String email;// ����
	private String wechart;// QQ/΢��
	private String demand;// ����������󼰷���ʱ��
	private String ip;// �û�ip
	private String location;// �û�λ�ã�����ip��ȡ
	private String company;// ��˾����
	private String website;// ��˾��վ
	private int user_status_id;// �û�״̬��0�����ߣ� 1������
	private String user_intent;// �û��ڱ�վ��ά��
	private Date regi_time;// ע��ʱ��
	private String user_status;// 0-δע�᣻1-��ע��(δ��¼)��2-�ѵ�¼��3-������������飻4-�����������ͨ����5-�������������ͨ��

	

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
