package camp;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Kurs kurs = new Kurs (1, "java"); 
		
		
		Gun gun1 = new Gun(1, "java temelleri", "https://www.kodlama.io/courses/1332369/lectures/31944217", 
				"veri tiplerini araþtýrýnýz.", "programýmýzý nasýl buldunuz?"

);
		
		Gun gun2 = new Gun(2, "java temelleri2", "https://www.kodlama.io/courses/1332369/lectures/31995299",
				"5-23 arasýndaki dersleri izleyiniz ve uygulayýnýz.", "programýmýzý nasýl buldunuz?");
		
		
		Gun[]gunler = {gun1, gun2};
		
		
		KursManager kursmanager = new KursManager();
		kursmanager.liste(gunler);
				
			
			
		}		

	}


