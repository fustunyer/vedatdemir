package day16switch;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		/*
		a) Kullan�c�dan al�nan y�l�n art�k y�l olma durumunu kontrol eden methodu yaz�n�z. 
		b) yil 400 ve 100 b�l�nebilecek c)100 e b�l�nm�yor ise 4 e b�l�necek
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir yil giriniz");
		int yil=scan.nextInt();
		
		String result=(yil%400==0&&yil%100==0) ? "Artik yil" : (yil%4==0) ? "Artik yil" : "Artik yil degil";
		System.out.println(result);
		
		
		scan.close();
		
		
		
		
		
	}

}
