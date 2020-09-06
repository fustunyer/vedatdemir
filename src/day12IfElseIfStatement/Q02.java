package day12IfElseIfStatement;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		 *a) Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın 
		 *b)eğer üç kenar uzunluğu birbirine eşit ise ekrana “Eşkenar üçgen” yazdırın. 
		 *c)Diğer durumlarda ekrana “Eşkenar değil” yazdırın.
		 */
		Scanner scan= new  Scanner(System.in);
		System.out.println("ucgenin uc kenarini  giriniz");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		if(a==b&&b==c) {
			System.out.println("Eskenar ucgen");
		}else {
			System.out.println("Eskenar ucgen degildir.");
		}
		
		scan.close();
		
		
		

	}

}
