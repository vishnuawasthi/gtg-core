package com.gtg.core.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "gtg_user_rules")
@SequenceGenerator(sequenceName="gtg_user_rules_seq",name="gtg_user_rules_seq",initialValue=1)
public class UserRules extends AuditEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="gtg_user_rules_seq")
	@Column(name = "id", unique = true)
	private Long id;

	@Column(name = "rule_name", nullable = false, unique = true)
	private String ruleName;

	@Column(name = "description")
	private String description;

	@OneToMany(mappedBy = "userRules")
	private Set<User> users = new HashSet<User>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
