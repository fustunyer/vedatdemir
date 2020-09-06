package day11IfElseStatement;

import java.util.Scanner;

public class IfQestion02 {

	public static void main(String[] args) {
		//a)Kullanıcıdan iki sayı alın 
		//b)eğer sayıların işaretleri aynı ise ekrana “Aynı işaretli” yazdırın. ++ --
		//c)Sayıların işaretleri farklı ise ekrana “Farklı işaretli” yazdırın.
		Scanner input = new Scanner(System.in);
		System.out.println("Iki sayi  giriniz.");
		int sayi1=input.nextInt();
		int sayi2=input.nextInt();
		//1. yol
		if((sayi1<0 && sayi2<0)||(sayi1>0 && sayi2>0)) {
			System.out.println("Ayni isaretli");
		}else {
			System.out.println("Farkli isaretli");
		}
		//2. yol
		if(sayi1*sayi2>0){
			System.out.println("Ayni isaretli");
		}else {
			System.out.println("Farkli isaretli");
		}
		
		input.close();
		
		
		
		
		
		

	}

}
