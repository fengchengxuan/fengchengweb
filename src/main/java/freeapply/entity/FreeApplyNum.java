package freeapply.entity;

import java.util.Date;

/**
 * ��ʾ�����������
 * 
 * @author fengcheng
 *
 */
public class FreeApplyNum {
	private String id;// id
	private String fcuser_id;// �������fcuser���id����������
	private int num;// ��������
	private Date starttime;// ���Ž�ֹʱ��
	private int passNum;// �ѻ���������
	private int restNum;// ʣ������

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
