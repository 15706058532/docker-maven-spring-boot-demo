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
@Table(name = "bbs_addr")
public class Addr implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * z主键 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/**
	 * 用户Id 
	 */
	@Column(name = "buyer_id")
	private Long buyerId;

	/**
	 * 收货人 
	 */
	@Column(name = "name")
	private String name;

	/**
	 * 手机号或是固定电话号 
	 */
	@Column(name = "phone")
	private String phone;

	/**
	 * 省编码 
	 */
	@Column(name = "province_code")
	private String provinceCode;

	/**
	 * 省名称 
	 */
	@Column(name = "province_name")
	private String provinceName;

	/**
	 * 市编码 
	 */
	@Column(name = "city_code")
	private String cityCode;

	/**
	 * 市名称 
	 */
	@Column(name = "city_name")
	private String cityName;

	/**
	 * 县编码 
	 */
	@Column(name = "town_code")
	private String townCode;

	/**
	 * 县名称 
	 */
	@Column(name = "town_name")
	private String townName;

	/**
	 * 收货地址 
	 */
	@Column(name = "addr")
	private String addr;

	/**
	 * 是否默认 
	 */
	@Column(name = "is_def")
	private Integer isDef;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setBuyerId(Long buyerId) {
		this.buyerId = buyerId;
	}

	public Long getBuyerId() {
		return buyerId;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getName() {
		return name;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode == null ? null : provinceCode.trim();
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName == null ? null : provinceName.trim();
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode == null ? null : cityCode.trim();
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName == null ? null : cityName.trim();
	}

	public String getCityName() {
		return cityName;
	}

	public void setTownCode(String townCode) {
		this.townCode = townCode == null ? null : townCode.trim();
	}

	public String getTownCode() {
		return townCode;
	}

	public void setTownName(String townName) {
		this.townName = townName == null ? null : townName.trim();
	}

	public String getTownName() {
		return townName;
	}

	public void setAddr(String addr) {
		this.addr = addr == null ? null : addr.trim();
	}

	public String getAddr() {
		return addr;
	}

	public void setIsDef(Integer isDef) {
		this.isDef = isDef;
	}

	public Integer getIsDef() {
		return isDef;
	}

	@Override
	public String toString() {
		return "Addr{" +
				"id=" + id +
				", buyerId=" + buyerId +
				", name='" + name + '\'' +
				", phone='" + phone + '\'' +
				", provinceCode='" + provinceCode + '\'' +
				", provinceName='" + provinceName + '\'' +
				", cityCode='" + cityCode + '\'' +
				", cityName='" + cityName + '\'' +
				", townCode='" + townCode + '\'' +
				", townName='" + townName + '\'' +
				", addr='" + addr + '\'' +
				", isDef=" + isDef +
				"}";
	}
}