package com.dev.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_bill")
public class Bill extends BaseEntity {

	@Column(name = "name", length = 100, nullable = false)
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bill", fetch = FetchType.EAGER)
	private List<BillPost> billPosts = new ArrayList<BillPost>();

	public void addBillPost(BillPost billPost) {
		billPosts.add(billPost);
		billPost.setBill(this);
	}

	public void removeBillPost(BillPost billPost) {
		billPosts.remove(billPost);
		billPost.setBill(null);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
