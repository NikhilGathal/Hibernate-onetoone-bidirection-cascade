package onetoonebicascade.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadharcard {
	
	@Id
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private Person person;
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
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Aadharcard [id=" + id + ", name=" + name + ", person=" + person + "]";
	}
	
	

}
