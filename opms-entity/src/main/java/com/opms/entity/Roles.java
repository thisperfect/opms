package com.opms.entity;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class Roles implements java.io.Serializable {

	private Integer id;
	private String enable;// 是否禁用角色　1　表示禁用　2　表示不禁用
	private String name;
	private String roleKey;// 唯一,新境时,需要判断
	private String description;
	private Set<Resource> resources = new HashSet<Resource>(0);

	public Roles() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEnable() {
		return this.enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Resource> getResources() {
		return resources;
	}

	public void setResources(Set<Resource> resources) {
		this.resources = resources;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRoleKey() {
		return roleKey;
	}

	public void setRoleKey(String roleKey) {
		this.roleKey = roleKey;
	}

}