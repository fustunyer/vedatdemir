package day12IfElseIfStatement;

import java.util.Scanner;

public class Q03 {

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
		
		if(urunMiktari>1000) {
			System.out.println("toplam indirimli tutar: "+urunMiktari*birimFiyat*0.9);// %10 indirim yapmak demek %100-%10=%90 
		}else {
			System.out.println("toplam tutar: "+urunMiktari*birimFiyat);
		}
		
		
		
		
		
		
		scan.close();

	}

}
