package day11IfElseStatement;

import java.util.Scanner;

public class IfQuestion {

	public static void main(String[] args) {
		/*
		 a)Kullanıcıdan bir harf alın 
		 b)eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
		 c)“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Bir harf giriniz.");
		char harf=input.next().charAt(0);
		
		if(harf=='a'|| harf=='e'||harf=='i'|| harf=='o'||harf=='u') {
			System.out.println("Sesli harf");
		}if( harf=='b'||harf=='c'|| harf=='d'||harf=='f') {
			System.out.println("Sessiz harf");
		}
			
		input.close();
	}

}
