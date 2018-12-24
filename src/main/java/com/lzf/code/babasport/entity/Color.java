package com.lzf.code.babasport.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 20:08:59
 * <br/>
 *
 * @author Li zhenfeng
 */
@Entity
@Table(name = "bbs_color")
public class Color implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/**
	 * 名称 
	 */
	@Column(name = "name")
	private String name;

	/**
	 * 父ID为色系 
	 */
	@Column(name = "parent_id")
	private Long parentId;

	/**
	 * 颜色对应的衣服小图 
	 */
	@Column(name = "img_url")
	private String imgUrl;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getName() {
		return name;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl == null ? null : imgUrl.trim();
	}

	public String getImgUrl() {
		return imgUrl;
	}

	@Override
	public String toString() {
		return "Color{" +
				"id=" + id +
				", name='" + name + '\'' +
				", parentId=" + parentId +
				", imgUrl='" + imgUrl + '\'' +
				"}";
	}
}