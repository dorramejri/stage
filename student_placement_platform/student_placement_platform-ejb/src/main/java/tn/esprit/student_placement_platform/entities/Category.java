package tn.esprit.student_placement_platform.entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity
public class Category implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="state")
	private int state;

	/*****************************/
	//Relation department
	@ManyToOne
	private Department department;
	
	
	//Relation PlacementForm
	@OneToMany(mappedBy="category",
			//one to many and agregation relationship
			cascade = {CascadeType.PERSIST, CascadeType.REMOVE},	
			fetch=FetchType.EAGER)
	private List <PlacementForm> placementForms;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	/*************************/
	
	//Constructors
	public Category() {
		
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Category(String name, int state, Department department) {
		super();
		this.name = name;
		this.state = state;
		this.department = department;
	}

	public Category(String name) {
		super();
		this.name = name;
	}

	public Category(String name, Department department) {
		super();
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", state=" + state + ", department=" + department + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + state;
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
		Category other = (Category) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (state != other.state)
			return false;
		return true;
	}

	

	
}