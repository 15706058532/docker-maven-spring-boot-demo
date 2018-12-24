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
public class TypeResp implements Serializable {
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
	 * 备注,用于google搜索页面描述 
	 */
	private String note;

	/**
	 * 是否可见 1:可见 0:不可见 
	 */
	private Integer isDisplay;

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

	@Override
	public String toString() {
		return "TypeResp{" +
				"id=" + id +
				", name='" + name + '\'' +
				", parentId=" + parentId +
				", note='" + note + '\'' +
				", isDisplay=" + isDisplay +
				"}";
	}
}