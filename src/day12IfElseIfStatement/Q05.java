package day12IfElseIfStatement;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * a)Kullanıcıdan bir tamsayı alın 
		 * b)eğer tamsayı 0 dan kucuk ise ekrana “Negatif” yazdırın.
			c)0 ise ekrana “Nötr” yazdırın. 
			d)0 dan büyük ise ekrana “Pozitif” yazdırın.
		 */
		
			Scanner scan= new  Scanner(System.in);
			System.out.println("bir tamsayi  giriniz");
			int a=scan.nextInt();
			
			if(a<0) {
				System.out.println("Negatif");
			}else if(a==0) {
				System.out.println("Notr");
			}else {
				System.out.println("Pozitif");
			}
			scan.close();

	}

}
