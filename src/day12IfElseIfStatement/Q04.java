package day12IfElseIfStatement;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir character alın 
		 * eğer character bir harf ise ekrana “Harf” yazdırın.
			Diğer durumlarda ekrana “Harf değil” yazdırın.
		 */
		Scanner scan= new  Scanner(System.in);
		System.out.println("bir karakter giriniz");
		char chr=scan.next().charAt(0);
		
		if((chr>='a'&&chr<='z')||(chr>='A'&&chr<='Z')){
			System.out.println("Harf");
		}else {
			System.out.println("Harf degildir.");
		}
				
		scan.close();
		
		
		
		
		
		
		
		
	}

}
