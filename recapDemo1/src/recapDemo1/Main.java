package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 75;
		int sayi2 = 0;
		int sayi3 = 46;
		
		int enBuyuk = sayi1;
		
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		
		
		System.out.println("En büyük sayi= " + enBuyuk);


	}

}
