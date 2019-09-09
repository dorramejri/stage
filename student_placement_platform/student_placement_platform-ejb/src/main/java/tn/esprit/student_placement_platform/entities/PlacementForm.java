 package tn.esprit.student_placement_platform.entities;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PlacementForm
 *
 */
@Entity
@DiscriminatorValue("pf")
public class PlacementForm extends Document {	
	private static final long serialVersionUID = 1L;
	
	//Attributes
	@Column(name="placement_form_fonctionalities")
	private String fonctonalities;
	@Column(name="placement_form_title")
	private String title;
	@Column(name="placement_form_keywords")
	private String keywords;
	@Column(name="placement_form_problematic")
	private String problematic;
	@Column(name="placement_form_pemail")
	private String personal_email;
	@Column(name="placement_form_proemail")
	private String professional_email;
	@Column(name="placement_form_supervisoremail")
	private String supervisor_email;
	@Column(name="supervised")
	private int supervised=0;
	@Column(name="reported")
	private int reported=0;
	@Column(name="treated")
	private int treated=0;
	@Temporal(TemporalType.DATE)
	private Date creation_date;
	@Column(name="placement_form_motif")
	private String motif;
   /* boolean editable;
	
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}*/
	

	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	/*****************************/
	//Relation category
	@ManyToOne
	private Category category;
	
	
	@OneToOne
	private HeadOfDepartment headofdepartment;
	
		public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	public Date getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
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
	/*****************************/
	
	//Constructors
	public PlacementForm() {
		super();
	}
	
	public PlacementForm(String fonctonalities, String title, String keywords, String problematic,
			String personal_email, String professional_email, String supervisor_email) {
		super();
		this.fonctonalities = fonctonalities;
		this.title = title;
		this.keywords = keywords;
		this.problematic = problematic;
		this.personal_email = personal_email;
		this.professional_email = professional_email;
		this.supervisor_email = supervisor_email;
	}
	
	
	//Getters and setters
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
	
	//equals and hashcode

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((personal_email == null) ? 0 : personal_email.hashCode());
		result = prime * result + ((professional_email == null) ? 0 : professional_email.hashCode());
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
		PlacementForm other = (PlacementForm) obj;
		if (personal_email == null) {
			if (other.personal_email != null)
				return false;
		} else if (!personal_email.equals(other.personal_email))
			return false;
		if (professional_email == null) {
			if (other.professional_email != null)
				return false;
		} else if (!professional_email.equals(other.professional_email))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PlacementForm [fonctonalities=" + fonctonalities + ", title=" + title + ", keywords=" + keywords
				+ ", problematic=" + problematic + ", personal_email=" + personal_email + ", professional_email="
				+ professional_email + ", supervisor_email=" + supervisor_email + ", supervised=" + supervised
				+ ", reported=" + reported + ", treated=" + treated + ", creation_date=" + creation_date + ", motif="
				+ motif + ", category=" + category + ", headofdepartment=" + headofdepartment + "]";
	}
	public PlacementForm(String fonctonalities, String title, String keywords, String problematic,
			String personal_email, String professional_email, String supervisor_email, int supervised, int reported,
			int treated, Date creation_date, String motif, Category category, HeadOfDepartment headofdepartment) {
		super();
		this.fonctonalities = fonctonalities;
		this.title = title;
		this.keywords = keywords;
		this.problematic = problematic;
		this.personal_email = personal_email;
		this.professional_email = professional_email;
		this.supervisor_email = supervisor_email;
		this.supervised = supervised;
		this.reported = reported;
		this.treated = treated;
		this.creation_date = creation_date;
		this.motif = motif;
		this.category = category;
		this.headofdepartment = headofdepartment;
	}
	public PlacementForm(String fonctonalities, String title, String keywords, String problematic,
			String personal_email, String professional_email, String supervisor_email, int supervised, int reported,
			int treated, String motif) {
		super();
		this.fonctonalities = fonctonalities;
		this.title = title;
		this.keywords = keywords;
		this.problematic = problematic;
		this.personal_email = personal_email;
		this.professional_email = professional_email;
		this.supervisor_email = supervisor_email;
		this.supervised = supervised;
		this.reported = reported;
		this.treated = treated;
		this.motif = motif;
	}
	

}
