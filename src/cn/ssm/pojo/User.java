package cn.ssm.pojo;
/**
 * 与数据库表smbms_user对应的一个java实体类
 * @author lindy
 * @创建时间 2020年3月24日上午10:59:06
 */

import java.util.Date;
import java.util.List;

public class User {
	private int id;// 主键id
	private String userCode;// 用户编码
	private String userName;// 用户名
	private String userPassword;// 密码
	private int gender;// 性别
	private Date birthday;// 出生日期
	private String phone;// 联系方式
	private String address;// 地址
	private int userRole;// 用户角色id
	private int createdBy;// 创建者id
	private Date creationDate;// 创建时间
	private int modifyBy;// 修改者id
	private Date modifyDate;// 修改时间
	// 1对1  有一个自定义的引用类型属性
	// resultMap的高级映射
	// 1对一 引用了一个另外的java实体类
	//private Role role; // 角色类
	
	//添加一个属性，保存改用户的所有地址信息  1个id对应有多条另外的数据
	// 一对多 表示引用了另外的一个列表(结果集)
	//private List<Address> adds;
	
	/*
	 * private String roleName; public String getRoleName() { return roleName; }
	 * public void setRoleName(String roleName) { this.roleName = roleName; }
	 */
	 
    /*public List<Address> getAdds() {
    	return adds;
    }
    public void setAdds(List<Address> adds) {
    	this.adds = adds;
    }*/
    /*public Role getRole() {
    	return role;
    }
    public void setRole(Role role) {
    	this.role = role;
    }*/
	public User() {
		super();
	}
	public User(String userName, int userRole) {
		this.userName=userName;
		this.userRole=userRole;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUserRole() {
		return userRole;
	}
	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
