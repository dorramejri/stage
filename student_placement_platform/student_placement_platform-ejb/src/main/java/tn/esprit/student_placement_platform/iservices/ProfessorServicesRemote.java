package tn.esprit.student_placement_platform.iservices;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

import tn.esprit.student_placement_platform.entities.Category;
import tn.esprit.student_placement_platform.entities.PlacementForm;
import tn.esprit.student_placement_platform.entities.Professor;
import tn.esprit.student_placement_platform.entities.Student;

@Remote
public interface ProfessorServicesRemote {
	
	
	//public List<PlacementForm> findAllPF();
	public List<PlacementForm> findAllByYear(SimpleDateFormat d);
	public void ajouterPlacementForm(PlacementForm e);
	public void delete(int id_pf);
	public  PlacementForm update(PlacementForm pf);
	//public List<PlacementForm> findPf();
	public List<PlacementForm> findAll();
	public PlacementForm findById(int id);
	public int prevalidate( int id);
	public void AddJustificationByIDC(String rp, int idc);
	public Professor getUserByEmailAndPassword(String email, String password);
	public Student getUserByEmailAndPassword1(String email, String password);
	//public void acceptModif (PlacementForm pf);
	
	
}
