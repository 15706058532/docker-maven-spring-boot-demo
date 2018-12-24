package com.lzf.code.babasport.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 20:08:59
 * <br/>
 *
 * @author Li zhenfeng
 */
@Entity
@Table(name = "bbs_img")
public class Img implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/**
	 * 商品ID 
	 */
	@Column(name = "product_id")
	private Long productId;

	/**
	 * 图片URI 
	 */
	@Column(name = "uri")
	private String uri;

	/**
	 * 是否默认:0否 1:是 
	 */
	@Column(name = "is_def")
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
		return "Img{" +
				"id=" + id +
				", productId=" + productId +
				", uri='" + uri + '\'' +
				", isDef=" + isDef +
				"}";
	}
}