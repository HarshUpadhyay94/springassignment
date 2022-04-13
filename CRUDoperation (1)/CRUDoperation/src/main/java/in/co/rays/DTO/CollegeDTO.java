package in.co.rays.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class CollegeDTO {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	@Column(name = "NAME", length = 50)
	private String name;
	
	@Column(name = "STATE", length = 50)
	private String state;

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "CollegeDTO [id=" + id + ", name=" + name + ", state=" + state + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getState()=" + getState() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public CollegeDTO(int id, String name, String state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
	}
	
	public CollegeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
