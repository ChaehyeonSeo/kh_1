package model.dto;

public class BookmarkDTO {
	
	private int id;
	private String name;
	private String url;
	
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "BookmarkDTO [id=" + id + ", name=" + name + ", url=" + url + "]";
	}
	
}
