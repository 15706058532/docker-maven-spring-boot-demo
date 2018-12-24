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
public class DetailResp implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键 
	 */
	private Long id;

	/**
	 * 订单ID 
	 */
	private Long orderId;

	/**
	 * 商品Id 
	 */
	private Long productId;

	/**
	 * 商品编号 
	 */
	private String productNo;

	/**
	 * 商品名称 
	 */
	private String productName;

	/**
	 *  颜色名称 
	 */
	private String color;

	/**
	 * 尺码 
	 */
	private String size;

	/**
	 * 商品销售价 
	 */
	private Double skuPrice;

	/**
	 * 购买数量 
	 */
	private Integer amount;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo == null ? null : productNo.trim();
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductName(String productName) {
		this.productName = productName == null ? null : productName.trim();
	}

	public String getProductName() {
		return productName;
	}

	public void setColor(String color) {
		this.color = color == null ? null : color.trim();
	}

	public String getColor() {
		return color;
	}

	public void setSize(String size) {
		this.size = size == null ? null : size.trim();
	}

	public String getSize() {
		return size;
	}

	public void setSkuPrice(Double skuPrice) {
		this.skuPrice = skuPrice;
	}

	public Double getSkuPrice() {
		return skuPrice;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "DetailResp{" +
				"id=" + id +
				", orderId=" + orderId +
				", productId=" + productId +
				", productNo='" + productNo + '\'' +
				", productName='" + productName + '\'' +
				", color='" + color + '\'' +
				", size='" + size + '\'' +
				", skuPrice=" + skuPrice +
				", amount=" + amount +
				"}";
	}
}