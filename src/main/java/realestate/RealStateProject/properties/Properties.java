package realestate.RealStateProject.properties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="properties")
public class Properties {
	private String name;
	private String address;
	private Integer userId;
	private String url;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	

	public Properties(String name, String address, Integer userId, String url, Integer id) {
		super();
		this.name = name;
		this.address = address;
		this.userId = userId;
		this.url = url;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Properties [name=" + name + ", address=" + address + ", userId=" + userId + ", url=" + url + ", id="
				+ id + "]";
	}
	
}
