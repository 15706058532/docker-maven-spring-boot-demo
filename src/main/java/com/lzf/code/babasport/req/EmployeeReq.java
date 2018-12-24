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
public class EmployeeReq implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键 
	 */
	private Long id;

	/**
	 * 用户名 
	 */
	private String username;

	/**
	 * 密码 
	 */
	private String password;

	/**
	 * 学历 
	 */
	private String degree;

	/**
	 * 邮箱 
	 */
	private String email;

	/**
	 * 性别 0：男 1：女 
	 */
	private Integer gender;

	/**
	 * 性别 0：男 1：女 开始值
	 */
	private Integer genderStart;

	/**
	 * 性别 0：男 1：女 结束值
	 */
	private Integer genderEnd;

	/**
	 * 图片(头像) 
	 */
	private String imgUrl;

	/**
	 * 手机 
	 */
	private String phone;

	/**
	 * 真实名字 
	 */
	private String realName;

	/**
	 * 毕业学校 
	 */
	private String school;

	/**
	 * 是否删除 1:未删除 0:删除 
	 */
	private Integer isDel;

	/**
	 * 是否删除 1:未删除 0:删除 开始值
	 */
	private Integer isDelStart;

	/**
	 * 是否删除 1:未删除 0:删除 结束值
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

	public void setGenderStart(Integer genderStart) {
		this.genderStart = genderStart;
	}

	public Integer getGenderStart() {
		return genderStart;
	}

	public void setGenderEnd(Integer genderEnd) {
		this.genderEnd = genderEnd;
	}

	public Integer getGenderEnd() {
		return genderEnd;
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
		return "EmployeeReq{" +
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
				", page=" + page +
				", pageSize=" + pageSize +
				", orderByClause=" + orderByClause +
				"}";
	}
}