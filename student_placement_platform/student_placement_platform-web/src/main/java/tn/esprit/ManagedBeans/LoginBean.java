package tn.esprit.ManagedBeans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.DiscriminatorType;

import tn.esprit.student_placement_platform.entities.PlacementDirector;
import tn.esprit.student_placement_platform.entities.Professor;
import tn.esprit.student_placement_platform.entities.Student;
import tn.esprit.student_placement_platform.entities.User;
import tn.esprit.student_placement_platform.services.ProfessorServices;

@ManagedBean(name="loginBean") 
@SessionScoped
public class LoginBean implements Serializable {
private static final long serialVersionUID = 1L;

private String email; private String password; private User user; 
private Boolean loggedIn;

@EJB
ProfessorServices professorServices; 

//Getters & Setters

public String doLogin()
{
String navigateTo = "null"; 
user = professorServices.getUserByEmailAndPassword(email, password); 
if (user != null && user instanceof Professor) {

navigateTo = "/welcome?faces-redirect=true";
loggedIn = true;  }

else 
{ FacesContext.getCurrentInstance().addMessage("form:btn", new FacesMessage("Bad Credentials"));}
return navigateTo; }

public String doLogin1()
{
String navigateTo = "null"; 
user = professorServices.getUserByEmailAndPassword1(email, password); 
if (user != null && user instanceof Student) {

navigateTo = "/add?faces-redirect=true";
loggedIn = true;  }

else 
{ FacesContext.getCurrentInstance().addMessage("form:btn", new FacesMessage("Bad Credentials"));}
return navigateTo; }


public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Boolean getLoggedIn() {
	return loggedIn;
}
public void setLoggedIn(Boolean loggedIn) {
	this.loggedIn = loggedIn;
}


public ProfessorServices getProfessorServices() {
	return professorServices;
}

public void setProfessorServices(ProfessorServices professorServices) {
	this.professorServices = professorServices;
}

public String doLogout()
{FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
return "/login?faces-redirect=true";}
public LoginBean() {
	super();
}

}
