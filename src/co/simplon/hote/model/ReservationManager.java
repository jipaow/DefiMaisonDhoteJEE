package co.simplon.hote.model;

import java.util.ArrayList;


public class ReservationManager {
	private final static ReservationManager INSTANCE = new ReservationManager();
	private ArrayList<ClientImpl>infoResa = new ArrayList<ClientImpl>();
	
	private ReservationManager() {
	}

	public ArrayList<ClientImpl> getInfoResa() {
		return infoResa;
	}

	public void setInfoResa(ArrayList<ClientImpl> infoResa) {
		this.infoResa = infoResa;
	}

	public static ReservationManager getInstance() {
		return INSTANCE;
	}
	
	 public void addInfo (ClientImpl client){
		 infoResa.add(client);
		 
		 
	 }
	
	

}
