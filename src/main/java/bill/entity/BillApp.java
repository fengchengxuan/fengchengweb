package bill.entity;

import java.util.Date;

public class BillApp {
	private String id;// id
	private String app_type;// ��������
	private String bill_type;// ��Ʊ����
	private String bill_title;// ��Ʊ̧ͷ
	private String fcuser_id;// �û�id
	private Date bill_create_date;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApp_type() {
		return app_type;
	}

	public void setApp_type(String app_type) {
		this.app_type = app_type;
	}

	public String getBill_type() {
		return bill_type;
	}

	public void setBill_type(String bill_type) {
		this.bill_type = bill_type;
	}

	public String getBill_title() {
		return bill_title;
	}

	public void setBill_title(String bill_title) {
		this.bill_title = bill_title;
	}

	public String getFcuser_id() {
		return fcuser_id;
	}

	public void setFcuser_id(String fcuser_id) {
		this.fcuser_id = fcuser_id;
	}

	public Date getBill_create_date() {
		return bill_create_date;
	}

	public void setBill_create_date(Date bill_create_date) {
		this.bill_create_date = bill_create_date;
	}

	@Override
	public String toString() {
		return "BillApp [id=" + id + ", app_type=" + app_type + ", bill_type=" + bill_type + ", bill_title="
				+ bill_title + ", fcuser_id=" + fcuser_id + ", bill_create_date=" + bill_create_date + "]";
	}

}
