package day10ifstatement;

import java.util.Scanner;

public class RakamlariToplami {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dort basamakli bir sayi giriniz");
		int sayi=scan.nextInt();//1234
		
		int birlerBasamgi=sayi%10;//4
		int onlarBasamagi=(sayi/10)%10;//3
		int yuzlerBasamagi=(sayi/100)%10;//2
		int binlerBasamagi=(sayi/1000);//1
		int toplam=birlerBasamgi+onlarBasamagi+yuzlerBasamagi+binlerBasamagi;
		
		System.out.println(sayi+" Sayisinin rakamlari toplami: "+toplam);//10
		
		scan.close();

	}

}
