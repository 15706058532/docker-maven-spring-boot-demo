package com.lzf.code.alliance.req;

import org.springframework.format.annotation.DateTimeFormat;
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
public class NewsReq implements Serializable {
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
	private Date createTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTimeStart;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTimeEnd;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTimeStart;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTimeEnd;

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

	public void setCreateTimeStart(Date createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public Date getCreateTimeStart() {
		return createTimeStart;
	}

	public void setCreateTimeEnd(Date createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public Date getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTimeStart(Date updateTimeStart) {
		this.updateTimeStart = updateTimeStart;
	}

	public Date getUpdateTimeStart() {
		return updateTimeStart;
	}

	public void setUpdateTimeEnd(Date updateTimeEnd) {
		this.updateTimeEnd = updateTimeEnd;
	}

	public Date getUpdateTimeEnd() {
		return updateTimeEnd;
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
		return "NewsReq{" +
				"id=" + id +
				", title='" + title + '\'' +
				", imageUri='" + imageUri + '\'' +
				", content='" + content + '\'' +
				", contentText='" + contentText + '\'' +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				", page=" + page +
				", pageSize=" + pageSize +
				", orderByClause=" + orderByClause +
				"}";
	}
}