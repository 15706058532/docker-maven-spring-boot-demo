package com.lzf.code.babasport.entity;

import javax.persistence.*;
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
@Entity
@Table(name = "bbs_sku")
public class Sku implements Serializable {
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
	 * 商品编号 
	 */
	@Column(name = "product_no")
	private String productNo;

	/**
	 * 颜色ID 
	 */
	@Column(name = "color_id")
	private Long colorId;

	/**
	 * 颜色名称 
	 */
	@Column(name = "color_name")
	private String colorName;

	/**
	 * 尺码 
	 */
	@Column(name = "size")
	private String size;

	/**
	 * 运费 默认10元 
	 */
	@Column(name = "delive_fee")
	private Double deliveFee;

	/**
	 * 售价 
	 */
	@Column(name = "sku_price")
	private Double skuPrice;

	/**
	 * 库存 
	 */
	@Column(name = "stock_inventory")
	private Integer stockInventory;

	/**
	 * 购买限制 
	 */
	@Column(name = "sku_upper_limit")
	private Integer skuUpperLimit;

	/**
	 * 仓库位置:货架号 
	 */
	@Column(name = "location")
	private String location;

	/**
	 * SKU图片  精确到颜色及尺码对应的图片 
	 */
	@Column(name = "sku_img")
	private String skuImg;

	/**
	 * 前台显示排序 
	 */
	@Column(name = "sku_sort")
	private Integer skuSort;

	/**
	 * SKU名称 
	 */
	@Column(name = "sku_name")
	private String skuName;

	/**
	 * 市场价 
	 */
	@Column(name = "market_price")
	private Double marketPrice;

	@Column(name = "create_time")
	private Date createTime;

	@Column(name = "update_time")
	private Date updateTime;

	@Column(name = "create_user_id")
	private Long createUserId;

	@Column(name = "update_user_id")
	private Long updateUserId;

	/**
	 * 0,历史 1最新 
	 */
	@Column(name = "last_status")
	private Integer lastStatus;

	/**
	 * 0:赠品,1普通 
	 */
	@Column(name = "sku_type")
	private Integer skuType;

	/**
	 * 销量 
	 */
	@Column(name = "sales")
	private Integer sales;

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

	public void setProductNo(String productNo) {
		this.productNo = productNo == null ? null : productNo.trim();
	}

	public String getProductNo() {
		return productNo;
	}

	public void setColorId(Long colorId) {
		this.colorId = colorId;
	}

	public Long getColorId() {
		return colorId;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName == null ? null : colorName.trim();
	}

	public String getColorName() {
		return colorName;
	}

	public void setSize(String size) {
		this.size = size == null ? null : size.trim();
	}

	public String getSize() {
		return size;
	}

	public void setDeliveFee(Double deliveFee) {
		this.deliveFee = deliveFee;
	}

	public Double getDeliveFee() {
		return deliveFee;
	}

	public void setSkuPrice(Double skuPrice) {
		this.skuPrice = skuPrice;
	}

	public Double getSkuPrice() {
		return skuPrice;
	}

	public void setStockInventory(Integer stockInventory) {
		this.stockInventory = stockInventory;
	}

	public Integer getStockInventory() {
		return stockInventory;
	}

	public void setSkuUpperLimit(Integer skuUpperLimit) {
		this.skuUpperLimit = skuUpperLimit;
	}

	public Integer getSkuUpperLimit() {
		return skuUpperLimit;
	}

	public void setLocation(String location) {
		this.location = location == null ? null : location.trim();
	}

	public String getLocation() {
		return location;
	}

	public void setSkuImg(String skuImg) {
		this.skuImg = skuImg == null ? null : skuImg.trim();
	}

	public String getSkuImg() {
		return skuImg;
	}

	public void setSkuSort(Integer skuSort) {
		this.skuSort = skuSort;
	}

	public Integer getSkuSort() {
		return skuSort;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName == null ? null : skuName.trim();
	}

	public String getSkuName() {
		return skuName;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Double getMarketPrice() {
		return marketPrice;
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

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Long getUpdateUserId() {
		return updateUserId;
	}

	public void setLastStatus(Integer lastStatus) {
		this.lastStatus = lastStatus;
	}

	public Integer getLastStatus() {
		return lastStatus;
	}

	public void setSkuType(Integer skuType) {
		this.skuType = skuType;
	}

	public Integer getSkuType() {
		return skuType;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public Integer getSales() {
		return sales;
	}

	@Override
	public String toString() {
		return "Sku{" +
				"id=" + id +
				", productId=" + productId +
				", productNo='" + productNo + '\'' +
				", colorId=" + colorId +
				", colorName='" + colorName + '\'' +
				", size='" + size + '\'' +
				", deliveFee=" + deliveFee +
				", skuPrice=" + skuPrice +
				", stockInventory=" + stockInventory +
				", skuUpperLimit=" + skuUpperLimit +
				", location='" + location + '\'' +
				", skuImg='" + skuImg + '\'' +
				", skuSort=" + skuSort +
				", skuName='" + skuName + '\'' +
				", marketPrice=" + marketPrice +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				", createUserId=" + createUserId +
				", updateUserId=" + updateUserId +
				", lastStatus=" + lastStatus +
				", skuType=" + skuType +
				", sales=" + sales +
				"}";
	}
}