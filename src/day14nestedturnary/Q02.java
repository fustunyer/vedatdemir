package day14nestedturnary;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*Kullanıcıdan password girmesini isteyin.
		Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
		Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
		Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir password giriniz");
		int password=input.nextInt();
		
		if(password%5==0) {
			if(password%10==0) {
				System.out.println("5'e bolunen cift sayi");
			}else {
				System.out.println("5'e bolunen tek sayi");
			}
			
		}else {
			System.out.println("tekrar deneyin");
		}
		
		input.close();
		

	}

}
