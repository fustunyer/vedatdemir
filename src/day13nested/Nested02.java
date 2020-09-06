package day13nested;

import java.util.Scanner;

public class Nested02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("cinsiyetiniz erkek ise 1 giriniz, bayan ise 2 giriniz ");
		boolean erkekMi=scan.hasNextBoolean();
		System.out.println("yasinizi giriniz.");
		int yas=scan.nextInt();
		if(erkekMi) {
			if(yas<=18) {
				System.out.println("Delikanli");
			}else {
				System.out.println("Erkek");
			}
		}else  {
			if(yas<=18) {
				System.out.println("Genc kiz");
			}else {
				System.out.println("Kadin");
			}
	}
		scan.close();
}
}