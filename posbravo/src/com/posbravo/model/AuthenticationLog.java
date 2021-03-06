package com.posbravo.model;

// Generated Jun 10, 2014 6:20:56 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * AuthenticationLog generated by hbm2java
 */
public class AuthenticationLog implements java.io.Serializable {

	private Integer authenticationLogId;
	private Authentication authentication;
	private AuthenticationEventType authenticationEventType;
	private Date eventDate;
	private boolean isSuccess;

	public AuthenticationLog() {
	}

	public AuthenticationLog(Authentication authentication,
			AuthenticationEventType authenticationEventType, Date eventDate,
			boolean isSuccess) {
		this.authentication = authentication;
		this.authenticationEventType = authenticationEventType;
		this.eventDate = eventDate;
		this.isSuccess = isSuccess;
	}

	public Integer getAuthenticationLogId() {
		return this.authenticationLogId;
	}

	public void setAuthenticationLogId(Integer authenticationLogId) {
		this.authenticationLogId = authenticationLogId;
	}

	public Authentication getAuthentication() {
		return this.authentication;
	}

	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}

	public AuthenticationEventType getAuthenticationEventType() {
		return this.authenticationEventType;
	}

	public void setAuthenticationEventType(
			AuthenticationEventType authenticationEventType) {
		this.authenticationEventType = authenticationEventType;
	}

	public Date getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public boolean isIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

}
