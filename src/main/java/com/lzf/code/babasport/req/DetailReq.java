package com.lzf.code.babasport.req;

import java.io.Serializable;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 20:08:59
 * <br/>
 *
 * @author Li zhenfeng
 */
public class DetailReq implements Serializable {
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
	 * 订单ID 开始值
	 */
	private Long orderIdStart;

	/**
	 * 订单ID 结束值
	 */
	private Long orderIdEnd;

	/**
	 * 商品Id 
	 */
	private Long productId;

	/**
	 * 商品Id 开始值
	 */
	private Long productIdStart;

	/**
	 * 商品Id 结束值
	 */
	private Long productIdEnd;

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
	 * 商品销售价 开始值
	 */
	private Double skuPriceStart;

	/**
	 * 商品销售价 结束值
	 */
	private Double skuPriceEnd;

	/**
	 * 购买数量 
	 */
	private Integer amount;

	/**
	 * 购买数量 开始值
	 */
	private Integer amountStart;

	/**
	 * 购买数量 结束值
	 */
	private Integer amountEnd;

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

	public void setOrderIdStart(Long orderIdStart) {
		this.orderIdStart = orderIdStart;
	}

	public Long getOrderIdStart() {
		return orderIdStart;
	}

	public void setOrderIdEnd(Long orderIdEnd) {
		this.orderIdEnd = orderIdEnd;
	}

	public Long getOrderIdEnd() {
		return orderIdEnd;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductIdStart(Long productIdStart) {
		this.productIdStart = productIdStart;
	}

	public Long getProductIdStart() {
		return productIdStart;
	}

	public void setProductIdEnd(Long productIdEnd) {
		this.productIdEnd = productIdEnd;
	}

	public Long getProductIdEnd() {
		return productIdEnd;
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

	public void setSkuPriceStart(Double skuPriceStart) {
		this.skuPriceStart = skuPriceStart;
	}

	public Double getSkuPriceStart() {
		return skuPriceStart;
	}

	public void setSkuPriceEnd(Double skuPriceEnd) {
		this.skuPriceEnd = skuPriceEnd;
	}

	public Double getSkuPriceEnd() {
		return skuPriceEnd;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmountStart(Integer amountStart) {
		this.amountStart = amountStart;
	}

	public Integer getAmountStart() {
		return amountStart;
	}

	public void setAmountEnd(Integer amountEnd) {
		this.amountEnd = amountEnd;
	}

	public Integer getAmountEnd() {
		return amountEnd;
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
		return "DetailReq{" +
				"id=" + id +
				", orderId=" + orderId +
				", productId=" + productId +
				", productNo='" + productNo + '\'' +
				", productName='" + productName + '\'' +
				", color='" + color + '\'' +
				", size='" + size + '\'' +
				", skuPrice=" + skuPrice +
				", amount=" + amount +
				", page=" + page +
				", pageSize=" + pageSize +
				", orderByClause=" + orderByClause +
				"}";
	}
}