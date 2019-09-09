package tn.esprit.student_placement_platform.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Subscription
 *
 */
@Entity
@Table(name="subscription")
public class Subscription implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int subscription_id;
	@Column(name="subscription_date")
	@Temporal(TemporalType.DATE)
	private Date date;
	@Column(name="subscription_academic_year")
	private String academic_year;
	@Column(name="subscription_payment_type")
	private String payment_type;
	@Column(name="subscription_payment_amount")
	private double payment_amount;

/****************************/		
	//Relation with school
	@OneToOne(mappedBy="subscription")
	private School school;
/****************************/	
	
	//Constructors
	public Subscription() {
		
	}

	public Subscription(int subscription_id, Date date, String academic_year, String payment_type,
			double payment_amount, School school) {
		super();
		this.date = date;
		this.academic_year = academic_year;
		this.payment_type = payment_type;
		this.payment_amount = payment_amount;
		this.school = school;
	}
	
	//Getters and setters

	public int getSubscription_id() {
		return subscription_id;
	}

	public void setSubscription_id(int subscription_id) {
		this.subscription_id = subscription_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAcademic_year() {
		return academic_year;
	}

	public void setAcademic_year(String academic_year) {
		this.academic_year = academic_year;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public double getPayment_amount() {
		return payment_amount;
	}

	public void setPayment_amount(double payment_amount) {
		this.payment_amount = payment_amount;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	//equals and hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((school == null) ? 0 : school.hashCode());
		result = prime * result + subscription_id;
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
		Subscription other = (Subscription) obj;
		if (school == null) {
			if (other.school != null)
				return false;
		} else if (!school.equals(other.school))
			return false;
		if (subscription_id != other.subscription_id)
			return false;
		return true;
	}
	
	//toString
	@Override
	public String toString() {
		return "Subscription [subscription_id=" + subscription_id + ", date=" + date + ", academic_year="
				+ academic_year + ", payment_type=" + payment_type + ", payment_amount=" + payment_amount + ", school="
				+ school + "]";
	}
	

	
	
	
   
}
