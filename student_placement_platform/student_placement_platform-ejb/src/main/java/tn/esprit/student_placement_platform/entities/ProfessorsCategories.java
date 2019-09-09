package tn.esprit.student_placement_platform.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ProfessorsCategories implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProfessorsCategoriesPK professorPK;
	
	@Column(name="classementSurDix")
	private int classementSurDix;
	
	//idCategory est a la fois primary key et foreign key
			@ManyToOne
		    @JoinColumn(name = "idCategory", referencedColumnName = "id", insertable=false, updatable=false,nullable = false)
			private Category category;
			
			//idProfessor est a la fois primary key et foreign key
			@ManyToOne
		    @JoinColumn(name = "idProfessor", referencedColumnName = "id", insertable=false, updatable=false,nullable = false)
			private Professor professor;

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((professorPK == null) ? 0 : professorPK.hashCode());
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
				ProfessorsCategories other = (ProfessorsCategories) obj;
				if (professorPK == null) {
					if (other.professorPK != null)
						return false;
				} else if (!professorPK.equals(other.professorPK))
					return false;
				return true;
			}

			@Override
			public String toString() {
				return "ProfessorsCategories [classementSurDix=" + classementSurDix
						+ ", category=" + category.getName() + ", professor=" + professor.getId()+ "]";
			}

		
	
			
			
}
