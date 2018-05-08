package order.entity;
/**
 * 订单评价
 * @author fengcheng
 *
 */

import java.util.Date;

public class OrderJudge {
	private String id;// id
	private String pro_order_id;// product 表的 id
	private String fcuser_id;// 用户id
	private String repay_id;// 回复id, 与product_judge表的id进行关联
	private Date judge_time;// 评价时间
	private String content;// 评论内容
	private int is_include_sensitive;// 是否含敏感词
	private String sensitive_word;// 敏感词
	private String judge_class;// 评价类型：1-好评，0-差评
	private String judge_status;// 评价状态：1-正常，0-拦截
	private String judge_start;// 评价状态：0-0星，1-1星，2-2星，3-3星，4-4星，5-5星

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPro_order_id() {
		return pro_order_id;
	}

	public void setPro_order_id(String pro_order_id) {
		this.pro_order_id = pro_order_id;
	}

	public String getFcuser_id() {
		return fcuser_id;
	}

	public void setFcuser_id(String fcuser_id) {
		this.fcuser_id = fcuser_id;
	}

	public String getRepay_id() {
		return repay_id;
	}

	public void setRepay_id(String repay_id) {
		this.repay_id = repay_id;
	}

	public Date getJudge_time() {
		return judge_time;
	}

	public void setJudge_time(Date judge_time) {
		this.judge_time = judge_time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getIs_include_sensitive() {
		return is_include_sensitive;
	}

	public void setIs_include_sensitive(int is_include_sensitive) {
		this.is_include_sensitive = is_include_sensitive;
	}

	public String getSensitive_word() {
		return sensitive_word;
	}

	public void setSensitive_word(String sensitive_word) {
		this.sensitive_word = sensitive_word;
	}

	public String getJudge_class() {
		return judge_class;
	}

	public void setJudge_class(String judge_class) {
		this.judge_class = judge_class;
	}

	public String getJudge_status() {
		return judge_status;
	}

	public void setJudge_status(String judge_status) {
		this.judge_status = judge_status;
	}

	public String getJudge_start() {
		return judge_start;
	}

	public void setJudge_start(String judge_start) {
		this.judge_start = judge_start;
	}

	@Override
	public String toString() {
		return "orderJudge [id=" + id + ", pro_order_id=" + pro_order_id + ", fcuser_id=" + fcuser_id + ", repay_id="
				+ repay_id + ", judge_time=" + judge_time + ", content=" + content + ", is_include_sensitive="
				+ is_include_sensitive + ", sensitive_word=" + sensitive_word + ", judge_class=" + judge_class
				+ ", judge_status=" + judge_status + ", judge_start=" + judge_start + "]";
	}

}
