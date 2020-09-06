package day21whileloop;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		//1 de 20 ye kadar sayilarin carpimini tazdiran kod yazuniz
		long carpim=1;
		for (int i = 1; i <=6; i++) {
			carpim=carpim*i;
		}
		System.out.println(carpim);
		/*
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
biten tüm tamsayıların çarpımını ekrana yazdırın.
		 */
		Scanner scan =new Scanner(System.in);	
		System.out.println("Baslangic ve bitis degeri giriniz");
		int bas=scan.nextInt();
		int bit=scan.nextInt();
				
		double carpim2=1;
		for (int i = bas; i <=bit; i++) {
			carpim2=carpim2*i;
		}
		System.out.println(carpim2);
		scan.close();
		
		
		
	}

}
