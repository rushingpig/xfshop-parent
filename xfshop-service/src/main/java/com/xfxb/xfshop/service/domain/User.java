package com.xfxb.xfshop.service.domain;

/**
 * @author pigo.can
 * @email rushingpig@163.com
 * @homepage http://www.pigo.top
 * @date 2015年11月12日 下午10:05:04
 * @ver V1.0
 */
public class User extends BaseDomain<User>{

	private Integer id;
	private String name;
	private Role role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User(Integer id, String name, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}

	public User() {
		super();
		
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", role=" + role + "]";
	}

}
