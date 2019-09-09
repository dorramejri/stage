package tn.esprit.student_placement_platform.entities;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity
@DiscriminatorValue("student")
public class Student extends User {

	
	private static final long serialVersionUID = 1L;

		//Attributes

		@Column(name="student_class")
		private String enrolled_class;
		@Column(name="educational_credit")
		private int educational_credit;
		@Column(name="financial_credit")
		private int financial_credit;
		
		
		/*****************************/
		//Relation option
		@ManyToOne
		private Filiere filiere;
		
		//Relation document
		@OneToMany(mappedBy="student",
				cascade = {CascadeType.PERSIST, CascadeType.REMOVE},	
				fetch=FetchType.EAGER)
		private Set <Document> documents;
		/*****************************/
		
		//Constructors
		public Student() {
	
		}


		public Student(int cin, String name, String last_name, String username, String email, String password,
				String role, int phone_number, String address, Date birth_date, String gender,String enrolled_class, Filiere filiere, Set<Document> documents,int educational_credit, int financial_credit) {
			super(cin, name, last_name, username, email, password, role, phone_number, address, birth_date, gender);
			
			this.enrolled_class = enrolled_class;
			this.filiere = filiere;
			this.documents = documents;
			this.educational_credit = educational_credit;
			this.financial_credit = financial_credit;
		}
		
		
		public String getEnrolled_class() {
			return enrolled_class;
		}
		public void setEnrolled_class(String enrolled_class) {
			this.enrolled_class = enrolled_class;
		}
		public Filiere getFiliere() {
			return filiere;
		}
		public void setFiliere(Filiere filiere) {
			this.filiere = filiere;
		}
		public Set<Document> getDocuments() {
			return documents;
		}
		public void setDocuments(Set<Document> documents) {
			this.documents = documents;
		}
		
		public int getEducational_credit() {
			return educational_credit;
		}


		public void setEducational_credit(int educational_credit) {
			this.educational_credit = educational_credit;
		}


		public int getFinancial_credit() {
			return financial_credit;
		}


		public void setFinancial_credit(int financial_credit) {
			this.financial_credit = financial_credit;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + ((documents == null) ? 0 : documents.hashCode());
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
			Student other = (Student) obj;
			if (documents == null) {
				if (other.documents != null)
					return false;
			} else if (!documents.equals(other.documents))
				return false;
			return true;
		}


		@Override
		public String toString() {
			return "Student [enrolled_class=" + enrolled_class + ", educational_credit=" + educational_credit
					+ ", financial_credit=" + financial_credit + ", filiere=" + filiere + ", documents=" + documents
					+ ", getUser_id()=" + getId() + ", getCin()=" + getCin() + ", getName()=" + getName()
					+ ", getLast_name()=" + getLast_name() + ", getUsername()=" + getUsername() + ", getEmail()="
					+ getEmail() + ", getPassword()=" + getPassword() + ", getRole()=" + getRole()
					+ ", getPhone_number()=" + getPhone_number() + ", getAddress()=" + getAddress()
					+ ", getBirth_date()=" + getBirth_date() + ", getGender()=" + getGender() + ", toString()="
					+ super.toString() + ", getClass()=" + getClass() + "]";
		}

		
		
		
}
