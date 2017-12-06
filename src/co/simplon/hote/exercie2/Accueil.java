package co.simplon.hote.exercie2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Accueil
 */
@WebServlet("/Accueil")
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Accueil() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at:accueil ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String mail = request.getParameter("mail");
		String tel = request.getParameter("tel");
		String parking = request.getParameter("parking");
		String animal = request.getParameter("animal");
		String fumeur = request.getParameter("fumeur");
		String ptiDej = request.getParameter("ptiDej");
		String sejour = request.getParameter("sejour");
		String nuit = request.getParameter("nuit");
		String nbreDeVisiteur = request.getParameter("nbreDeVisiteur");
		
		Client newClient = new ClientImpl();
		newClient.setNom(nom);
		newClient.setPrenom(prenom);
		newClient.setEmail(mail);
		newClient.setTel(tel);
		newClient.setParking(parking);
		newClient.setAnimal(animal);
		newClient.setFumeur(fumeur);
		newClient.setPtiDej(ptiDej);
		newClient.setSejour(sejour);
		newClient.setNuit(nuit);
		newClient.setNbreDeVisiteur(nbreDeVisiteur);
		
		//List<Client> infoResa = new ArrayList<Client>();
		//infoResa.add(newClient);
		
		
		request.setAttribute("client", newClient);
		getServletContext().getRequestDispatcher("/admin.jsp").forward(request, response);
		
		

		
		doGet(request, response);
	}


	

}
