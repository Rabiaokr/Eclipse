package camp;

public class KursManager {
	
	public KursManager() {
		
	}
	
	public void liste (Gun[]gunler) {
		
		for (Gun gun : gunler) {
			
			System.out.println(gun.Id + "  :  " + gun.dersprogram� + "  :  " + gun.derskayd� + "  :  " + gun.�dev + "  :  " + gun.degerlendirme);
			
		}
	}

}



