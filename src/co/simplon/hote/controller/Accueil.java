package co.simplon.hote.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.simplon.hote.jdbc.jdbcTest;
import co.simplon.hote.model.Client;
import co.simplon.hote.model.ClientImpl;
import co.simplon.hote.model.ReservationManager;


/**
 * Servlet implementation class Accueil
 */
@WebServlet("/Accueil")
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Accueil() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//---Envoi des reservations vers la page administrateur--
        request.setAttribute("manager", ReservationManager.getInstance());
		getServletContext().getRequestDispatcher("/administrateur.jsp").forward(request, response);
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
		
		try {
			jdbcTest.insertData(nom,prenom,tel,mail);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//-- creation de l'objet "client" contient toutes les infos de reservations
//		Client newClient = new ClientImpl();
//		newClient.setNom(nom);
//		newClient.setPrenom(prenom);
//		newClient.setEmail(mail);
//		newClient.setTel(tel);
//		newClient.setParking(parking);
//		newClient.setAnimal(animal);
//		newClient.setFumeur(fumeur);
//		newClient.setPtiDej(ptiDej);
//		newClient.setSejour(sejour);
//		newClient.setNuit(nuit);
//		newClient.setNbreDeVisiteur(nbreDeVisiteur);
//		
//		//--ajout à la liste des reservations
//		ReservationManager.getInstance().addInfo(newClient);
		
		//--redirection de la reservation vers une page recap pour le client
//		request.setAttribute("client", newClient);
		getServletContext().getRequestDispatcher("/recap.jsp").forward(request, response);
		
		

		
		doGet(request, response);
	}


	

}
