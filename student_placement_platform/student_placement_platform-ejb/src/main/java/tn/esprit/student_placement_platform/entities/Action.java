package tn.esprit.student_placement_platform.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Action
 *
 */
@Entity

public class Action implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private ActionPK actionPK;
	@Column(name="mission")
	@Enumerated(EnumType.STRING)
	private EnumMission mission;
	
	//idPlacementForm est a la fois primary key et foreign key
		@ManyToOne
	    @JoinColumn(name = "idPlacementForm", referencedColumnName = "id", insertable=false, updatable=false,nullable = false)
		private PlacementForm placementform;
		
		//idProfessor est a la fois primary key et foreign key
		@ManyToOne
	    @JoinColumn(name = "idProfessor", referencedColumnName = "id", insertable=false, updatable=false,nullable = false)
		private Professor professor;
	

	public Action() {
		super();
	}


	public Action(ActionPK actionPK, EnumMission mission, PlacementForm placementform, Professor professor) {
		super();
		this.actionPK = actionPK;
		this.mission = mission;
		this.placementform = placementform;
		this.professor = professor;
	}


	public ActionPK getActionPK() {
		return actionPK;
	}


	public void setActionPK(ActionPK actionPK) {
		this.actionPK = actionPK;
	}


	public EnumMission getMission() {
		return mission;
	}


	public void setMission(EnumMission mission) {
		this.mission = mission;
	}


	public PlacementForm getPlacementform() {
		return placementform;
	}


	public void setPlacementform(PlacementForm placementform) {
		this.placementform = placementform;
	}


	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actionPK == null) ? 0 : actionPK.hashCode());
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
		Action other = (Action) obj;
		if (actionPK == null) {
			if (other.actionPK != null)
				return false;
		} else if (!actionPK.equals(other.actionPK))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Action [actionPK=" + actionPK + ", mission=" + mission + ", placementform=" + placementform
				+ ", professor=" + professor + "]";
	}


		
   
}
