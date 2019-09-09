package tn.esprit.student_placement_platform.entities;

import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity
@DiscriminatorValue("admin")
public class Admin extends User {

	
	private static final long serialVersionUID = 1L;
	
	//Attributes

	
/****************************/	
	//Relation with school
	@OneToOne(mappedBy="admin")
	private School school;
/****************************/
	
	//Constructors 
	public Admin() {
	
	}
public Admin(int cin, String name, String last_name, String username, String email, String password, String role,
		int phone_number, String address, Date birth_date, String gender,School school) {
	super(cin, name, last_name, username, email, password, role, phone_number, address, birth_date, gender);
	this.school = school;
}
public School getSchool() {
	return school;
}
public void setSchool(School school) {
	this.school = school;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((school == null) ? 0 : school.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Admin other = (Admin) obj;
	if (school == null) {
		if (other.school != null)
			return false;
	} else if (!school.equals(other.school))
		return false;
	return true;
}
@Override
public String toString() {
	return "Admin [school=" + school + ", getUser_id()=" + getId() + ", getCin()=" + getCin() + ", getName()="
			+ getName() + ", getLast_name()=" + getLast_name() + ", getUsername()=" + getUsername() + ", getEmail()="
			+ getEmail() + ", getPassword()=" + getPassword() + ", getRole()=" + getRole() + ", getPhone_number()="
			+ getPhone_number() + ", getAddress()=" + getAddress() + ", getBirth_date()=" + getBirth_date()
			+ ", getGender()=" + getGender() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
}


	
	
}