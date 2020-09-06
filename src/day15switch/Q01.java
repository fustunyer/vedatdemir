package day15switch;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * kullanicidan sayi alin eger tek sayi ise karesinicift sayi ise 3 katini yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi=scan.nextInt();
			
		
		int result= sayi%2!=0 ? sayi*sayi : sayi*3;
		System.out.println(result);
		
		scan.close();

	}

}
