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
@Table(name = "bbs_feature")
public class Feature implements Serializable {
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

	@Column(name = "value")
	private String value;

	/**
	 * 前台排序 
	 */
	@Column(name = "sort")
	private Integer sort;

	/**
	 * 是否废弃:1:未废弃,0:废弃了 
	 */
	@Column(name = "is_del")
	private Integer isDel;

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

	public void setValue(String value) {
		this.value = value == null ? null : value.trim();
	}

	public String getValue() {
		return value;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getSort() {
		return sort;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public Integer getIsDel() {
		return isDel;
	}

	@Override
	public String toString() {
		return "Feature{" +
				"id=" + id +
				", name='" + name + '\'' +
				", value='" + value + '\'' +
				", sort=" + sort +
				", isDel=" + isDel +
				"}";
	}
}