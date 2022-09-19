package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'l';
		
//		char[] ince = new char[4];
//		ince[0] = 'E';
//		ince[1] = 'İ';
//		ince[2] = 'Ö';
//		ince[3] = 'Ü';
//		
//		char[] kalin = new char[4];
//		kalin[0] = 'A';
//		kalin[1] = 'I';
//		kalin[2] = 'O';
//		kalin[3] = 'U';
//		
//		for(int i=0;i<4;i++) {
//			if(harf == ince[i]) {
//				System.out.println("ince harf");
//			}
//			if(harf == kalin[i]) {
//				System.out.println("kalın harf");
//			}
//		}
			
		
		
		switch(harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("kalin sesli harf");
				break;
			default:
				System.out.println("ince sesli harf");
				break;
		}
		
		
		
	}

}
