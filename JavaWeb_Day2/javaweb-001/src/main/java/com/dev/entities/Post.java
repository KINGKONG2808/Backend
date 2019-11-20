package com.dev.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_post")
public class Post extends BaseEntity {
	@Column(name = "title", length = 200, nullable = false)
	private String title;

	@Column(name = "description", length = 2000, nullable = false)
	private String description;

	@Lob
	@Column(name = "details", nullable = false, columnDefinition = "text")
	private String details;

	@Column(name = "status", nullable = true)
	private Boolean status;

	@Column(name = "create_date", nullable = false)
	private Date createdDate;
	
	@Column(name = "price", precision = 13, scale = 2, nullable = false)
	private BigDecimal price;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "post_category_id")
	private Categories category;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

}
