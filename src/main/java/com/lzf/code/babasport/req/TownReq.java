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
public class TownReq implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键 
	 */
	private Long id;

	/**
	 * 区县编码 
	 */
	private String code;

	/**
	 * 区县名称 
	 */
	private String name;

	/**
	 * 所属城市编码 
	 */
	private String cityCode;

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

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getCode() {
		return code;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getName() {
		return name;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode == null ? null : cityCode.trim();
	}

	public String getCityCode() {
		return cityCode;
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
		return "TownReq{" +
				"id=" + id +
				", code='" + code + '\'' +
				", name='" + name + '\'' +
				", cityCode='" + cityCode + '\'' +
				", page=" + page +
				", pageSize=" + pageSize +
				", orderByClause=" + orderByClause +
				"}";
	}
}