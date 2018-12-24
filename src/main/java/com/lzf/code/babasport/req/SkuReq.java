package com.lzf.code.babasport.req;

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
public class SkuReq implements Serializable {
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
	 * 商品ID 开始值
	 */
	private Long productIdStart;

	/**
	 * 商品ID 结束值
	 */
	private Long productIdEnd;

	/**
	 * 商品编号 
	 */
	private String productNo;

	/**
	 * 颜色ID 
	 */
	private Long colorId;

	/**
	 * 颜色ID 开始值
	 */
	private Long colorIdStart;

	/**
	 * 颜色ID 结束值
	 */
	private Long colorIdEnd;

	/**
	 * 颜色名称 
	 */
	private String colorName;

	/**
	 * 尺码 
	 */
	private String size;

	/**
	 * 运费 默认10元 
	 */
	private Double deliveFee;

	/**
	 * 运费 默认10元 开始值
	 */
	private Double deliveFeeStart;

	/**
	 * 运费 默认10元 结束值
	 */
	private Double deliveFeeEnd;

	/**
	 * 售价 
	 */
	private Double skuPrice;

	/**
	 * 售价 开始值
	 */
	private Double skuPriceStart;

	/**
	 * 售价 结束值
	 */
	private Double skuPriceEnd;

	/**
	 * 库存 
	 */
	private Integer stockInventory;

	/**
	 * 库存 开始值
	 */
	private Integer stockInventoryStart;

	/**
	 * 库存 结束值
	 */
	private Integer stockInventoryEnd;

	/**
	 * 购买限制 
	 */
	private Integer skuUpperLimit;

	/**
	 * 购买限制 开始值
	 */
	private Integer skuUpperLimitStart;

	/**
	 * 购买限制 结束值
	 */
	private Integer skuUpperLimitEnd;

	/**
	 * 仓库位置:货架号 
	 */
	private String location;

	/**
	 * SKU图片  精确到颜色及尺码对应的图片 
	 */
	private String skuImg;

	/**
	 * 前台显示排序 
	 */
	private Integer skuSort;

	/**
	 * 前台显示排序 开始值
	 */
	private Integer skuSortStart;

	/**
	 * 前台显示排序 结束值
	 */
	private Integer skuSortEnd;

	/**
	 * SKU名称 
	 */
	private String skuName;

	/**
	 * 市场价 
	 */
	private Double marketPrice;

	/**
	 * 市场价 开始值
	 */
	private Double marketPriceStart;

	/**
	 * 市场价 结束值
	 */
	private Double marketPriceEnd;

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

	private Long createUserId;

	private Long createUserIdStart;

	private Long createUserIdEnd;

	private Long updateUserId;

	private Long updateUserIdStart;

	private Long updateUserIdEnd;

	/**
	 * 0,历史 1最新 
	 */
	private Integer lastStatus;

	/**
	 * 0,历史 1最新 开始值
	 */
	private Integer lastStatusStart;

	/**
	 * 0,历史 1最新 结束值
	 */
	private Integer lastStatusEnd;

	/**
	 * 0:赠品,1普通 
	 */
	private Integer skuType;

	/**
	 * 0:赠品,1普通 开始值
	 */
	private Integer skuTypeStart;

	/**
	 * 0:赠品,1普通 结束值
	 */
	private Integer skuTypeEnd;

	/**
	 * 销量 
	 */
	private Integer sales;

	/**
	 * 销量 开始值
	 */
	private Integer salesStart;

	/**
	 * 销量 结束值
	 */
	private Integer salesEnd;

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

	public void setColorId(Long colorId) {
		this.colorId = colorId;
	}

	public Long getColorId() {
		return colorId;
	}

	public void setColorIdStart(Long colorIdStart) {
		this.colorIdStart = colorIdStart;
	}

	public Long getColorIdStart() {
		return colorIdStart;
	}

	public void setColorIdEnd(Long colorIdEnd) {
		this.colorIdEnd = colorIdEnd;
	}

	public Long getColorIdEnd() {
		return colorIdEnd;
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

	public void setDeliveFeeStart(Double deliveFeeStart) {
		this.deliveFeeStart = deliveFeeStart;
	}

	public Double getDeliveFeeStart() {
		return deliveFeeStart;
	}

	public void setDeliveFeeEnd(Double deliveFeeEnd) {
		this.deliveFeeEnd = deliveFeeEnd;
	}

	public Double getDeliveFeeEnd() {
		return deliveFeeEnd;
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

	public void setStockInventory(Integer stockInventory) {
		this.stockInventory = stockInventory;
	}

	public Integer getStockInventory() {
		return stockInventory;
	}

	public void setStockInventoryStart(Integer stockInventoryStart) {
		this.stockInventoryStart = stockInventoryStart;
	}

	public Integer getStockInventoryStart() {
		return stockInventoryStart;
	}

	public void setStockInventoryEnd(Integer stockInventoryEnd) {
		this.stockInventoryEnd = stockInventoryEnd;
	}

	public Integer getStockInventoryEnd() {
		return stockInventoryEnd;
	}

	public void setSkuUpperLimit(Integer skuUpperLimit) {
		this.skuUpperLimit = skuUpperLimit;
	}

	public Integer getSkuUpperLimit() {
		return skuUpperLimit;
	}

	public void setSkuUpperLimitStart(Integer skuUpperLimitStart) {
		this.skuUpperLimitStart = skuUpperLimitStart;
	}

	public Integer getSkuUpperLimitStart() {
		return skuUpperLimitStart;
	}

	public void setSkuUpperLimitEnd(Integer skuUpperLimitEnd) {
		this.skuUpperLimitEnd = skuUpperLimitEnd;
	}

	public Integer getSkuUpperLimitEnd() {
		return skuUpperLimitEnd;
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

	public void setSkuSortStart(Integer skuSortStart) {
		this.skuSortStart = skuSortStart;
	}

	public Integer getSkuSortStart() {
		return skuSortStart;
	}

	public void setSkuSortEnd(Integer skuSortEnd) {
		this.skuSortEnd = skuSortEnd;
	}

	public Integer getSkuSortEnd() {
		return skuSortEnd;
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

	public void setMarketPriceStart(Double marketPriceStart) {
		this.marketPriceStart = marketPriceStart;
	}

	public Double getMarketPriceStart() {
		return marketPriceStart;
	}

	public void setMarketPriceEnd(Double marketPriceEnd) {
		this.marketPriceEnd = marketPriceEnd;
	}

	public Double getMarketPriceEnd() {
		return marketPriceEnd;
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

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserIdStart(Long createUserIdStart) {
		this.createUserIdStart = createUserIdStart;
	}

	public Long getCreateUserIdStart() {
		return createUserIdStart;
	}

	public void setCreateUserIdEnd(Long createUserIdEnd) {
		this.createUserIdEnd = createUserIdEnd;
	}

	public Long getCreateUserIdEnd() {
		return createUserIdEnd;
	}

	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Long getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserIdStart(Long updateUserIdStart) {
		this.updateUserIdStart = updateUserIdStart;
	}

	public Long getUpdateUserIdStart() {
		return updateUserIdStart;
	}

	public void setUpdateUserIdEnd(Long updateUserIdEnd) {
		this.updateUserIdEnd = updateUserIdEnd;
	}

	public Long getUpdateUserIdEnd() {
		return updateUserIdEnd;
	}

	public void setLastStatus(Integer lastStatus) {
		this.lastStatus = lastStatus;
	}

	public Integer getLastStatus() {
		return lastStatus;
	}

	public void setLastStatusStart(Integer lastStatusStart) {
		this.lastStatusStart = lastStatusStart;
	}

	public Integer getLastStatusStart() {
		return lastStatusStart;
	}

	public void setLastStatusEnd(Integer lastStatusEnd) {
		this.lastStatusEnd = lastStatusEnd;
	}

	public Integer getLastStatusEnd() {
		return lastStatusEnd;
	}

	public void setSkuType(Integer skuType) {
		this.skuType = skuType;
	}

	public Integer getSkuType() {
		return skuType;
	}

	public void setSkuTypeStart(Integer skuTypeStart) {
		this.skuTypeStart = skuTypeStart;
	}

	public Integer getSkuTypeStart() {
		return skuTypeStart;
	}

	public void setSkuTypeEnd(Integer skuTypeEnd) {
		this.skuTypeEnd = skuTypeEnd;
	}

	public Integer getSkuTypeEnd() {
		return skuTypeEnd;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSalesStart(Integer salesStart) {
		this.salesStart = salesStart;
	}

	public Integer getSalesStart() {
		return salesStart;
	}

	public void setSalesEnd(Integer salesEnd) {
		this.salesEnd = salesEnd;
	}

	public Integer getSalesEnd() {
		return salesEnd;
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
		return "SkuReq{" +
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
				", page=" + page +
				", pageSize=" + pageSize +
				", orderByClause=" + orderByClause +
				"}";
	}
}