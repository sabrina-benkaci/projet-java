package tp4;

import java.time.ZonedDateTime;

public class Vol {
	private String tableau[];
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	public Vol( ZonedDateTime depart, ZonedDateTime arrivee){
	  
	    this.depart=depart;
	    this.arrivee=arrivee;        
	}	
	 public void duree(){
		 System.out.println(arrivee.getHour()-depart.getHour());
	 }

	public int ouvrir(){
		return 1;
	}
	public int fermee(){
		return 0;
		
	}
	

}
