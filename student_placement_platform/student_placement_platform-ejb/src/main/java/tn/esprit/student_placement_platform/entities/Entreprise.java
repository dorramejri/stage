package tn.esprit.student_placement_platform.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Entreprise
 *
 */
@Entity
@Table(name="entreprise")
public class Entreprise implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
		//Attributes
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		@Column(name="entreprise_name")
		private String name;
		@Column(name="entreprise_website")
		private String website;
		@Column(name="entreprise_phonenumber")
		private int phone_number;
		@Column(name="entreprise_address")
		private String address;
		@Column(name="entreprise_respname")
		private String responsable;
		@Column(name="entreprise_email")
		private String resp_email;
		@Column(name="country")
		@Enumerated(EnumType.STRING)
		private EnumCountry country;

		
		/**********************************/
		//Relation document
		@OneToMany(mappedBy="entreprise")
		private List <Document> documents;
		/*********************************/

		//Constructors
		public Entreprise() {
		
		}
		
		public Entreprise(String name, String website, int phone_number, String address, String responsable,
				String resp_email, EnumCountry country, List<Document> documents) {
			super();
			this.name = name;
			this.website = website;
			this.phone_number = phone_number;
			this.address = address;
			this.responsable = responsable;
			this.resp_email = resp_email;
			this.country = country;
			this.documents = documents;
		}

		//Getters and setters
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
		public int getPhone_number() {
			return phone_number;
		}
		public void setPhone_number(int phone_number) {
			this.phone_number = phone_number;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public EnumCountry getCountry() {
			return country;
		}
		public void setCountry(EnumCountry country) {
			this.country = country;
		}
		public List<Document> getDocuments() {
			return documents;
		}
		public void setDocuments(List<Document> documents) {
			this.documents = documents;
		}
		
		//equals and hashcode
		@Override
		public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documents == null) ? 0 : documents.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + phone_number;
		result = prime * result + ((resp_email == null) ? 0 : resp_email.hashCode());
		result = prime * result + ((responsable == null) ? 0 : responsable.hashCode());
		result = prime * result + ((website == null) ? 0 : website.hashCode());
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
		Entreprise other = (Entreprise) obj;
		if (documents == null) {
		if (other.documents != null)
		return false;
		} else if (!documents.equals(other.documents))
		return false;
		if (id != other.id)
		return false;
		if (name == null) {
		if (other.name != null)
		return false;
		} else if (!name.equals(other.name))
		return false;
		if (phone_number != other.phone_number)
		return false;
		if (resp_email == null) {
		if (other.resp_email != null)
		return false;
		} else if (!resp_email.equals(other.resp_email))
		return false;
		if (responsable == null) {
		if (other.responsable != null)
		return false;
		} else if (!responsable.equals(other.responsable))
		return false;
		if (website == null) {
		if (other.website != null)
		return false;
		} else if (!website.equals(other.website))
		return false;
		return true;
		}


		//tostring
		@Override
		public String toString() {
			return "Entreprise [name=" + name + ", website=" + website + ", phone_number=" + phone_number + ", address="
					+ address + ", responsable=" + responsable + ", resp_email=" + resp_email + ", country=" + country
					+ ", documents=" + documents + "]";
		}
}
