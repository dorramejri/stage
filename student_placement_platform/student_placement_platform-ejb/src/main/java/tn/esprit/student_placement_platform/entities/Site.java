package tn.esprit.student_placement_platform.entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Site
 *
 */
@Entity
@Table(name="site")
public class Site implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int site_id;
	@Column(name="site_name")
	private String name;
	@Column(name="site_address")
	private String address;
	
/***************************/	
	//Relation school
	@ManyToOne
	private School school;

	//Relation placement director
	@OneToOne
	private PlacementDirector placementdirector;
	
	//Relation department
	@OneToMany(mappedBy="site",
			//one to many and agregation relationship
			cascade = {CascadeType.PERSIST, CascadeType.REMOVE},	
			fetch=FetchType.EAGER)
	private List <Department> department;
/***************************/	
	

	//Constructors
	public Site() {
		
	}
	public Site(String name, String address, School school, PlacementDirector placementdirector) {
	super();
	this.name = name;
	this.address = address;
	this.school = school;
	this.placementdirector = placementdirector;
	}
	
	//Getters and setters
	public int getSite_id() {
		return site_id;
	}
	public void setSite_id(int site_id) {
		this.site_id = site_id;
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
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public PlacementDirector getPlacementdirector() {
		return placementdirector;
	}
	public void setPlacementdirector(PlacementDirector placementdirector) {
		this.placementdirector = placementdirector;
	}
	//Equals and hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((placementdirector == null) ? 0 : placementdirector.hashCode());
		result = prime * result + site_id;
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
		Site other = (Site) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (placementdirector == null) {
			if (other.placementdirector != null)
				return false;
		} else if (!placementdirector.equals(other.placementdirector))
			return false;
		if (site_id != other.site_id)
			return false;
		return true;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Site [name=" + name + ", address=" + address + ", school=" + school
				+ ", placementdirector=" + placementdirector + "]";
	}
	
	
	
	
	
	
   
}
