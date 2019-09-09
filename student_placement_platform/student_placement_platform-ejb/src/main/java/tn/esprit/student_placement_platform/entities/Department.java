package tn.esprit.student_placement_platform.entities;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Department
 *
 */
@Entity
@Table(name="department")
public class Department implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="department_name")
	private String name;
	
	/******************/
	//Relation site
	@ManyToOne
	private Site site;
	
	//Relation head of department
	@OneToOne
	private HeadOfDepartment headofdepartment;
	
	@OneToMany(mappedBy="department",
			//one to many and agregation relationship
			cascade = {CascadeType.PERSIST, CascadeType.REMOVE},	
			fetch=FetchType.EAGER)
	private Set <Filiere> filiere;
	/******************/
	
	//Constructors
	public Department() {
		
	}
	public Department(String name, Site site, HeadOfDepartment headofdepartment) {
		super();
		this.name = name;
		this.site = site;
		this.headofdepartment = headofdepartment;
	}
	
	//Getters and setters
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
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	public HeadOfDepartment getHeadofdepartment() {
		return headofdepartment;
	}
	public void setHeadofdepartment(HeadOfDepartment headofdepartment) {
		this.headofdepartment = headofdepartment;
	}

	//equals and hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((headofdepartment == null) ? 0 : headofdepartment.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((site == null) ? 0 : site.hashCode());
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
		Department other = (Department) obj;
		if (headofdepartment == null) {
			if (other.headofdepartment != null)
				return false;
		} else if (!headofdepartment.equals(other.headofdepartment))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (site == null) {
			if (other.site != null)
				return false;
		} else if (!site.equals(other.site))
			return false;
		return true;
	}


	

	
	
	
	
	
   
}
