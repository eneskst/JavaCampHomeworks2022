package methods2;

public class Main {

	public static void main(String[] args) {

		//String mesaj = "Bugün hava çok güzel";
		// String newMesaj = mesaj.substring(0,2);
		// String newMesaj = topla(); integer donuyor string ile devam edilemez.
		// String newMesaj = ekle(); void bir geridonüş yapmaz.
		String newMesaj = sehirVer();
		System.out.println(newMesaj);
		
		int sayi = topla(15, 7);
		System.out.println(sayi);

		int toplam = topla2(2,5,4,7,9,10);
		
		System.out.println(toplam);
		
	}

	public static void ekle() {

		System.out.println("Eklendi");

	}

	public static void sil() {

		System.out.println("Silindi");

	}

	public static void guncelle() {

		System.out.println("Güncellendi.");
	}

	public static int topla(int a, int b) {

		return a + b;

	}
	
	public static int topla2(int... sayilar) {
		
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam+=sayi;

		}
		
		return toplam;
	}

	public static String sehirVer() {

		return "Ankara";

	}

}
