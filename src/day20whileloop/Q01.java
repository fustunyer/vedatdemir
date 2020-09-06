package day20whileloop;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * a)Kullanıcıdan başlangıç ve bitiş değerlerini alın ve
		 * b) başlangıç değerinden başlayıp bitiş değerinde
			biten tüm tamsayıları ekrana yazdırın.
		 */
		Scanner scan =new Scanner(System.in);	
		System.out.println("Baslangic ve bitis degeri giriniz");
		int bas=scan.nextInt();//35
		int bit=scan.nextInt();//12
		//kullanici baSLANGIC DEGERINI BUYUK GIRERSE
		if(bas<bit) {
			for (int i =bas ; i <=bit; i++) {
			System.out.print(i+"-");
		}
		}else {
			for (int i = bas; i >=bit; i=i-2) {
			System.out.print(i+"-");	
		}
		}
		
		
		scan.close();
	}

}
