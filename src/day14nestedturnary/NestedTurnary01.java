package day14nestedturnary;

import java.util.Scanner;

public class NestedTurnary01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("cinsiyetiniz erkek ise 1 giriniz, bayan ise 2 giriniz ");
		char cinsiyet = scan.next().charAt(0);
		boolean erkekMi=cinsiyet=='1';
		System.out.println("yasinizi giriniz.");
		int yas=scan.nextInt();
		
		System.out.println(erkekMi);
		
		String result= erkekMi ? (yas<=18) ? "Delikanli":"Erkek" : yas<=18 ? "Genc kiz":"Kadin";
			System.out.println(result);
			scan.close();
	}

}
