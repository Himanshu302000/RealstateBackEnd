package realestate.RealStateProject.propertieslikes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PropertyLikes {
	private Integer userId;
	private Integer propertyId;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	
	public PropertyLikes(){
		
	}
	public PropertyLikes(Integer userId, Integer propertyId, Integer id) {
		super();
		this.userId = userId;
		this.propertyId = propertyId;
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "PropertyLikes [userId=" + userId + ", propertyId=" + propertyId + ", id=" + id + "]";
	}
	
	
	
	
}
