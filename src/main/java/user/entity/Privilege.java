package user.entity;

/**
 * Ȩ�ޱ�
 * 
 * @author fengcheng
 *
 */
public class Privilege {
	private String id;// id
	private String role_id;// ��ɫid
	private String privilege;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	@Override
	public String toString() {
		return "Privilege [id=" + id + ", role_id=" + role_id + ", privilege=" + privilege + "]";
	}

}
