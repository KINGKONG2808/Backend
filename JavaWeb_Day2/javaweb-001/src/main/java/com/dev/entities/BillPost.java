package com.dev.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_bill_post")
public class BillPost extends BaseEntity {

	@Column(name = "product_id")
	private Integer productId;

	@Column(name = "price", precision = 13, scale = 2, nullable = true)
	private BigDecimal price;

	@Column(name = "quality")
	private Double quality;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "bill_id")
	private Bill bill;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Double getQuality() {
		return quality;
	}

	public void setQuality(Double quality) {
		this.quality = quality;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

}
