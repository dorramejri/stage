package tn.esprit.student_placement_platform.entities;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Document
 *
 */
@Entity
@Table(name="document")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn(name="type_document",discriminatorType=DiscriminatorType.STRING,length=255)
public class Document implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="document_description")
	private String description;

	/*****************************/
	//Relation student
	@ManyToOne
	private Student student;
	
	//Relation entreprise
	@ManyToOne
	private Entreprise entreprise;
	/*****************************/
	
	//Constructors
	public Document() {
		
	}
	public Document(String title, String description, Student student) {
		super();
		this.description = description;
		this.student = student;
	}
	
	//Getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	


	
	//toString
	@Override
	public String toString() {
		return "Document [description=" + description + ", student=" + student + "]";
	}
	
	
	
	
	
	
   
}
