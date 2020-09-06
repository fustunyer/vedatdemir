package day13nested;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * a)Kullanıcıdan bir yıl alın 
		 * b)eğer yıl 1000’e bulunuyorsa ekrana “Milenyum�? yazdırın.
		   c)Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl�? yazdırın.
		    d)Eğer yıl 10’a bulunuyorsa ekrana “Onyıl�? yazdırın.
		    e)diger yillara normal yil yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Yil giriniz");
		int yil=scan.nextInt();
		
		if(yil%1000==0) {
			System.out.println("Milenyum");
		}else if(yil%100==0) {
			System.out.println("yuzyil");
		}else if(yil%10==0) {
			System.out.println("onyil");
		}else {
			System.out.println("Normal yil");
		}
		
		scan.close();
		
		
		
		
	}

}
