package model.dto;

import java.sql.Date;

public class VisitDTO {
	
	private String nickname;
	private String context;
	private Date createdate;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
	@Override
	public String toString() {
		return "VisitDTO [nickname=" + nickname + ", context=" + context + ", createdate=" + createdate + "]";
	}
}
