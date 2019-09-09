package tn.esprit.student_placement_platform.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ProfessorsCategoriesPK implements Serializable  {
	private static final long serialVersionUID = 1L;

	private int idProfessor;
	private int idCategory;
	public int getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	//hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCategory;
		result = prime * result + idProfessor;
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
		ProfessorsCategoriesPK other = (ProfessorsCategoriesPK) obj;
		if (idCategory != other.idCategory)
			return false;
		if (idProfessor != other.idProfessor)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ProfessorsCategoriesPK [idProfessor=" + idProfessor + ", idCategory=" + idCategory + "]";
	}
	

}
