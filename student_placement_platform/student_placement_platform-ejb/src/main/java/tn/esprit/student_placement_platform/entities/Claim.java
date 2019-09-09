package tn.esprit.student_placement_platform.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Claim
 *
 */
@Entity

public class Claim implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	//relation
    @ManyToOne
    @JoinColumn(name="USER")
    private User ideUser ;
    
    
    private String objetReclamation;
    private String descReclamation;
    private String ReponseReclamation;
    private Date date;
   
    
	public Claim(String reponseReclamation) {
		super();
		ReponseReclamation = reponseReclamation;
	}

	public Claim() {
		super();
	}
	
	public Claim(int id, User ideUser, String objetReclamation, String descReclamation, String reponseReclamation,
			Date date) {
		super();
		this.id = id;
		this.ideUser = ideUser;
		this.objetReclamation = objetReclamation;
		this.descReclamation = descReclamation;
		ReponseReclamation = reponseReclamation;
		this.date = date;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getIdeUser() {
		return ideUser;
	}
	public void setIdeUser(User ideUser) {
		this.ideUser = ideUser;
	}
	public String getObjetReclamation() {
		return objetReclamation;
	}
	public void setObjetReclamation(String objetReclamation) {
		this.objetReclamation = objetReclamation;
	}
	public String getDescReclamation() {
		return descReclamation;
	}
	public void setDescReclamation(String descReclamation) {
		this.descReclamation = descReclamation;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getReponseReclamation() {
		return ReponseReclamation;
	}
	public void setReponseReclamation(String reponseReclamation) {
		ReponseReclamation = reponseReclamation;
	}


	@Override
	public String toString() {
		return "Claim [ideUser=" + ideUser + ", objetReclamation=" + objetReclamation + ", descReclamation="
				+ descReclamation + ", ReponseReclamation=" + ReponseReclamation + ", date=" + date + "]";
	}


	
	
	
    

    
    
    
	
	
	

   
}
