package day20whileloop;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından
başlayıp bitiş değerinde veya öncesinde biten tüm çift tamsayıları ekrana yazdırın.
		 */
		Scanner scan =new Scanner(System.in);	
		System.out.println("Baslangic ve bitis degeri giriniz");
		int bas=scan.nextInt();//35
		int bit=scan.nextInt();//12
		
		if(bas<bit) {
			for (int i =bas ; i <=bit; i++) {
				if(i%2==0) {//i sayisi ciftse yazdirir
				System.out.print(i+"-");
				}
		}
		}else {
			for (int i = bas; i >=bit; i--) {
				if(i%2==0) {//i sayisi ciftse yazdirir
				System.out.print(i+"-");
					
			}
	}
		
		scan.close();
		
	}

}
}