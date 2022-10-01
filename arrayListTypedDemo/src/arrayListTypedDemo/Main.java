package arrayListTypedDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> sehirler = new ArrayList<>();
		sehirler.add("Ankara");
		sehirler.add("İstanbul");
		sehirler.add("İzmir");

		sehirler.remove("İstanbul");
		sehirler.add("Aydın");
		
		Collections.sort(sehirler);
		
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

	
	}

}
