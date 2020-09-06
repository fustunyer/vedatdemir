package day16switch;

import java.util.Scanner;

public class UcBasamakliVeyaDegil {

	public static void main(String[] args) {
		/*Kullanıcıdan bir tamsayı girmesini isteyin, o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
		3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
		Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”*/
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();// en kucuk 3 basamakli sayi 100 en buyuk ise 999
		
		System.out.println(sayi>99&&sayi<1000 ? "3 basamakli" : sayi%2==0 ? "3 basmakli olmayan cift sayi" : "3 basmakli olmayan tek sayi");
		
		scan.close();

	}

}
