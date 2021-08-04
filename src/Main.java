import java.util.Random;
import java.util.ArrayList;
public class Main {
	
	/* Türk plaka standartlarýna uyan sivil plakalarýn karakter sayýsý 
	 * 7 veya 8'dir. Karakter sayýsý, plakanýn 2. kýsmýný oluþturan 
	 * harf sayýsýyla doðrudan iliþkilidir. Ýkinci kýsým 1,2 veya 3 harften oluþmaktadýr.
	 *  2. kýsýmda 1 harf varsa 3. kýsýmda 4 rakam, 2 harf varsa 3 veya
	 *  4 rakam, 3 harf varsa 2 rakam olur. */

	public static void main(String[] args) {
		
		Random random = new Random();
		ArrayList <Character> HarfKodu = new ArrayList <Character>();
		
		/* Yukarýda yer alan plaka standartlarýna göre 4 çeþit plaka türü mevcut.  
		 * Bu sebeple önce bu 4 tür için bir random oluþturalým. Buna plakaTipi diyelim.
		 * */
		int plakaTipi = random.nextInt(3); // 0,1,2,3 þeklinde 4 çeþit plaka rastgele seçilecek.
		
		
		int ilKodu = random.nextInt(82)+1; // 1'den 81'e kadar il plaka kodu rastgele belirleniyor	
		
		if(ilKodu<10) { // 1 ile 9 arasýndaki plaka kodlarýnýn baþýna sýfýr getirelim.
			String tekHaneli = String.format("%02d", ilKodu);
			System.out.print("Plaka Kodunuz: "+tekHaneli+" ");
		} else{
			
			System.out.print("Plaka Kodunuz: "+ilKodu+" ");
		}
		
		if(plakaTipi==0) { // 3 harfli ve 2 rakamlý plaka tipi için
	
			for(int i=0; i<3; i++) {
             HarfKodu.add((char) ((char)random.nextInt(26) + 'A')); // 3 Harf oluþturuluyor
		
			}
			int RakamKodu = random.nextInt(90)+10; // 2 rakam oluþturuluyor
			
			for (Character hk : HarfKodu) {
			      System.out.print(hk);
		       }
	        System.out.println(" "+RakamKodu);
	        
		} else if(plakaTipi==1) { // 2 harfli ve 3 rakamlý plaka tipi için
			
			for(int i=0; i<2; i++) {
             HarfKodu.add((char) ((char)random.nextInt(26) + 'A')); // 2 harf oluþturuluyor
			}
	      
			int RakamKodu = random.nextInt(900)+100; // 3 rakam oluþturuluyor
			
			for (Character hk : HarfKodu) {
			      System.out.print(hk);
		       }
	        System.out.println(" "+RakamKodu);
			
		} else if(plakaTipi==2) { // 2 harfli ve 4 rakamlý plaka tipi için
				
			for(int i=0; i<2; i++) {
             HarfKodu.add((char) ((char)random.nextInt(26) + 'A')); // 2 harf oluþturuluyor
			}
	      
			int RakamKodu = random.nextInt(9000)+1000; // 4 rakam oluþturuluyor
			
			for (Character hk : HarfKodu) {
			      System.out.print(hk);
		       }
	        System.out.println(" "+RakamKodu);
			
		} else if(plakaTipi==3) { // 1 harfli ve 4 rakamlý plaka tipi için
						
             HarfKodu.add((char) ((char)random.nextInt(26) + 'A')); // 1 harf oluþturuluyor
			
	      
			int RakamKodu = random.nextInt(9000)+1000; // 4 rakam oluþturuluyor
			
			for (Character hk : HarfKodu) {
			      System.out.print(hk);
		       }
	        System.out.println(" "+RakamKodu);
	
		}

	}
}
