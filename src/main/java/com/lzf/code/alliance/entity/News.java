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
@Table(name = "tb_news")
public class News implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键Id 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	/**
	 * 新闻标题 
	 */
	@Column(name = "title")
	private String title;

	/**
	 * 图片URI 
	 */
	@Column(name = "image_uri")
	private String imageUri;

	/**
	 * 新闻内容 
	 */
	@Column(name = "content")
	private String content;

	/**
	 * 新闻纯文字内容 
	 */
	@Column(name = "content_text")
	private String contentText;

	@Column(name = "create_time")
	private Date createTime;

	@Column(name = "update_time")
	private Date updateTime;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getTitle() {
		return title;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri == null ? null : imageUri.trim();
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public String getContent() {
		return content;
	}

	public void setContentText(String contentText) {
		this.contentText = contentText == null ? null : contentText.trim();
	}

	public String getContentText() {
		return contentText;
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
		return "News{" +
				"id=" + id +
				", title='" + title + '\'' +
				", imageUri='" + imageUri + '\'' +
				", content='" + content + '\'' +
				", contentText='" + contentText + '\'' +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				"}";
	}
}