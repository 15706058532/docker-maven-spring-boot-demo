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
@Table(name = "bbs_town")
public class Town implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/**
	 * 区县编码 
	 */
	@Column(name = "code")
	private String code;

	/**
	 * 区县名称 
	 */
	@Column(name = "name")
	private String name;

	/**
	 * 所属城市编码 
	 */
	@Column(name = "city_code")
	private String cityCode;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getCode() {
		return code;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getName() {
		return name;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode == null ? null : cityCode.trim();
	}

	public String getCityCode() {
		return cityCode;
	}

	@Override
	public String toString() {
		return "Town{" +
				"id=" + id +
				", code='" + code + '\'' +
				", name='" + name + '\'' +
				", cityCode='" + cityCode + '\'' +
				"}";
	}
}