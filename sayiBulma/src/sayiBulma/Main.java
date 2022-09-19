package sayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean isFound = false;
		
//		for(int i=0;i<sayilar.length;i++) {
//			if(sayilar[i]==aranacak) {
//				System.out.println("Bulundu.");
//				isFound = true;
//				break;
//			}
//		}
		
//		if(isFound==false)
//			System.out.println("Bulunamadı.");
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				isFound=true;
			break;}
		}
		
		
		if(isFound)
			System.out.println("Bulundu.");
		else
		System.out.println("Bulunamadı.");

	}

}
