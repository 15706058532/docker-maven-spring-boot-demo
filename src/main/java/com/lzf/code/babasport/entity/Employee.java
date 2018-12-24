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
@Table(name = "bbs_employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/**
	 * 用户名 
	 */
	@Column(name = "username")
	private String username;

	/**
	 * 密码 
	 */
	@Column(name = "password")
	private String password;

	/**
	 * 学历 
	 */
	@Column(name = "degree")
	private String degree;

	/**
	 * 邮箱 
	 */
	@Column(name = "email")
	private String email;

	/**
	 * 性别 0：男 1：女 
	 */
	@Column(name = "gender")
	private Integer gender;

	/**
	 * 图片(头像) 
	 */
	@Column(name = "img_url")
	private String imgUrl;

	/**
	 * 手机 
	 */
	@Column(name = "phone")
	private String phone;

	/**
	 * 真实名字 
	 */
	@Column(name = "real_name")
	private String realName;

	/**
	 * 毕业学校 
	 */
	@Column(name = "school")
	private String school;

	/**
	 * 是否删除 1:未删除 0:删除 
	 */
	@Column(name = "is_del")
	private Integer isDel;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setDegree(String degree) {
		this.degree = degree == null ? null : degree.trim();
	}

	public String getDegree() {
		return degree;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getGender() {
		return gender;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl == null ? null : imgUrl.trim();
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setRealName(String realName) {
		this.realName = realName == null ? null : realName.trim();
	}

	public String getRealName() {
		return realName;
	}

	public void setSchool(String school) {
		this.school = school == null ? null : school.trim();
	}

	public String getSchool() {
		return school;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public Integer getIsDel() {
		return isDel;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", degree='" + degree + '\'' +
				", email='" + email + '\'' +
				", gender=" + gender +
				", imgUrl='" + imgUrl + '\'' +
				", phone='" + phone + '\'' +
				", realName='" + realName + '\'' +
				", school='" + school + '\'' +
				", isDel=" + isDel +
				"}";
	}
}