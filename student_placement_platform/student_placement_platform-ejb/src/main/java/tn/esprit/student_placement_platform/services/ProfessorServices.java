package tn.esprit.student_placement_platform.services;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import tn.esprit.student_placement_platform.entities.*;
import tn.esprit.student_placement_platform.iservices.ProfessorServicesRemote;

@Stateless
@LocalBean
public  class ProfessorServices implements ProfessorServicesRemote {

	@PersistenceContext(unitName = "student_placement_platform-ejb")
	EntityManager em;

	/*@Override
	public List<PlacementForm> findAllPF() {	
		return em.createQuery("SELECT p FROM PlacementForm p where p.treated=0 ", PlacementForm.class).getResultList();
	}
	 @Override
	public List<PlacementForm> findPf() {
		return em.createQuery("SELECT p FROM PlacementForm p where p.treated=1 ", PlacementForm.class).getResultList();

	}*/
@Override
	public List<PlacementForm> findAllByYear(SimpleDateFormat d) {
		return  em.createQuery("select p from PlacementForm p where p.creation_date = :x",PlacementForm.class).setParameter("x",d).getResultList();
	}

	 @Override
		public List<PlacementForm> findAll() {
			return em.createQuery("SELECT p FROM PlacementForm p", PlacementForm.class).getResultList();

		}
	@Override
	public void AddJustificationByIDC(String rp, int idc) {
		Query query=em.createQuery("update PlacementForm p set motif=:rp WHERE p.id=:idc");
		query.setParameter("rp", rp);
		query.setParameter("idc", idc);
		query.executeUpdate();
		
	}
	@Override
	public int prevalidate( int id) {
		PlacementForm pf= em.find(PlacementForm.class, id);
		pf.setTreated(1);
		em.persist(pf);
		return 1;
		
	}

	@Override
	public PlacementForm findById(int id) {
		return em.find(PlacementForm.class, id);
	}

	public Professor getUserByEmailAndPassword(String email, String password) {
		TypedQuery<Professor> query = em.createQuery("select e from Professor e where e.email=:email AND e.password=:password", Professor.class); 

		query.setParameter("email", email); 
		query.setParameter("password", password); 

		Professor professor = null; 
		try { professor = query.getSingleResult(); }
		catch (NoResultException e)
		{ System.out.println("Erreur : " + e); }
		return professor;

	}
	
	public Student getUserByEmailAndPassword1(String email, String password) {
		TypedQuery<Student> query = em.createQuery("select e from Student e where e.email=:email AND e.password=:password", Student.class); 

		query.setParameter("email", email); 
		query.setParameter("password", password); 

		Student student = null; 
		try { student = query.getSingleResult(); }
		catch (NoResultException e)
		{ System.out.println("Erreur : " + e); }
		return student;
	}

	@Override
	public void ajouterPlacementForm(PlacementForm e) {
	      em.persist(e); }// TODO Auto-generated method stub

	
	@Override
	public void delete(int id_pf) {
		PlacementForm pf=em.find(PlacementForm.class, id_pf);
		if(pf!=null){
	 em.remove(pf);}
		else{
			System.out.println("PlacementForm n existe pas");
		}
		
		//em.remove(e);	
	}

	@Override
	public PlacementForm update(PlacementForm pf) {
		return em.merge(pf);
	}
		
}
