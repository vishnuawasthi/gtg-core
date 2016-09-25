package com.gtg.core.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gtg_user")
public class User extends AuditEntity implements Serializable {

	private static final long serialVersionUID = 2754929437344581828L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true)
	private Long id;

	@Column(name = "first_name", length = 320)
	private String firstName;

	@Column(name = "last_name", length = 320)
	private String lastName;

	@Column(name = "email", length = 320)
	private String email;

	@Column(name = "user_name", length = 320, unique = true, nullable = false)
	private String username;

	@Column(name = "password", length = 320, nullable = false)
	private String password;

	@Column(name = "api_key", length = 320, updatable = true)
	private String apiKey;

	@Column(name = "lockout")
	private Boolean lockout;

	@Column(name = "api_key_expire_time")
	private Date apikeyExpireTime;

	@ManyToOne
	@JoinColumn(name = "user_rules_id")
	private UserRules userRules;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public Boolean getLockout() {
		return lockout;
	}

	public void setLockout(Boolean lockout) {
		this.lockout = lockout;
	}

	public Date getApikeyExpireTime() {
		return apikeyExpireTime;
	}

	public void setApikeyExpireTime(Date apikeyExpireTime) {
		this.apikeyExpireTime = apikeyExpireTime;
	}

	public UserRules getUserRules() {
		return userRules;
	}

	public void setUserRules(UserRules userRules) {
		this.userRules = userRules;
	}

}
