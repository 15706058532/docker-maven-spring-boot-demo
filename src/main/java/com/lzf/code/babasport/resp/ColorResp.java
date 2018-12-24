package com.lzf.code.babasport.resp;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 20:08:59
 * <br/>
 *
 * @author Li zhenfeng
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ColorResp implements Serializable {
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
	 * 颜色对应的衣服小图 
	 */
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
		return "ColorResp{" +
				"id=" + id +
				", name='" + name + '\'' +
				", parentId=" + parentId +
				", imgUrl='" + imgUrl + '\'' +
				"}";
	}
}