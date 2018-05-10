package user.entity;

/**
 * 权限表
 * 
 * @author fengcheng
 *
 */
public class Privilege {
	private int id;// id
	private String role_id;// 角色id
	private String privilege;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
