package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
//		int sayi = 19;
//		boolean asal = false;
//		
//		for(int i = 2;i<=sayi;i++) {
//			if(sayi/i==sayi){
//				for (int j = 2;j<=sayi;j++) {
//				if(sayi/i==1){
//				System.out.println(sayi + " sayısı asaldır.");
//				asal = true;
//				i++;}
//				else
//					j++;
//				
//				}
//			}
//			else {
//				i++;}			
//		}
//		
//		if(asal == false) {
//			System.out.println(sayi + " sayisi asal değildir.");
//		}
//		
		
//		for(int i = 2;i<sayi;i++) {
//			if(sayi % i==0){
//				for (int j = i+1;j<sayi;j++) {
//				if(sayi % j == 0){
//				System.out.println(sayi + " sayısı asaldır.");
//				asal = true;
//				}
//				
//				
//				}
//			}
//			else {
//				}			
//		}
//		
//		if(asal == false) {
//		System.out.println(sayi + " sayisi asal değildir.");}
	
		
		
		
		
		
		int number = -1;
		int remainder = number % 2;
		
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Asal değildir");
			return;
		}
		
		if (number<1) {
			System.out.println("Geçersiz sayı");
		}
		for (int i =2; i < number;i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		
		}
			
		if(isPrime)
			System.out.println("Asaldır.");
		else
			System.out.println("Asal değildir.");
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
