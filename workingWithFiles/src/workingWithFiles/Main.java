package workingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		getFileInfo();
		readFile();
		writeFile();
		readFile();
		
	}

	public static void createFile() {
		File file = new File("C:\\masaustu\\Yazılım\\odev\\files\\students.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("Dosya oluşturuldu.");
			} else {
				System.out.println("Dosya zaten mevcut.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getFileInfo() {
		File file = new File("C:\\masaustu\\Yazılım\\odev\\files\\students.txt");
		if (file.exists()) {
			System.out.println("Dosya Adı: " + file.getName());
			System.out.println("Dosya Yolu: " + file.getAbsolutePath());
			System.out.println("Dosya Yolu: " + file.getPath());
			System.out.println("Dosya Yazılabilir Mi? " + file.canWrite());
			System.out.println("Dosya Okunabilir Mi? " + file.canRead());
			System.out.println("Dosya Boyutu: " + file.length());

		}
	}

	public static void readFile() {
		File file = new File("C:\\masaustu\\Yazılım\\odev\\files\\students.txt");
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void writeFile() {
		try {
			// FileWriter file = new
			// FileWriter("C:\\masaustu\\Yazılım\\odev\\files\\students.txt");
			BufferedWriter writer = new BufferedWriter(
					new FileWriter("C:\\masaustu\\Yazılım\\odev\\files\\students.txt", true));
			writer.newLine();
			writer.write("Ahmet");
			System.out.println("Dosyaya yazıldı.");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
