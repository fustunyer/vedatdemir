package day13nested;

import java.util.Scanner;

public class Turnary01 {

	public static void main(String[] args) {
		
		Scanner scan= new  Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int rakamMi=scan.nextInt();
		
		String result= rakamMi<10&&rakamMi>=0 ? "Rakam" : "Rakam degildir";
		System.out.println(result);
		
		scan.close();
		
		
	}

}
