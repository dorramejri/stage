package tn.esprit.student_placement_platform.entities;


import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: HeadOfDepartment
 *
 */
@Entity
@DiscriminatorValue("head_of_department")
public class HeadOfDepartment extends User {

	
	private static final long serialVersionUID = 1L;

	
	
	/******************/
	//Relation department
	@OneToOne(mappedBy="headofdepartment")
	private Department department;
	/******************/
	
	//Construcotrs
	public HeadOfDepartment() {
		
	}
	public HeadOfDepartment(int cin, String name, String last_name, String username, String email, String password,
			String role, int phone_number, String address, Date birth_date, String gender,Department department) {
		super(cin, name, last_name, username, email, password, role, phone_number, address, birth_date, gender);
		this.department = department;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((department == null) ? 0 : department.hashCode());
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
		HeadOfDepartment other = (HeadOfDepartment) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "HeadOfDepartment [department=" + department + ", getUser_id()=" + getId() + ", getCin()="
				+ getCin() + ", getName()=" + getName() + ", getLast_name()=" + getLast_name() + ", getUsername()="
				+ getUsername() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getRole()="
				+ getRole() + ", getPhone_number()=" + getPhone_number() + ", getAddress()=" + getAddress()
				+ ", getBirth_date()=" + getBirth_date() + ", getGender()=" + getGender() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}

	
	

}
	
	

