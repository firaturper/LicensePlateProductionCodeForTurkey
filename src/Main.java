import java.util.Random;
import java.util.ArrayList;
public class Main {
	
	/* T�rk plaka standartlar�na uyan sivil plakalar�n karakter say�s� 
	 * 7 veya 8'dir. Karakter say�s�, plakan�n 2. k�sm�n� olu�turan 
	 * harf say�s�yla do�rudan ili�kilidir. �kinci k�s�m 1,2 veya 3 harften olu�maktad�r.
	 *  2. k�s�mda 1 harf varsa 3. k�s�mda 4 rakam, 2 harf varsa 3 veya
	 *  4 rakam, 3 harf varsa 2 rakam olur. */

	public static void main(String[] args) {
		
		Random random = new Random();
		ArrayList <Character> HarfKodu = new ArrayList <Character>();
		
		/* Yukar�da yer alan plaka standartlar�na g�re 4 �e�it plaka t�r� mevcut.  
		 * Bu sebeple �nce bu 4 t�r i�in bir random olu�tural�m. Buna plakaTipi diyelim.
		 * */
		int plakaTipi = random.nextInt(3); // 0,1,2,3 �eklinde 4 �e�it plaka rastgele se�ilecek.
		
		
		int ilKodu = random.nextInt(82)+1; // 1'den 81'e kadar il plaka kodu rastgele belirleniyor	
		
		if(ilKodu<10) { // 1 ile 9 aras�ndaki plaka kodlar�n�n ba��na s�f�r getirelim.
			String tekHaneli = String.format("%02d", ilKodu);
			System.out.print("Plaka Kodunuz: "+tekHaneli+" ");
		} else{
			
			System.out.print("Plaka Kodunuz: "+ilKodu+" ");
		}
		
		if(plakaTipi==0) { // 3 harfli ve 2 rakaml� plaka tipi i�in
	
			for(int i=0; i<3; i++) {
             HarfKodu.add((char) ((char)random.nextInt(26) + 'A')); // 3 Harf olu�turuluyor
		
			}
			int RakamKodu = random.nextInt(90)+10; // 2 rakam olu�turuluyor
			
			for (Character hk : HarfKodu) {
			      System.out.print(hk);
		       }
	        System.out.println(" "+RakamKodu);
	        
		} else if(plakaTipi==1) { // 2 harfli ve 3 rakaml� plaka tipi i�in
			
			for(int i=0; i<2; i++) {
             HarfKodu.add((char) ((char)random.nextInt(26) + 'A')); // 2 harf olu�turuluyor
			}
	      
			int RakamKodu = random.nextInt(900)+100; // 3 rakam olu�turuluyor
			
			for (Character hk : HarfKodu) {
			      System.out.print(hk);
		       }
	        System.out.println(" "+RakamKodu);
			
		} else if(plakaTipi==2) { // 2 harfli ve 4 rakaml� plaka tipi i�in
				
			for(int i=0; i<2; i++) {
             HarfKodu.add((char) ((char)random.nextInt(26) + 'A')); // 2 harf olu�turuluyor
			}
	      
			int RakamKodu = random.nextInt(9000)+1000; // 4 rakam olu�turuluyor
			
			for (Character hk : HarfKodu) {
			      System.out.print(hk);
		       }
	        System.out.println(" "+RakamKodu);
			
		} else if(plakaTipi==3) { // 1 harfli ve 4 rakaml� plaka tipi i�in
						
             HarfKodu.add((char) ((char)random.nextInt(26) + 'A')); // 1 harf olu�turuluyor
			
	      
			int RakamKodu = random.nextInt(9000)+1000; // 4 rakam olu�turuluyor
			
			for (Character hk : HarfKodu) {
			      System.out.print(hk);
		       }
	        System.out.println(" "+RakamKodu);
	
		}

	}
}
