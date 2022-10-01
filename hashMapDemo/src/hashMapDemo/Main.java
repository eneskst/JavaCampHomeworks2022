package hashMapDemo;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> sozluk = new HashMap<>();
		sozluk.put("Book", "Kitap");
		sozluk.put("Table", "Masa");
		sozluk.put("Computer", "Bilgisayar");
		
		System.out.println(sozluk);
		
		System.out.println(sozluk.size());
		//sozluk.remove("Table");
		//sozluk.clear();
		System.out.println(sozluk.get("Table"));
		
		for(String soz:sozluk.keySet()) {
			System.out.println("Eleman "+ soz + " Değeri " + sozluk.get(soz));
		}
		
		
	}

}
