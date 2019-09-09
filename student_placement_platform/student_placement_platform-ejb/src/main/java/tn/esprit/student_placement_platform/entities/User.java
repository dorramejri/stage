package tn.esprit.student_placement_platform.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Table(name="user")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn(name="type_user",discriminatorType=DiscriminatorType.STRING)
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="cin",nullable = false)
	//the type user changes, but the id is for all users yess  i got that. Now let me cross check
	private int cin;
	@Column(name="name")
	private String name;
	@Column(name="lastname")
	private String last_name;
	@Column(name="username")
	private String username;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="role")
	private String role;
	@Column(name="phonenumber")
	private int phone_number;
	@Column(name="address")
	private String address;
	@Column(name="birthdate")
	@Temporal(TemporalType.DATE)
	private Date birth_date;
	@Column(name="gender")
	private String gender;
	@Column(name="saisie")
	private int saisie;
	
	
	//Constructors
	public User() {
		
	}
	

	public User(int id) {
		super();
		this.id = id;
	}


	public User(int cin, String name, String last_name, String username, String email, String password, String role,
			int phone_number, String address, Date birth_date, String gender) {
	
		this.cin = cin;
		this.name = name;
		this.last_name = last_name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
		this.phone_number = phone_number;
		this.address = address;
		this.birth_date = birth_date;
		this.gender = gender;
	}
	public User(int cin, String name, String last_name, String username, String email, String password, String role,
			int phone_number, String address, Date birth_date, String gender,int saisie) {
	
		this.cin = cin;
		this.name = name;
		this.last_name = last_name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
		this.phone_number = phone_number;
		this.address = address;
		this.birth_date = birth_date;
		this.gender = gender;
		this.saisie=saisie;
	}

	//Getters and setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id =id;
	}


	public int getCin() {
		return cin;
	}


	public void setCin(int cin) {
		this.cin = cin;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
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


	public Date getBirth_date() {
		return birth_date;
	}


	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public int getSaisie() {
		return saisie;
	}


	public void setSaisie(int saisie) {
		this.saisie = saisie;
	}


	//equals and hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cin;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + phone_number;
		result = prime * result + id;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		User other = (User) obj;
		if (cin != other.cin)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (phone_number != other.phone_number)
			return false;
		if (id != other.id)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	//ToString
	@Override
	public String toString() {
		return "User [user_id=" + id + ", cin=" + cin + ", name=" + name + ", last_name=" + last_name
				+ ", username=" + username + ", email=" + email + ", password=" + password + ", role=" + role
				+ ", phone_number=" + phone_number + ", address=" + address + ", birth_date=" + birth_date + ", gender="
				+ gender + ", saisie=" + saisie + ", getUser_id()=" + getId() + ", getCin()=" + getCin()
				+ ", getName()=" + getName() + ", getLast_name()=" + getLast_name() + ", getUsername()=" + getUsername()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getRole()=" + getRole()
				+ ", getPhone_number()=" + getPhone_number() + ", getAddress()=" + getAddress() + ", getBirth_date()="
				+ getBirth_date() + ", getGender()=" + getGender() + ", getSaisie()=" + getSaisie() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	
	
   
}
