package tn.esprit.student_placement_platform.entities;


import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Professor
 *
 */
@Entity
@DiscriminatorValue("professor")
public class Professor extends User {

	
	private static final long serialVersionUID = 1L;
	//Where is it? where is what? the  the id

	//Attributes
	
	/*****************************/

	//Relation category
		@OneToMany(mappedBy="professor")
		private List<ProfessorsCategories> professorsCategories;
	
	
	public List<ProfessorsCategories> getProfessorsCategories() {
		return professorsCategories;
	}
	public void setProfessorsCategories(List<ProfessorsCategories> professorsCategories) {
		this.professorsCategories = professorsCategories;
	}
	//Relation action
	@OneToMany(mappedBy="professor")
	private List<Action> actions;
	
	//nbr de fiches rapportés en cours 
	@Column(name="nb_sup")
	private int nb_sup;
	//nbr de fiches encadrés en cours 
	@Column(name="nb_rep")
	private int nb_rep;
//ctor
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public Professor(int cin, String name, String last_name, String username, String email, String password,
			String role, int phone_number, String address, Date birth_date, String gender,List<ProfessorsCategories> professorCategories, List<Action> actions, int nb_sup, int nb_rep) {
		super(cin, name, last_name, username, email, password, role, phone_number, address, birth_date, gender);
		this.professorsCategories = professorCategories;
		this.actions = actions;
		this.nb_sup = nb_sup;
		this.nb_rep = nb_rep;
	}
	///getters ans setters
	public List<Action> getActions() {
		return actions;
	}
	public void setActions(List<Action> actions) {
		this.actions = actions;
	}
	public int getNb_sup() {
		return nb_sup;
	}
	public void setNb_sup(int nb_sup) {
		this.nb_sup = nb_sup;
	}
	public int getNb_rep() {
		return nb_rep;
	}
	public void setNb_rep(int nb_rep) {
		this.nb_rep = nb_rep;
	}

	//toString
	@Override
	public String toString() {
		return "Professor [ nb_rep=" + nb_rep
				+ ", getNb_sup()=" + getNb_sup() + ", getNb_rep()=" + getNb_rep() + ", getId()=" + getId()
				+ ", getCin()=" + getCin() + ", getName()=" + getName() + ", getLast_name()=" + getLast_name()
				+ ", getUsername()=" + getUsername() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getRole()=" + getRole() + ", getPhone_number()=" + getPhone_number() + ", getAddress()="
				+ getAddress() + ", getBirth_date()=" + getBirth_date() + ", getGender()=" + getGender()
				+ ", getSaisie()=" + getSaisie() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}

	
	
	

	
}

	
	
	

