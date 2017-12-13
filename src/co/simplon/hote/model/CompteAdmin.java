package co.simplon.hote.model;

import javax.servlet.http.HttpServletRequest;

public class CompteAdmin {
	
	boolean connecté = false;
	
	public boolean VerifierIdentifiant(HttpServletRequest request) {
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		
		if(login.equals("Administrateur") || login != null)	{
			if(pass.equals("123") || pass != null) {		
			}
		}
		return true;
	}
	
	
	
	

	
	

	

}
