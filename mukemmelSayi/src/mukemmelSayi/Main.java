package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 29;
		int check = 0;
		
		
		for (int i=1;i<number;i++) {
			if(number % i == 0) {
				check += i;
			}
		}
		
		if(check==number) {
			System.out.println("Mükemmel sayi");
		}
		else
			System.out.println("berbat sayi");

		


		
	}

}
