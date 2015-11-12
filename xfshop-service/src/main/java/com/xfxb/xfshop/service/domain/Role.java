package com.xfxb.xfshop.service.domain;

/**
 * @author pigo.can
 * @email rushingpig@163.com
 * @homepage http://www.pigo.top
 * @date 2015年11月12日 下午10:05:33
 * @ver V1.0
 */
public class Role {

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public Role() {
		super();
		
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

	@Override
	public String toString() {
		return "RoleBean [id=" + id + ", name=" + name + "]";
	}

	public Role(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
