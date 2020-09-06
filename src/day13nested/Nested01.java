package day13nested;

import java.util.Scanner;

public class Nested01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan erkek veya kadin oldugunu ogrenin 
		 * erkek ve yasi 18 den kucuk ise "delikanli" degil ise "erkek" yazdirin
		 * kadin ve 18 yasindna kucuk ise "genc kiz" degil ise "kadin" yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("cinsiyetiniz erkek ise 1 giriniz, bayan ise 2 giriniz ");
		char cinsiyet=scan.next().charAt(0);
		System.out.println("yasinizi giriniz.");
		int yas=scan.nextInt();
		
		if(cinsiyet=='1') {
			if(yas<=18) {
				System.out.println("Delikanli");
			}else {
				System.out.println("Erkek");
			}
		}else if(cinsiyet=='2') {
			if(yas<=18) {
				System.out.println("Genc kiz");
			}else {
				System.out.println("Kadin");
			}
			
		}else {
			System.out.println("1 veya 2 gir dedik kardesim");
		}
		
		scan.close();
	}

}
