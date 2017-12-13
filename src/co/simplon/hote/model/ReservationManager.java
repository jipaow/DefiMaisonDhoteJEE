package co.simplon.hote.model;

import java.util.ArrayList;


public class ReservationManager {
	private final static ReservationManager INSTANCE = new ReservationManager();
	private ArrayList<Client>infoResa = new ArrayList<Client>();
	
	private ReservationManager() {
	}

	public ArrayList<Client> getInfoResa() {
		return infoResa;
	}

	public void setInfoResa(ArrayList<Client> infoResa) {
		this.infoResa = infoResa;
	}

	public static ReservationManager getInstance() {
		return INSTANCE;
	}
	//--methode pour ajouter les reservations à la liste
	 public void addInfo (Client client){
		 infoResa.add(client);
		 
		 
	 }
	
	

}
