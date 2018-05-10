package common.entity;

import java.util.Date;

/**
 * 投诉建议
 * 
 * @author fengcheng
 *
 */
public class ComplainAdvice {
	private int id;// id
	private String fcuser_id;// 用户id
	private Date ca_time;// 时间
	private String ca_no;// 投诉/建议编号
	private String ca_type;// 类型：0-投诉；1-建议
	private String content;// 内容
	private String status;// 状态：0-未处理；1-已处理
	private String handler;// 处理人
	private String handle_result;// 处理结果

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFcuser_id() {
		return fcuser_id;
	}

	public void setFcuser_id(String fcuser_id) {
		this.fcuser_id = fcuser_id;
	}

	public Date getCa_time() {
		return ca_time;
	}

	public void setCa_time(Date ca_time) {
		this.ca_time = ca_time;
	}

	public String getCa_no() {
		return ca_no;
	}

	public void setCa_no(String ca_no) {
		this.ca_no = ca_no;
	}

	public String getCa_type() {
		return ca_type;
	}

	public void setCa_type(String ca_type) {
		this.ca_type = ca_type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHandler() {
		return handler;
	}

	public void setHandler(String handler) {
		this.handler = handler;
	}

	public String getHandle_result() {
		return handle_result;
	}

	public void setHandle_result(String handle_result) {
		this.handle_result = handle_result;
	}

	@Override
	public String toString() {
		return "ComplainAdvice [id=" + id + ", fcuser_id=" + fcuser_id + ", ca_time=" + ca_time + ", ca_no=" + ca_no
				+ ", ca_type=" + ca_type + ", content=" + content + ", status=" + status + ", handler=" + handler
				+ ", handle_result=" + handle_result + "]";
	}

}
