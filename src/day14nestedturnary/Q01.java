package day14nestedturnary;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*  a)Kullanıcıdan bir harf girmesini isteyin.
	    	b)1.Girdiği küçük harf ise harfin 2.“a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
		“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
			c)1.Girdiği büyük harf ise harfin 2.“Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
		“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
*/
		Scanner input = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char harf=input.next().charAt(0);
		//        97         122
		if(harf>='a'&&harf<='z') {
			if(harf=='a') {
				System.out.println("ilk kucuk harf");
			}else {
				System.out.println("ilk kucuk harf degil");
			}//        65          90
		}else if(harf>='A'&&harf<='Z') {
			if(harf=='Z') {
				System.out.println("Son buyuk harf");
			}else {
				System.out.println("Son buyuk harf degil");
			}
		}
		
		input.close();
		
		
		
		
		
	}

}
