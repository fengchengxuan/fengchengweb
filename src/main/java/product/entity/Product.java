package product.entity;

/**
 * ��Ʒ����
 * 
 * @author fengcheng
 *
 */
public class Product {
	private String id;// id
	private String pro_title;// ��Ʒ����
	private String pro_abstract;// ��ƷժҪ
	private String pic_url;// ��ƷͼƬ��ַ
	private float lowest_price;// ��ͼ۸�
	private String pro_classes;// ��ƷС�ࣨ����λ�������,�ö��Ÿ���
	private String versions;// �汾�ţ����,�ö��Ÿ���
	private String service_times;// ����ʱ�������,�ö��Ÿ���

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPro_title() {
		return pro_title;
	}

	public void setPro_title(String pro_title) {
		this.pro_title = pro_title;
	}

	public String getPro_abstract() {
		return pro_abstract;
	}

	public void setPro_abstract(String pro_abstract) {
		this.pro_abstract = pro_abstract;
	}

	public String getPic_url() {
		return pic_url;
	}

	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}

	public float getLowest_price() {
		return lowest_price;
	}

	public void setLowest_price(float lowest_price) {
		this.lowest_price = lowest_price;
	}

	public String getPro_classes() {
		return pro_classes;
	}

	public void setPro_classes(String pro_classes) {
		this.pro_classes = pro_classes;
	}

	public String getVersions() {
		return versions;
	}

	public void setVersions(String versions) {
		this.versions = versions;
	}

	public String getService_times() {
		return service_times;
	}

	public void setService_times(String service_times) {
		this.service_times = service_times;
	}

	@Override
	public String toString() {
		return "product [id=" + id + ", pro_title=" + pro_title + ", pro_abstract=" + pro_abstract + ", pic_url="
				+ pic_url + ", lowest_price=" + lowest_price + ", pro_classes=" + pro_classes + ", versions=" + versions
				+ ", service_times=" + service_times + "]";
	}

}
