package com.lzf.code.alliance.resp;

import com.fasterxml.jackson.annotation.JsonInclude;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewsResp implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键Id 
	 */
	private Integer id;

	/**
	 * 新闻标题 
	 */
	private String title;

	/**
	 * 图片URI 
	 */
	private String imageUri;

	/**
	 * 新闻内容 
	 */
	private String content;

	/**
	 * 新闻纯文字内容 
	 */
	private String contentText;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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
		return "NewsResp{" +
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