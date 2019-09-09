package tn.esprit.student_placement_platform.entities;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PlacementAgreement
 *
 */
@Entity
@DiscriminatorValue("PA")
public class PlacementAgreement extends Document {

	
	private static final long serialVersionUID = 1L;
	
	//Attributes
	@Column(name="placement_agreement_startdate")
	@Temporal(TemporalType.DATE)
	private Date start_date;	
	@Column(name="document_endstart")
	@Temporal(TemporalType.DATE)
	private Date end_date;
	
	//Constructors
	public PlacementAgreement() {
		super();
	}

	public PlacementAgreement(Date start_date, Date end_date) {
		super();
		this.start_date = start_date;
		this.end_date = end_date;
	}

	//Getters and setters
	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	//equals and hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((end_date == null) ? 0 : end_date.hashCode());
		result = prime * result + ((start_date == null) ? 0 : start_date.hashCode());
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
		PlacementAgreement other = (PlacementAgreement) obj;
		if (end_date == null) {
			if (other.end_date != null)
				return false;
		} else if (!end_date.equals(other.end_date))
			return false;
		if (start_date == null) {
			if (other.start_date != null)
				return false;
		} else if (!start_date.equals(other.start_date))
			return false;
		return true;
	}

	//toString
	@Override
	public String toString() {
		return "PlacementAgreement [start_date=" + start_date + ", end_date=" + end_date + "]";
	}
	
	
	
	
	
	
   
}
