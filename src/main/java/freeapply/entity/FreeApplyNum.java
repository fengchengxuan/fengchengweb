package freeapply.entity;

import java.util.Date;

/**
 * 显示免费体验名额
 * 
 * @author fengcheng
 *
 */
public class FreeApplyNum {
	private String id;// id
	private String fcuser_id;// 外键，和fcuser表的id键建立关联
	private int num;// 开放名额
	private Date starttime;// 开放截止时间
	private int passNum;// 已获审批名额
	private int restNum;// 剩下名额

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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public int getPassNum() {
		return passNum;
	}

	public void setPassNum(int passNum) {
		this.passNum = passNum;
	}

	public int getRestNum() {
		return restNum;
	}

	public void setRestNum(int restNum) {
		this.restNum = restNum;
	}

	@Override
	public String toString() {
		return "FreeApplyNum [id=" + id + ", fcuser_id=" + fcuser_id + ", num=" + num + ", starttime=" + starttime
				+ ", passNum=" + passNum + ", restNum=" + restNum + "]";
	}

}
