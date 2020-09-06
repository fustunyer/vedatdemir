package day15switch;

import java.util.Scanner;

public class IndirimliSatis {

	public static void main(String[] args) {
		/*
		 *a)Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. 
		 *b)Eğer urun miktarı 1000 den fazla ise Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın. 
		 *c)Diğer durumlarda ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
		 */
		Scanner scan= new  Scanner(System.in);
		System.out.println("urun miktari ve birim fiyat giriniz");
		int urunMiktari=scan.nextInt();
		int birimFiyat=scan.nextInt();
		
		double result= urunMiktari>1000 ? urunMiktari*birimFiyat*0.9 : urunMiktari*birimFiyat;//double degil de int secilirse Compile time error verir
		System.out.println(result);
		
		scan.close();
		}

	}


