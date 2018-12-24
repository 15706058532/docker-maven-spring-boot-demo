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
public class ProductResp implements Serializable {
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
	 * 是否新品:0:旧品,1:新品 
	 */
	private Integer isNew;

	/**
	 * 是否热销:0,否 1:是 
	 */
	private Integer isHot;

	/**
	 * 上下架:0否 1是 
	 */
	private Integer isShow;

	/**
	 * 推荐 1推荐 0 不推荐 
	 */
	private Integer isCommend;

	/**
	 * 添加时间 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 添加人ID 
	 */
	private Long createUserId;

	/**
	 * 审核时间 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date checkTime;

	/**
	 * 审核人ID 
	 */
	private Long checkUserId;

	/**
	 * 类型ID 
	 */
	private Long typeId;

	/**
	 * 品牌ID 
	 */
	private Long brandId;

	/**
	 * 检索关键词 
	 */
	private String keywords;

	/**
	 * 销量 
	 */
	private Integer sales;

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

	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}

	public Integer getIsNew() {
		return isNew;
	}

	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	public Integer getIsHot() {
		return isHot;
	}

	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}

	public Integer getIsShow() {
		return isShow;
	}

	public void setIsCommend(Integer isCommend) {
		this.isCommend = isCommend;
	}

	public Integer getIsCommend() {
		return isCommend;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckUserId(Long checkUserId) {
		this.checkUserId = checkUserId;
	}

	public Long getCheckUserId() {
		return checkUserId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getBrandId() {
		return brandId;
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

	@Override
	public String toString() {
		return "ProductResp{" +
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
				"}";
	}
}