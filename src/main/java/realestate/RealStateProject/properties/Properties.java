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
	private String phone;
	private String furnished;
	private String description;
	
	

	@Id
	@GeneratedValue
	private Integer id;
	
	Properties(){};
	
	

	public Properties(String name, String address, Integer userId, String url, String phone, Integer id,String furnished,String description) {
		super();
		this.name = name;
		this.address = address;
		this.userId = userId;
		this.url = url;
		this.phone = phone;
		this.id = id;
		this.furnished=furnished;
		this.description=description;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
	

	public String getFurnished() {
		return furnished;
	}



	public void setFurnished(String furnished) {
		this.furnished = furnished;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "Properties [name=" + name + ", address=" + address + ", userId=" + userId + ", url=" + url + ", phone="
				+ phone + ", furnished=" + furnished + ", description=" + description + ", id=" + id + "]";
	}



	

	
	
	
}
