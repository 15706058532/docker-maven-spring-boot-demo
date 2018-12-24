package com.lzf.code.babasport.resp;

import com.fasterxml.jackson.annotation.JsonInclude;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
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
public class OrderDetailResp implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键Id 
	 */
	private Long id;

	/**
	 * 订单Id 
	 */
	private Long orderId;

	/**
	 * 库存Id -->因为库存Id才能定位到一条具体的商品 
	 */
	private Long skuId;

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
	 * 商品价格 
	 */
	private Double productPrice;

	/**
	 * 商品颜色 
	 */
	private String productColor;

	/**
	 * 商品尺寸 
	 */
	private String productSize;

	/**
	 * 购买的数量 
	 */
	private Integer num;

	/**
	 * 创建时间 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

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

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSkuId() {
		return skuId;
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

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor == null ? null : productColor.trim();
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize == null ? null : productSize.trim();
	}

	public String getProductSize() {
		return productSize;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getNum() {
		return num;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	@Override
	public String toString() {
		return "OrderDetailResp{" +
				"id=" + id +
				", orderId=" + orderId +
				", skuId=" + skuId +
				", productId=" + productId +
				", productNo='" + productNo + '\'' +
				", productName='" + productName + '\'' +
				", productPrice=" + productPrice +
				", productColor='" + productColor + '\'' +
				", productSize='" + productSize + '\'' +
				", num=" + num +
				", createTime=" + createTime +
				"}";
	}
}