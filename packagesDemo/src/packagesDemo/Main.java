package packagesDemo;

//built-in Dilin kendi içinde bulundurduğu paketler

import java.util.Scanner;

//import matematik.DortIslem;
//import matematik.Logaritma;

import matematik.*; // paketteki her classı import ederç

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Adınızı Giriniz:");

		String isim = scanner.nextLine();
		System.out.println("Merhaba " + isim.toUpperCase());

		DortIslem dortIslem = new DortIslem();
		dortIslem.topla(3, 5);
		Logaritma logaritma = new Logaritma();
		logaritma.logaritmaHesapla();
		
	}

}
