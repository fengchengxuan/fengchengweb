package product.entity;

/**
 * ��ƷС��
 * 
 * @author fengcheng
 *
 */
public class ProductInfo {
	private String id;// id
	private String product_id;// ��Ʒ����id
	private String pro_classe;// ����λ
	private String version;// �汾��
	private String service_time;// ����ʱ��
	private float price;// ��ͼ۸�

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getPro_classe() {
		return pro_classe;
	}

	public void setPro_classe(String pro_classe) {
		this.pro_classe = pro_classe;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getService_time() {
		return service_time;
	}

	public void setService_time(String service_time) {
		this.service_time = service_time;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "productInfo [id=" + id + ", product_id=" + product_id + ", pro_classe=" + pro_classe + ", version="
				+ version + ", service_time=" + service_time + ", price=" + price + "]";
	}

}
