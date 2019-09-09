package tn.esprit.student_placement_platform.entities;
import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: School
 *
 */
@Entity
@Table(name="school")
public class School implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int school_id;
	@Column(name="school_name")
	private String name;
	@Column(name="school_address")
	private String address;
	@Column(name="school_phonenumber")
	private int phone_number;
	@Column(name="school_email")
	private String email;
	
/****************************/	
	//Relation admin
	@OneToOne
	private Admin admin;
	//Relation subscription
	@OneToOne
	private Subscription subscription;
	/*@OneToMany(mappedBy="school",
			cascade = {CascadeType.PERSIST, CascadeType.REMOVE},	
			fetch=FetchType.EAGER)
	private List <Site> sites;
/***************************/	
	
	//Constructors
	public School() {
		
	}

	public School(int school_id, String name, String address, int phone_number, String email, Admin admin) {
		super();
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
		this.email = email;
		this.admin = admin;
	}

	//Getters and setters
	public int getSchool_id() {
		return school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
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

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	//equals and hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((admin == null) ? 0 : admin.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + phone_number;
		result = prime * result + school_id;
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
		School other = (School) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (admin == null) {
			if (other.admin != null)
				return false;
		} else if (!admin.equals(other.admin))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone_number != other.phone_number)
			return false;
		if (school_id != other.school_id)
			return false;
		return true;
	}
	
	//ToString
	@Override
	public String toString() {
		return "School [name=" + name + ", address=" + address + ", phone_number="
				+ phone_number + ", email=" + email + ", admin=" + admin + "]";
	}

	
	

	

   
}
