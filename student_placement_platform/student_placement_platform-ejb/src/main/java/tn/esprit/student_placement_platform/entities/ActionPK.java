package tn.esprit.student_placement_platform.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ActionPK
 *
 */
@Embeddable

public class ActionPK implements Serializable {

	
	private static final long serialVersionUID = 1L;
    private int idPlacementForm;
	private int idProfessor;
	


	public ActionPK() {
		super();
	}

	public ActionPK(int idPlacementForm, int idProfessor, EnumMission mission) {
		super();
		this.idPlacementForm = idPlacementForm;
		this.idProfessor = idProfessor;
		//this.mission = mission;
	}

	public int getIdPlacementForm() {
		return idPlacementForm;
	}

	public void setIdPlacementForm(int idPlacementForm) {
		this.idPlacementForm = idPlacementForm;
	}

	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPlacementForm;
		result = prime * result + idProfessor;
		//result = prime * result + ((mission == null) ? 0 : mission.hashCode());
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
		ActionPK other = (ActionPK) obj;
		if (idPlacementForm != other.idPlacementForm)
			return false;
		if (idProfessor != other.idProfessor)
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "ActionPK [idPlacementForm=" + idPlacementForm + ", idProfessor=" + idProfessor 
				+ "]";
	}
   
}
