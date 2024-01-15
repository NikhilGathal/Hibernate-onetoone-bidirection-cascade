package onetoonebicascade.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private Aadharcard aadharcard;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Aadharcard getAadharcard() {
		return aadharcard;
	}
	public void setAadharcard(Aadharcard aadharcard) {
		this.aadharcard = aadharcard;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", aadharcard=" + aadharcard + "]";
	}
	
	
	

}
