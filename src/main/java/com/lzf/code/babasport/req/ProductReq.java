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
public class ProductReq implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键 
	 */
	private Long id;

	/**
	 * 商品编号 
	 */
	private String no;

	/**
	 * 商品名称 
	 */
	private String name;

	/**
	 * 重量 单位:克 
	 */
	private Double weight;

	/**
	 * 重量 单位:克 开始值
	 */
	private Double weightStart;

	/**
	 * 重量 单位:克 结束值
	 */
	private Double weightEnd;

	/**
	 * 是否新品:0:旧品,1:新品 
	 */
	private Integer isNew;

	/**
	 * 是否新品:0:旧品,1:新品 开始值
	 */
	private Integer isNewStart;

	/**
	 * 是否新品:0:旧品,1:新品 结束值
	 */
	private Integer isNewEnd;

	/**
	 * 是否热销:0,否 1:是 
	 */
	private Integer isHot;

	/**
	 * 是否热销:0,否 1:是 开始值
	 */
	private Integer isHotStart;

	/**
	 * 是否热销:0,否 1:是 结束值
	 */
	private Integer isHotEnd;

	/**
	 * 上下架:0否 1是 
	 */
	private Integer isShow;

	/**
	 * 上下架:0否 1是 开始值
	 */
	private Integer isShowStart;

	/**
	 * 上下架:0否 1是 结束值
	 */
	private Integer isShowEnd;

	/**
	 * 推荐 1推荐 0 不推荐 
	 */
	private Integer isCommend;

	/**
	 * 推荐 1推荐 0 不推荐 开始值
	 */
	private Integer isCommendStart;

	/**
	 * 推荐 1推荐 0 不推荐 结束值
	 */
	private Integer isCommendEnd;

	/**
	 * 添加时间 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 添加时间 开始值
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTimeStart;

	/**
	 * 添加时间 结束值
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTimeEnd;

	/**
	 * 添加人ID 
	 */
	private Long createUserId;

	/**
	 * 添加人ID 开始值
	 */
	private Long createUserIdStart;

	/**
	 * 添加人ID 结束值
	 */
	private Long createUserIdEnd;

	/**
	 * 审核时间 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date checkTime;

	/**
	 * 审核时间 开始值
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date checkTimeStart;

	/**
	 * 审核时间 结束值
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date checkTimeEnd;

	/**
	 * 审核人ID 
	 */
	private Long checkUserId;

	/**
	 * 审核人ID 开始值
	 */
	private Long checkUserIdStart;

	/**
	 * 审核人ID 结束值
	 */
	private Long checkUserIdEnd;

	/**
	 * 类型ID 
	 */
	private Long typeId;

	/**
	 * 类型ID 开始值
	 */
	private Long typeIdStart;

	/**
	 * 类型ID 结束值
	 */
	private Long typeIdEnd;

	/**
	 * 品牌ID 
	 */
	private Long brandId;

	/**
	 * 品牌ID 开始值
	 */
	private Long brandIdStart;

	/**
	 * 品牌ID 结束值
	 */
	private Long brandIdEnd;

	/**
	 * 检索关键词 
	 */
	private String keywords;

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
	 * 商品描述 
	 */
	private String description;

	/**
	 * 包装清单 
	 */
	private String packageList;

	/**
	 * 商品属性集 
	 */
	private String feature;

	/**
	 * 颜色集 
	 */
	private String color;

	/**
	 * 尺寸集 
	 */
	private String size;

	/**
	 * 是否删除:0删除,1,没删除 
	 */
	private Integer isDel;

	/**
	 * 是否删除:0删除,1,没删除 开始值
	 */
	private Integer isDelStart;

	/**
	 * 是否删除:0删除,1,没删除 结束值
	 */
	private Integer isDelEnd;

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

	public void setNo(String no) {
		this.no = no == null ? null : no.trim();
	}

	public String getNo() {
		return no;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getName() {
		return name;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeightStart(Double weightStart) {
		this.weightStart = weightStart;
	}

	public Double getWeightStart() {
		return weightStart;
	}

	public void setWeightEnd(Double weightEnd) {
		this.weightEnd = weightEnd;
	}

	public Double getWeightEnd() {
		return weightEnd;
	}

	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}

	public Integer getIsNew() {
		return isNew;
	}

	public void setIsNewStart(Integer isNewStart) {
		this.isNewStart = isNewStart;
	}

	public Integer getIsNewStart() {
		return isNewStart;
	}

	public void setIsNewEnd(Integer isNewEnd) {
		this.isNewEnd = isNewEnd;
	}

	public Integer getIsNewEnd() {
		return isNewEnd;
	}

	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	public Integer getIsHot() {
		return isHot;
	}

	public void setIsHotStart(Integer isHotStart) {
		this.isHotStart = isHotStart;
	}

	public Integer getIsHotStart() {
		return isHotStart;
	}

	public void setIsHotEnd(Integer isHotEnd) {
		this.isHotEnd = isHotEnd;
	}

	public Integer getIsHotEnd() {
		return isHotEnd;
	}

	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}

	public Integer getIsShow() {
		return isShow;
	}

	public void setIsShowStart(Integer isShowStart) {
		this.isShowStart = isShowStart;
	}

	public Integer getIsShowStart() {
		return isShowStart;
	}

	public void setIsShowEnd(Integer isShowEnd) {
		this.isShowEnd = isShowEnd;
	}

	public Integer getIsShowEnd() {
		return isShowEnd;
	}

	public void setIsCommend(Integer isCommend) {
		this.isCommend = isCommend;
	}

	public Integer getIsCommend() {
		return isCommend;
	}

	public void setIsCommendStart(Integer isCommendStart) {
		this.isCommendStart = isCommendStart;
	}

	public Integer getIsCommendStart() {
		return isCommendStart;
	}

	public void setIsCommendEnd(Integer isCommendEnd) {
		this.isCommendEnd = isCommendEnd;
	}

	public Integer getIsCommendEnd() {
		return isCommendEnd;
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

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTimeStart(Date checkTimeStart) {
		this.checkTimeStart = checkTimeStart;
	}

	public Date getCheckTimeStart() {
		return checkTimeStart;
	}

	public void setCheckTimeEnd(Date checkTimeEnd) {
		this.checkTimeEnd = checkTimeEnd;
	}

	public Date getCheckTimeEnd() {
		return checkTimeEnd;
	}

	public void setCheckUserId(Long checkUserId) {
		this.checkUserId = checkUserId;
	}

	public Long getCheckUserId() {
		return checkUserId;
	}

	public void setCheckUserIdStart(Long checkUserIdStart) {
		this.checkUserIdStart = checkUserIdStart;
	}

	public Long getCheckUserIdStart() {
		return checkUserIdStart;
	}

	public void setCheckUserIdEnd(Long checkUserIdEnd) {
		this.checkUserIdEnd = checkUserIdEnd;
	}

	public Long getCheckUserIdEnd() {
		return checkUserIdEnd;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeIdStart(Long typeIdStart) {
		this.typeIdStart = typeIdStart;
	}

	public Long getTypeIdStart() {
		return typeIdStart;
	}

	public void setTypeIdEnd(Long typeIdEnd) {
		this.typeIdEnd = typeIdEnd;
	}

	public Long getTypeIdEnd() {
		return typeIdEnd;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandIdStart(Long brandIdStart) {
		this.brandIdStart = brandIdStart;
	}

	public Long getBrandIdStart() {
		return brandIdStart;
	}

	public void setBrandIdEnd(Long brandIdEnd) {
		this.brandIdEnd = brandIdEnd;
	}

	public Long getBrandIdEnd() {
		return brandIdEnd;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords == null ? null : keywords.trim();
	}

	public String getKeywords() {
		return keywords;
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

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setPackageList(String packageList) {
		this.packageList = packageList == null ? null : packageList.trim();
	}

	public String getPackageList() {
		return packageList;
	}

	public void setFeature(String feature) {
		this.feature = feature == null ? null : feature.trim();
	}

	public String getFeature() {
		return feature;
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

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDelStart(Integer isDelStart) {
		this.isDelStart = isDelStart;
	}

	public Integer getIsDelStart() {
		return isDelStart;
	}

	public void setIsDelEnd(Integer isDelEnd) {
		this.isDelEnd = isDelEnd;
	}

	public Integer getIsDelEnd() {
		return isDelEnd;
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
		return "ProductReq{" +
				"id=" + id +
				", no='" + no + '\'' +
				", name='" + name + '\'' +
				", weight=" + weight +
				", isNew=" + isNew +
				", isHot=" + isHot +
				", isShow=" + isShow +
				", isCommend=" + isCommend +
				", createTime=" + createTime +
				", createUserId=" + createUserId +
				", checkTime=" + checkTime +
				", checkUserId=" + checkUserId +
				", typeId=" + typeId +
				", brandId=" + brandId +
				", keywords='" + keywords + '\'' +
				", sales=" + sales +
				", description='" + description + '\'' +
				", packageList='" + packageList + '\'' +
				", feature='" + feature + '\'' +
				", color='" + color + '\'' +
				", size='" + size + '\'' +
				", isDel=" + isDel +
				", page=" + page +
				", pageSize=" + pageSize +
				", orderByClause=" + orderByClause +
				"}";
	}
}