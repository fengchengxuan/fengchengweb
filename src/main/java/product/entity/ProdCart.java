package product.entity;

/**
 * 购物车
 * 
 * @author fengcheng
 *
 */
public class ProdCart {
	private String id;// id
	private String fcuser_id;// 用户id
	private String product_id;// product表的 id
	private String product_info_id;// product_info表的 id
	private float origin_price;// 原价
	private float for_sale;// 优惠价
	private float totle_price;// 总价

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

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_info_id() {
		return product_info_id;
	}

	public void setProduct_info_id(String product_info_id) {
		this.product_info_id = product_info_id;
	}

	public float getOrigin_price() {
		return origin_price;
	}

	public void setOrigin_price(float origin_price) {
		this.origin_price = origin_price;
	}

	public float getFor_sale() {
		return for_sale;
	}

	public void setFor_sale(float for_sale) {
		this.for_sale = for_sale;
	}

	public float getTotle_price() {
		return totle_price;
	}

	public void setTotle_price(float totle_price) {
		this.totle_price = totle_price;
	}

	@Override
	public String toString() {
		return "ProdCart [id=" + id + ", fcuser_id=" + fcuser_id + ", product_id=" + product_id + ", product_info_id="
				+ product_info_id + ", origin_price=" + origin_price + ", for_sale=" + for_sale + ", totle_price="
				+ totle_price + "]";
	}

}
