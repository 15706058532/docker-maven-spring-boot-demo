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
public class TypeReq implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键 
	 */
	private Long id;

	/**
	 * 名称 
	 */
	private String name;

	/**
	 * 父ID 
	 */
	private Long parentId;

	/**
	 * 父ID 开始值
	 */
	private Long parentIdStart;

	/**
	 * 父ID 结束值
	 */
	private Long parentIdEnd;

	/**
	 * 备注,用于google搜索页面描述 
	 */
	private String note;

	/**
	 * 是否可见 1:可见 0:不可见 
	 */
	private Integer isDisplay;

	/**
	 * 是否可见 1:可见 0:不可见 开始值
	 */
	private Integer isDisplayStart;

	/**
	 * 是否可见 1:可见 0:不可见 结束值
	 */
	private Integer isDisplayEnd;

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

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentIdStart(Long parentIdStart) {
		this.parentIdStart = parentIdStart;
	}

	public Long getParentIdStart() {
		return parentIdStart;
	}

	public void setParentIdEnd(Long parentIdEnd) {
		this.parentIdEnd = parentIdEnd;
	}

	public Long getParentIdEnd() {
		return parentIdEnd;
	}

	public void setNote(String note) {
		this.note = note == null ? null : note.trim();
	}

	public String getNote() {
		return note;
	}

	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}

	public Integer getIsDisplay() {
		return isDisplay;
	}

	public void setIsDisplayStart(Integer isDisplayStart) {
		this.isDisplayStart = isDisplayStart;
	}

	public Integer getIsDisplayStart() {
		return isDisplayStart;
	}

	public void setIsDisplayEnd(Integer isDisplayEnd) {
		this.isDisplayEnd = isDisplayEnd;
	}

	public Integer getIsDisplayEnd() {
		return isDisplayEnd;
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
		return "TypeReq{" +
				"id=" + id +
				", name='" + name + '\'' +
				", parentId=" + parentId +
				", note='" + note + '\'' +
				", isDisplay=" + isDisplay +
				", page=" + page +
				", pageSize=" + pageSize +
				", orderByClause=" + orderByClause +
				"}";
	}
}