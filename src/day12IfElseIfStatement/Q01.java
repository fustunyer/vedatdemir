package day12IfElseIfStatement;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		//a)Kullanıcıdan bir tamsayı alın 
		//b)eğer tamsayı 10 dan kucuk ve 0’dan büyük eşit ise ekrana “Rakam” yazdırın.
	   //c) Diğer durumlarda ekrana “Sayı” yazdırın.
		
		Scanner scan= new  Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int rakamMi=scan.nextInt();
		
		if(rakamMi<10&&rakamMi>=0) {
			System.out.println("Rakam");
		}else {
			System.out.println("Rakam degildir");
		}
		
		scan.close();
		
		
		
		
		
		

	}

}
