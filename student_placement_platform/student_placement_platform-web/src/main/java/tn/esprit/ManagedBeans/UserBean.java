package tn.esprit.ManagedBeans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import tn.esprit.student_placement_platform.entities.Category;
import tn.esprit.student_placement_platform.entities.HeadOfDepartment;
import tn.esprit.student_placement_platform.entities.PlacementForm;
import tn.esprit.student_placement_platform.services.ProfessorServices;

@ManagedBean(name = "userBean") 
@SessionScoped
public class UserBean implements Serializable {
	private static final long serialVersionUID = 1L;
    private String description;
	private String fonctonalities; private String title;  private String keywords;
	private String problematic;  private String personal_email; private String professional_email;
	private String supervisor_email; private int supervised; int reported; int treated; Date creation_date; private String motif;
	private Category category; private HeadOfDepartment headofdepartment;
	private int id;
	private  PlacementForm selectedFiche;
	 private EntityManagerFactory emf;
	@EJB
	ProfessorServices professorServices; 

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFonctonalities() {
		return fonctonalities;
	}

	public void setFonctonalities(String fonctonalities) {
		this.fonctonalities = fonctonalities;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getProblematic() {
		return problematic;
	}

	public void setProblematic(String problematic) {
		this.problematic = problematic;
	}

	public String getPersonal_email() {
		return personal_email;
	}

	public void setPersonal_email(String personal_email) {
		this.personal_email = personal_email;
	}

	public String getProfessional_email() {
		return professional_email;
	}

	public void setProfessional_email(String professional_email) {
		this.professional_email = professional_email;
	}

	public String getSupervisor_email() {
		return supervisor_email;
	}

	public void setSupervisor_email(String supervisor_email) {
		this.supervisor_email = supervisor_email;
	}

	public int getSupervised() {
		return supervised;
	}

	public void setSupervised(int supervised) {
		this.supervised = supervised;
	}

	public int getReported() {
		return reported;
	}

	public void setReported(int reported) {
		this.reported = reported;
	}

	public int getTreated() {
		return treated;
	}

	public void setTreated(int treated) {
		this.treated = treated;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public ProfessorServices getProfessorServices() {
		return professorServices;
	}

	public void setProfessorServices(ProfessorServices professorServices) {
		this.professorServices = professorServices;
	}
	public void setPlacementForms(List<PlacementForm> placementForms) {
		this.placementForms = placementForms;
	}
	private List<PlacementForm> placementForms;

	public List<PlacementForm> getPlacementForms() {
		placementForms = professorServices.findAll();
		return placementForms;
	}

	/*public String save(){
		for (PlacementForm placementForm : placementForms){
			placementForm.setEditable(false);			
        }
        return null;
	}
	public String editStudent(PlacementForm placementForm ){
		placementForm.setEditable(true);
	    return null;
   }*/
 
	public String addPf() {

	professorServices.ajouterPlacementForm(new PlacementForm(fonctonalities,title,keywords,problematic,personal_email,professional_email, supervisor_email, supervised,reported,
	treated,motif));
	return "/welcome?faces-redirect=true";
	}
	
    public String deleteAction(PlacementForm placementForm) {
    	placementForms.remove(placementForm);
		return null;
	}
  
}
