package day24dowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan bir sayý alýn 
		 *sayý çift ise ekrana "kazandýnýz"yazin tek ise "kaybettiniz" yazarak tekrar sayi isteyin
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int sayi=2;
		do {
			if(sayi%2!=0) {
				System.out.println("Kaybettiniz");
			}
			System.out.println("Bir sayi giriniz");
			sayi=scan.nextInt();
		} while (sayi%2!=0);//tek sayi olasi durumunda loop devam eder. cift sayi grilince loop kirilir.
		System.out.println("Kazandiniz");
		
		scan.close();
		
		
		

	}

}
