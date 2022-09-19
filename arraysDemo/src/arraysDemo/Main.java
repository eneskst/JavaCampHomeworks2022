package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Enes";
		String ogrenci2 = "Engin";
		String ogrenci3 = "Salih";
		

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("----------------------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Enes";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Şule";
		ogrenciler[3] = "Elif";
		//ogrenciler[4] = "Ayşe";
		
		for (int i = 0; i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		
		System.out.println("----------------------------------");
		
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
			
		}
		
		
		
	}

}
