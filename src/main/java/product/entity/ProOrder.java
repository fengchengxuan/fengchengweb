package product.entity;

import java.util.Date;

/**
 * ��Ʒ����
 * 
 * @author fengcheng
 *
 */
public class ProOrder {
	private String id;// id
	private String fcuser_id;// �û�id
	private String prod_cart_id;// product��� id
	private String order_no;// �������
	private String order_type;// �������ͣ�0-��Ѷ�����1-���Ѷ���
	private Date order_date;// ��������
	private String order_status;// ����״̬��0-δ֧����1-��֧����2-������ɣ�4-�����ر�

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFcuser_id() {
		return fcuser_id;
	}

	public void setFcuser_id(String fcuser_id) {
		this.fcuser_id = fcuser_id;
	}

	public String getProd_cart_id() {
		return prod_cart_id;
	}

	public void setProd_cart_id(String prod_cart_id) {
		this.prod_cart_id = prod_cart_id;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getOrder_type() {
		return order_type;
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	@Override
	public String toString() {
		return "proOrder [id=" + id + ", fcuser_id=" + fcuser_id + ", prod_cart_id=" + prod_cart_id + ", order_no="
				+ order_no + ", order_type=" + order_type + ", order_date=" + order_date + ", order_status="
				+ order_status + "]";
	}

}
