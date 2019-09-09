package tn.esprit.student_placement_platform.iservices;
import java.util.List;

import javax.ejb.Remote;
import javax.persistence.Query;

import tn.esprit.student_placement_platform.entities.Category;
import tn.esprit.student_placement_platform.entities.Claim;
import tn.esprit.student_placement_platform.entities.Department;
import tn.esprit.student_placement_platform.entities.User;


public interface ClaimServicesRemote {
	public List<Category> findAll();
	public List<Claim> findClaimAll();
	public List<Category> findCategoryState();
	
	public void ProposeCategory(Category c);
	//public void AddJustification(Claim c);
	public  Category update(Category c);
	
	public void delete(int id_c);
	public void deleteClaim(int id_r) ;
	
	public int acceptCategory(Category c);
	public Department searchDepartmentByName(String name);
	public void AddJustificationByIDC(String rp, int idc);
}

