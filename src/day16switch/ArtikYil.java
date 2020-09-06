package day16switch;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		/*
		a) Kullanýcýdan alýnan yýlýn artýk yýl olma durumunu kontrol eden methodu yazýnýz. 
		b) yil 400 ve 100 bölünebilecek c)100 e bölünmüyor ise 4 e bölünecek
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir yil giriniz");
		int yil=scan.nextInt();
		
		String result=(yil%400==0&&yil%100==0) ? "Artik yil" : (yil%4==0) ? "Artik yil" : "Artik yil degil";
		System.out.println(result);
		
		
		scan.close();
		
		
		
		
		
	}

}
