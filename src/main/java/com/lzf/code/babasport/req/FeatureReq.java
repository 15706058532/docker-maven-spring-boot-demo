package com.lzf.code.babasport.req;

import java.io.Serializable;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 20:08:59
 * <br/>
 *
 * @author Li zhenfeng
 */
public class FeatureReq implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键 
	 */
	private Long id;

	/**
	 * 名称 
	 */
	private String name;

	private String value;

	/**
	 * 前台排序 
	 */
	private Integer sort;

	/**
	 * 前台排序 开始值
	 */
	private Integer sortStart;

	/**
	 * 前台排序 结束值
	 */
	private Integer sortEnd;

	/**
	 * 是否废弃:1:未废弃,0:废弃了 
	 */
	private Integer isDel;

	/**
	 * 是否废弃:1:未废弃,0:废弃了 开始值
	 */
	private Integer isDelStart;

	/**
	 * 是否废弃:1:未废弃,0:废弃了 结束值
	 */
	private Integer isDelEnd;

	/**
	 * 当前页数 
	 */
	private Integer page;

	/**
	 * 每页条数 
	 */
	private Integer pageSize;

	/**
	 * 排序字段及规则 
	 */
	private Integer orderByClause;

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

	public void setSortStart(Integer sortStart) {
		this.sortStart = sortStart;
	}

	public Integer getSortStart() {
		return sortStart;
	}

	public void setSortEnd(Integer sortEnd) {
		this.sortEnd = sortEnd;
	}

	public Integer getSortEnd() {
		return sortEnd;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDelStart(Integer isDelStart) {
		this.isDelStart = isDelStart;
	}

	public Integer getIsDelStart() {
		return isDelStart;
	}

	public void setIsDelEnd(Integer isDelEnd) {
		this.isDelEnd = isDelEnd;
	}

	public Integer getIsDelEnd() {
		return isDelEnd;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPage() {
		return page;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setOrderByClause(Integer orderByClause) {
		this.orderByClause = orderByClause;
	}

	public Integer getOrderByClause() {
		return orderByClause;
	}

	@Override
	public String toString() {
		return "FeatureReq{" +
				"id=" + id +
				", name='" + name + '\'' +
				", value='" + value + '\'' +
				", sort=" + sort +
				", isDel=" + isDel +
				", page=" + page +
				", pageSize=" + pageSize +
				", orderByClause=" + orderByClause +
				"}";
	}
}