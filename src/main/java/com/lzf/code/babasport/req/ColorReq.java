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
public class ColorReq implements Serializable {
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
	 * 父ID为色系 
	 */
	private Long parentId;

	/**
	 * 父ID为色系 开始值
	 */
	private Long parentIdStart;

	/**
	 * 父ID为色系 结束值
	 */
	private Long parentIdEnd;

	/**
	 * 颜色对应的衣服小图 
	 */
	private String imgUrl;

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

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl == null ? null : imgUrl.trim();
	}

	public String getImgUrl() {
		return imgUrl;
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
		return "ColorReq{" +
				"id=" + id +
				", name='" + name + '\'' +
				", parentId=" + parentId +
				", imgUrl='" + imgUrl + '\'' +
				", page=" + page +
				", pageSize=" + pageSize +
				", orderByClause=" + orderByClause +
				"}";
	}
}