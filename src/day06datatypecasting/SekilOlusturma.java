package day06datatypecasting;

import java.util.Scanner;

public class SekilOlusturma {

	public static void main(String[] args) {
		// kullanicidan bir karakter al ve onu desen olusturacak sekilde yazdir.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir karakter giriniz.");
		char desen = scan.next().charAt(0);
		System.out.println("        "+desen+"        ");
		System.out.println("    "+desen+"      "+desen+"    ");
		System.out.println(desen+"      "+desen+"      "+desen);
		
		scan.close();

	}

}
