package product.entity;

import java.util.Date;

/**
 * 产品订单
 * 
 * @author fengcheng
 *
 */
public class ProOrder {
	private String id;// id
	private String fcuser_id;// 用户id
	private String prod_cart_id;// product表的 id
	private String order_no;// 订单编号
	private String order_type;// 订单类型：0-免费订单；1-付费订单
	private Date order_date;// 订单日期
	private String order_status;// 订单状态：0-未支付；1-已支付；2-订单完成；4-订单关闭

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
