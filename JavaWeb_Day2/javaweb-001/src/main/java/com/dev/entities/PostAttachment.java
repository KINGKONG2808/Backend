package com.dev.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.FetchType;

@Entity
@Table(name = "tbl_post_attachment")
public class PostAttachment extends BaseEntity {
	@Column(name = "name", length = 200, nullable = false)
	private String name;
	
	@Column(name = "path", length = 200, nullable = false)
	private String path;
	
	@Column(name = "mime", length = 200, nullable = false)
	private String mime;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "post_id")
	private Post post;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
}
