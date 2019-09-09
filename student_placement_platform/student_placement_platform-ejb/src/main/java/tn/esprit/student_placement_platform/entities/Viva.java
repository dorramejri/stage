package tn.esprit.student_placement_platform.entities;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Viva
 *
 */
@Entity
@Table(name="viva")      //Viva=soutenance
public class Viva implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
		//Attributes
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		@Column(name="viva_date")
		@Temporal(TemporalType.DATE)
		private Date date;
		@Column(name="viva_class")
		private String classroom;
		
		/*****************************/

	
	
	//Constructors
	public Viva() {
		
	}
	
	
	///getters and setters

		public Viva(int id, Date date, String classroom) {
			super();
			this.id = id;
			this.date = date;
			this.classroom = classroom;
		}
		
		


		public Viva(Date date, String classroom) {
			super();
			this.date = date;
			this.classroom = classroom;
		}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getClassroom() {
			return classroom;
		}

		public void setClassroom(String classroom) {
			this.classroom = classroom;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
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
			Viva other = (Viva) obj;
			if (id != other.id)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Viva [date=" + date + ", classroom=" + classroom + "]";
		}

	
	
	
   
}
