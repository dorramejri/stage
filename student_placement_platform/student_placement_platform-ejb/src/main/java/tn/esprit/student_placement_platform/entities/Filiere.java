package tn.esprit.student_placement_platform.entities;
import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Option
 *
 */
@Entity
@Table(name="filiere")
public class Filiere implements Serializable {

	
	private static final long serialVersionUID = 1L;
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	/*****************************/
	//Relation department
	@ManyToOne
	private Department department;
	
	
	
	//Relation student
	/*
	@OneToMany(mappedBy="option")
	private List<Student> students;
	*/
	/*****************************/
	
	public Filiere() {
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}


	public Filiere(Department department) {
		super();
		this.department = department;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filiere other = (Filiere) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (id != other.id)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "filiere [id=" + id + ", department=" + department + "]";
	}






   
}
