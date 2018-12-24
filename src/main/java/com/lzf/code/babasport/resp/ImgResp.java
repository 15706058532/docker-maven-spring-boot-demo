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
public class ImgResp implements Serializable {
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
	 * 图片URI 
	 */
	private String uri;

	/**
	 * 是否默认:0否 1:是 
	 */
	private Integer isDef;

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

	@Override
	public String toString() {
		return "ImgResp{" +
				"id=" + id +
				", productId=" + productId +
				", uri='" + uri + '\'' +
				", isDef=" + isDef +
				"}";
	}
}