package realestate.RealStateProject.people;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "people")
public class People {
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	
	@Column(name="id")
	@Id
	@GeneratedValue
	private Integer id;
	
	People(){
		
	}
	public People(String name, String email, String password, Integer id) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", email=" + email + ", password=" + password + ", id=" + id + "]";
	}
	
	
}
