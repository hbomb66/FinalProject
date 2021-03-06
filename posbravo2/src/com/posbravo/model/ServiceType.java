package com.posbravo.model;

// Generated Jun 10, 2014 6:20:56 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * ServiceType generated by hbm2java
 */
public class ServiceType implements java.io.Serializable {

	private Integer serviceTypeId;
	private String type;
	private Set services = new HashSet(0);

	public ServiceType() {
	}

	public ServiceType(String type) {
		this.type = type;
	}

	public ServiceType(String type, Set services) {
		this.type = type;
		this.services = services;
	}

	public Integer getServiceTypeId() {
		return this.serviceTypeId;
	}

	public void setServiceTypeId(Integer serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set getServices() {
		return this.services;
	}

	public void setServices(Set services) {
		this.services = services;
	}

}
