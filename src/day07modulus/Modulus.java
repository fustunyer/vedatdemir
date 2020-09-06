package day07modulus;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		//Kullanıcının girdiği 4 basamaklı sayının ilk ve son rakamının toplamını
		//ekrana yazdıran bir program yazınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 basamakli sayi giriniz");
		int sayi=scan.nextInt();
		
		//5 rakami bu sayinin 1 ler basamagidir.10 abolumunden kalani alirim.
		
		int birlerBasamagi=sayi%10;
		//System.out.println(birlerBasamagi);//5
		int onlarBasamgi=(sayi/10)%10;//8
		//System.out.println(onlarBasamgi);
		System.out.println(onlarBasamgi*10+birlerBasamagi);
				
		scan.close();
		
	}

}
