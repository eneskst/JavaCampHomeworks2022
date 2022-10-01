package arrayListDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList sayilar = new ArrayList();

		sayilar.add(1);
		sayilar.add(10);
		sayilar.add("Ankara");
//		System.out.println(sayilar.size());
//		System.out.println(sayilar.get(2));
//		sayilar.set(2, 100);
//		System.out.println(sayilar.get(2));
//	
//		sayilar.remove(0);
//		System.out.println(sayilar.get(1));
//	
//		sayilar.clear();
//		System.out.println(sayilar.size());

		for (Object sayi : sayilar) {
			System.out.println(sayi);
		}

	}

}
