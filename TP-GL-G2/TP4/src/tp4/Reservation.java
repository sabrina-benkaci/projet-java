package tp4;

import java.util.Date;

public class Reservation {
	
	public Date date;
	public Double identifiant;
	public String etat;
	
	public Reservation(Date date, Double identifiant, String etat){
		this.date=date;
		this.identifiant=identifiant;
		this.etat="en attente";
	}
	public void annuler(){
		this.etat = "Annul�";		
	}
	public void confirmer(){
		this.etat = "Confirm�";
		
	}
	public void payer(){
		this.etat = "Pay�";
	
}
	

}
