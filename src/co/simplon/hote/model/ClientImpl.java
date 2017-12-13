package co.simplon.hote.model;

public class ClientImpl implements Client {
	String nom;
	String prenom;
	String mail;
	String tel;
	String parking;
	String animal;
	String fumeur;
	String ptiDej;
	String Nuit;
	String nbreDeVisiteur;
    String sejour;

	@Override
	public String getNom() {
		
		return nom;
	}

	@Override
	public void setNom(String nom) {
		
		this.nom = nom;

	}

	@Override
	public String getPrenom() {
		// TODO Auto-generated method stub
		return prenom;
	}

	@Override
	public void setPrenom(String prenom) {
		// TODO Auto-generated method stub
		this.prenom = prenom;

	}

	@Override
	public String getmail() {
		// TODO Auto-generated method stub
		return mail;
	}

	@Override
	public void setmail(String mail) {
		// TODO Auto-generated method stub
		this.mail=mail;

	}

	@Override
	public String getTel() {
		// TODO Auto-generated method stub
		return tel;
	}

	@Override
	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String getParking() {
		// TODO Auto-generated method stub
		return parking;
	}

	@Override
	public void setParking(String parking) {
		// TODO Auto-generated method stub
		this.parking = parking;

	}

	@Override
	public String getAnimal() {
		// TODO Auto-generated method stub
		return animal;
	}

	@Override
	public void setAnimal(String animal) {
		// TODO Auto-generated method stub
		this.animal = animal;

	}

	@Override
	public String getFumeur() {
		// TODO Auto-generated method stub
		return fumeur;
	}

	@Override
	public void setFumeur(String fumeur) {
		// TODO Auto-generated method stub
		this.fumeur = fumeur;

	}

	@Override
	public String getPtiDej() {
		// TODO Auto-generated method stub
		return ptiDej;
	}

	@Override
	public void setPtiDej(String ptiDej) {
		// TODO Auto-generated method stub
		this.ptiDej = ptiDej;

	}

	@Override
	public String getSejour() {
		// TODO Auto-generated method stub
		return sejour;
	}

	@Override
	public void setSejour(String sejour) {
		// TODO Auto-generated method stub
		this.sejour = sejour;
		
	}

	@Override
	public String getNuit() {
		// TODO Auto-generated method stub
		return Nuit;
	}

	@Override
	public void setNuit(String Nuit) {
		// TODO Auto-generated method stub
		this.Nuit = Nuit;

	}

	@Override
	public String getNbreDeVisiteur() {
		// TODO Auto-generated method stub
		return nbreDeVisiteur;
	}

	@Override
	public void setNbreDeVisiteur(String nbreDeVisiteur) {
		// TODO Auto-generated method stub
		this.nbreDeVisiteur = nbreDeVisiteur;

	}

}
