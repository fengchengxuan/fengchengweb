package bill.entity;

public class BillSendAddr {
	private String id;// id
	private String ba_id;// bill_app���id
	private String receiver;// �ռ���
	private String city;// ���ڵ���
	private String address;// ��ϸ��ַ
	private String mail_code;// �ʱ�
	private String phone;// �̶��绰
	private String tel;// �ֻ���

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBa_id() {
		return ba_id;
	}

	public void setBa_id(String ba_id) {
		this.ba_id = ba_id;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMail_code() {
		return mail_code;
	}

	public void setMail_code(String mail_code) {
		this.mail_code = mail_code;
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

	@Override
	public String toString() {
		return "BillSendAddr [id=" + id + ", ba_id=" + ba_id + ", receiver=" + receiver + ", city=" + city
				+ ", address=" + address + ", mail_code=" + mail_code + ", phone=" + phone + ", tel=" + tel + "]";
	}

}
