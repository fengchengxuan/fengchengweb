package bill.entity;

public class BillLogistics {
	private String id;// id
	private String ba_id;// bill_app表的id
	private String logistics_comp;// 物流公司
	private String logistics_no;
	private String logistics_info;// 物流单号

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

	public String getLogistics_comp() {
		return logistics_comp;
	}

	public void setLogistics_comp(String logistics_comp) {
		this.logistics_comp = logistics_comp;
	}

	public String getLogistics_no() {
		return logistics_no;
	}

	public void setLogistics_no(String logistics_no) {
		this.logistics_no = logistics_no;
	}

	public String getLogistics_info() {
		return logistics_info;
	}

	public void setLogistics_info(String logistics_info) {
		this.logistics_info = logistics_info;
	}

	@Override
	public String toString() {
		return "BillLogistics [id=" + id + ", ba_id=" + ba_id + ", logistics_comp=" + logistics_comp + ", logistics_no="
				+ logistics_no + ", logistics_info=" + logistics_info + "]";
	}

}
