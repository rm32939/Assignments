package jdbc;

public class Role {

		private int roleId;
		private String rolename;
		public Role(int roleId, String rolename) {
			super();
			this.roleId = roleId;
			this.rolename = rolename;
		}
		public int getRoleId() {
			return roleId;
		}
		public void setRoleId(int roleId) {
			this.roleId = roleId;
		}
		public String getRolename() {
			return rolename;
		}
		public void setRolename(String rolename) {
			this.rolename = rolename;
		}
		@Override
		public String toString() {
			return "Role [roleId=" + roleId + ", rolename=" + rolename + "]";
		}
		
}
