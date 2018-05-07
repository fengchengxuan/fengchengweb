package article.entity;

import java.util.Date;

public class fccomment {
	private String id;
	private String article_id;
	private String fcuser_id;
	private String repay_id;
	private Date comm_time;
	private String content;
	private int is_include_sensitive;
	private String sensitive_word;
	private String submiter_addr;
	private String comment_type;
	private String comment_status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArticle_id() {
		return article_id;
	}

	public void setArticle_id(String article_id) {
		this.article_id = article_id;
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

	public Date getComm_time() {
		return comm_time;
	}

	public void setComm_time(Date comm_time) {
		this.comm_time = comm_time;
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

	public String getSubmiter_addr() {
		return submiter_addr;
	}

	public void setSubmiter_addr(String submiter_addr) {
		this.submiter_addr = submiter_addr;
	}

	public String getComment_type() {
		return comment_type;
	}

	public void setComment_type(String comment_type) {
		this.comment_type = comment_type;
	}

	public String getComment_status() {
		return comment_status;
	}

	public void setComment_status(String comment_status) {
		this.comment_status = comment_status;
	}

	@Override
	public String toString() {
		return "fccomment [id=" + id + ", article_id=" + article_id + ", fcuser_id=" + fcuser_id + ", repay_id="
				+ repay_id + ", comm_time=" + comm_time + ", content=" + content + ", is_include_sensitive="
				+ is_include_sensitive + ", sensitive_word=" + sensitive_word + ", submiter_addr=" + submiter_addr
				+ ", comment_type=" + comment_type + ", comment_status=" + comment_status + "]";
	}

}
