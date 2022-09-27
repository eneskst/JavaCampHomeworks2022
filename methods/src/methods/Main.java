package methods;

public class Main {

	public static void main(String[] args) {

		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	

	}

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean isFound = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				isFound = true;
				break;
			}
		}

		if (isFound)
			mesajVer("Bulundu: " + aranacak);
		else
			mesajVer("Bulunamadı: " + aranacak);

	}

	public static void mesajVer(String mesaj) {

		// if(isFound)
		System.out.println(mesaj);
		// else
	

	}

}
