package tn.esprit.student_placement_platform.services;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.student_placement_platform.entities.Category;
import tn.esprit.student_placement_platform.entities.Claim;
import tn.esprit.student_placement_platform.entities.Department;
import tn.esprit.student_placement_platform.entities.User;
import tn.esprit.student_placement_platform.iservices.ClaimServicesRemote;


public class ClaimServices implements ClaimServicesRemote {

	@PersistenceContext(unitName = "student_placement_platform-ejb")
	EntityManager em;
	
	@Override
	public List<Category> findAll() {
		return em.createQuery("SELECT C FROM Category C", Category.class).getResultList();
	}
	@Override
	public List<Claim> findClaimAll() {
		return em.createQuery("SELECT C FROM Claim C", Claim.class).getResultList();
	}
	@Override
	public void ProposeCategory(Category c) {
		// TODO Auto-generated method stub
		System.out.println("here");
		em.persist(c);

	}

	public Department searchDepartmentByName(String name) {
        return em.createQuery("select p from Department p where p.name"
                + " LIKE CONCAT('%',:name,'%')", Department.class)
                .setParameter("name", name)
                .getSingleResult();
   }
	
	@Override
	public Category update(Category c) {
		// TODO Auto-generated method stub
		return em.merge(c);
	}

	@Override
	public void delete(int id_c) {		
		Category c=em.find(Category.class, id_c);
		if(c!=null){
	 em.remove(c);}
		else{
			System.out.println("category n existe pas");
		}
	}
	
	@Override
	public void deleteClaim(int id_r) {
		Claim cl=em.find(Claim.class, id_r);
		if(cl!=null){
	 em.remove(cl);}
		else{
			System.out.println("reclamation n existe pas");
		}		
	}
	
	@Override
	public int acceptCategory(Category c) {
		c.setState(1);
		return 1;
		}

	@Override
	public List<Category> findCategoryState() {
		return em.createQuery("SELECT c FROM Category c where c.state=0 ", Category.class).getResultList();
	}
	
	@Override
	public void AddJustificationByIDC(String rp,int idc) {
		Query query=em.createQuery("update Claim c set reponseReclamation=:rp WHERE c.id=:idc");
		query.setParameter("rp", rp);
		query.setParameter("idc", idc);
		query.executeUpdate();
		
		
		///em.persist(c);		
	}
	
	

}
