package day21whileloop;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		//1 de 100 e kadar sayikarin topalmini yaziran kod yaziniz.toplama flag kullanacagiz
		int toplam=0;
		for (int i = 1; i <=100; i++) {
			toplam=toplam+i;
		}
		System.out.println(toplam);
		
		
		/*
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
biten tüm tamsayıların toplamını ekrana yazdırın.
		 */
		Scanner scan =new Scanner(System.in);	
		System.out.println("Baslangic ve bitis degeri giriniz");
		int bas=scan.nextInt();
		int bit=scan.nextInt();
		int toplam2=0;
		for (int i =bas; i <=bit; i++) {
			toplam2=toplam2+i;
		}
		System.out.println(toplam2);
		scan.close();
		
		
		
	}

}
