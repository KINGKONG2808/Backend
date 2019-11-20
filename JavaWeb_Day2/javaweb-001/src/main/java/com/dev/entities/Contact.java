package com.dev.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/** luu tru du lieu nguoi dung day len tu tang view */

/**
 * Lưu trữ dữ liệu người dùng đẩy lên từ tầng View.
 * @author admin
 */
@Entity
@Table(name = "tbl_contact")
public class Contact extends BaseEntity {
//	private String fullName;
//	private String email;
//	private String phone;
//	private String content;
	
	@Column(name = "full_name", length = 100, nullable = false)
	private String fullName;
	
	@Column(name = "email", length = 100, nullable = false)
	private String email;

	@Column(name = "phone", length = 100, nullable = true)
	private String phone;
	
	@Column(name = "content", length = 1000, nullable = false)
	private String content;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
