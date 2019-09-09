package tn.esprit.student_placement_platform.entities;

import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PlacementDirector
 *
 */
@Entity
@DiscriminatorValue("placement_director")
public class PlacementDirector extends User {
	
	//Attributes

	
/****************************/		
	//Relation site
	@OneToOne(mappedBy="placementdirector")
	private Site site;

/****************************/	

	
	private static final long serialVersionUID = 1L;

	//Contructors
	public PlacementDirector() {
		
	}

	public PlacementDirector(int cin, String name, String last_name, String username, String email, String password,
			String role, int phone_number, String address, Date birth_date, String gender,Site site) {
		super(cin, name, last_name, username, email, password, role, phone_number, address, birth_date, gender);
		this.site = site;
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((site == null) ? 0 : site.hashCode());
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
		PlacementDirector other = (PlacementDirector) obj;
		if (site == null) {
			if (other.site != null)
				return false;
		} else if (!site.equals(other.site))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlacementDirector [site=" + site + ", getUser_id()=" + getId() + ", getCin()=" + getCin()
				+ ", getName()=" + getName() + ", getLast_name()=" + getLast_name() + ", getUsername()=" + getUsername()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getRole()=" + getRole()
				+ ", getPhone_number()=" + getPhone_number() + ", getAddress()=" + getAddress() + ", getBirth_date()="
				+ getBirth_date() + ", getGender()=" + getGender() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}



	
}
