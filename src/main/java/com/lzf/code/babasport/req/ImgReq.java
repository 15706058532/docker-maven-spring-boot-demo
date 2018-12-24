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
public class ImgReq implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键 
	 */
	private Long id;

	/**
	 * 商品ID 
	 */
	private Long productId;

	/**
	 * 商品ID 开始值
	 */
	private Long productIdStart;

	/**
	 * 商品ID 结束值
	 */
	private Long productIdEnd;

	/**
	 * 图片URI 
	 */
	private String uri;

	/**
	 * 是否默认:0否 1:是 
	 */
	private Integer isDef;

	/**
	 * 是否默认:0否 1:是 开始值
	 */
	private Integer isDefStart;

	/**
	 * 是否默认:0否 1:是 结束值
	 */
	private Integer isDefEnd;

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

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductIdStart(Long productIdStart) {
		this.productIdStart = productIdStart;
	}

	public Long getProductIdStart() {
		return productIdStart;
	}

	public void setProductIdEnd(Long productIdEnd) {
		this.productIdEnd = productIdEnd;
	}

	public Long getProductIdEnd() {
		return productIdEnd;
	}

	public void setUri(String uri) {
		this.uri = uri == null ? null : uri.trim();
	}

	public String getUri() {
		return uri;
	}

	public void setIsDef(Integer isDef) {
		this.isDef = isDef;
	}

	public Integer getIsDef() {
		return isDef;
	}

	public void setIsDefStart(Integer isDefStart) {
		this.isDefStart = isDefStart;
	}

	public Integer getIsDefStart() {
		return isDefStart;
	}

	public void setIsDefEnd(Integer isDefEnd) {
		this.isDefEnd = isDefEnd;
	}

	public Integer getIsDefEnd() {
		return isDefEnd;
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
		return "ImgReq{" +
				"id=" + id +
				", productId=" + productId +
				", uri='" + uri + '\'' +
				", isDef=" + isDef +
				", page=" + page +
				", pageSize=" + pageSize +
				", orderByClause=" + orderByClause +
				"}";
	}
}