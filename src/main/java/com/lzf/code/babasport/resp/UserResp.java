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
public class UserResp implements Serializable {
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
	 * 密码，加密存储 
	 */
	private String password;

	/**
	 * 注册手机号 
	 */
	private String phone;

	/**
	 * 注册邮箱 
	 */
	private String email;

	/**
	 * 创建时间 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 更新时间 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

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

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getEmail() {
		return email;
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

	@Override
	public String toString() {
		return "UserResp{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				"}";
	}
}