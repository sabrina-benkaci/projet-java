package tp4;
import java.time.ZonedDateTime;
import java.util.Date;
public class Main {

	public static void main(String[] args) {
		Date Date= null;
		Client client = new Client("sabrina", "carte", "0760503191", "FFCD5");
		System.out.println(client);
		
		Reservation reservation = new Reservation(Date, 548.4859, "confirmée");
		System.out.println(reservation);
		
		Passager passager = new Passager("benkaci", "0760503191");
		System.out.println(passager);
		
        Vol vol=new Vol(ZonedDateTime.now(), ZonedDateTime.now());
        System.out.println(vol);
 
	}

}
