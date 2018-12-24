package com.lzf.code.alliance.entity;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-25 00:12:16
 * <br/>
 *
 * @author Li zhenfeng
 */
@Entity
@Table(name = "tb_promotion")
public class Promotion implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键Id 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	/**
	 * 显示顺序 
	 */
	@Column(name = "sequence")
	private Integer sequence;

	/**
	 * 内容 
	 */
	@Column(name = "content")
	private String content;

	/**
	 * 创建时间 
	 */
	@Column(name = "create_time")
	private Date createTime;

	/**
	 * 修改时间 
	 */
	@Column(name = "update_time")
	private Date updateTime;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public String getContent() {
		return content;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	@Override
	public String toString() {
		return "Promotion{" +
				"id=" + id +
				", sequence=" + sequence +
				", content='" + content + '\'' +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				"}";
	}
}