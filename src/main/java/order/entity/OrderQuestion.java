package order.entity;

import java.util.Date;

/**
 * ��Ʒ��ѯ
 * 
 * @author fengcheng
 *
 */
public class OrderQuestion {
	private String id;// id
	private String product_info_id;// product_info ��� id
	private String fcuser_id;// �û�id
	private String repay_id;// �ظ�id, ��product_judge���id���й���
	private Date question_time;// ����ʱ��
	private String content;// ��������
	private int is_include_sensitive;// �Ƿ����д�
	private String sensitive_word;// ���д�
	private String judge_status;// ����״̬��1-������0-����

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct_info_id() {
		return product_info_id;
	}

	public void setProduct_info_id(String product_info_id) {
		this.product_info_id = product_info_id;
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

	public Date getQuestion_time() {
		return question_time;
	}

	public void setQuestion_time(Date question_time) {
		this.question_time = question_time;
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

	public String getJudge_status() {
		return judge_status;
	}

	public void setJudge_status(String judge_status) {
		this.judge_status = judge_status;
	}

	@Override
	public String toString() {
		return "orderQuestion [id=" + id + ", product_info_id=" + product_info_id + ", fcuser_id=" + fcuser_id
				+ ", repay_id=" + repay_id + ", question_time=" + question_time + ", content=" + content
				+ ", is_include_sensitive=" + is_include_sensitive + ", sensitive_word=" + sensitive_word
				+ ", judge_status=" + judge_status + "]";
	}

}
