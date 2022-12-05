package kr.co.vo;

import java.sql.Date;
import java.util.Objects;

public class AccountVO {
//	ID NUMBER PRIMARY KEY
//    , NICKNAME VARCHAR2(50) UNIQUE
//    , EMAIL VARCHAR2(75) UNIQUE
//    , ISALLOWED CHAR(1) DEFAULT('P') CHECK(ISALLOWED IN ('N', 'Y', 'P'))
//    , REQDATE DATE DEFAULT(SYSDATE)
    
    private int id;
    private String nickname;
    private String email;
    private char isAllowed;
    private Date reqDate;
    private String password;
    private Date loginDate;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getIsAllowed() {
		return isAllowed;
	}
	public void setIsAllowed(char isAllowed) {
		this.isAllowed = isAllowed;
	}
	
	public Date getReqDate() {
		return reqDate;
	}
	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}
	
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountVO other = (AccountVO) obj;
		return id == other.id;
	}
	
	@Override
	public String toString() {
		return "AccountVO [id=" + id + ", nickname=" + nickname + ", email=" + email + ", isAllowed=" + isAllowed
				+ ", reqDate=" + reqDate + ", password=" + password + ", loginDate=" + loginDate + "]";
	}
	
}
