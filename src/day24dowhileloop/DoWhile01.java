package day24dowhileloop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		
		int i=1;
		while(i<1) {
			System.out.println(i);
			i++;
		}
				
		// do while loop once body deki codu calistirir sonra condition kontrol eder
		do {
			System.out.println(i);
			i++;
		}while(i<1);
		/*kullan�c�dan bir say� al�n.
		 * bu say� 10 dan b�y�kse "kazand�n�z"
		 * sayi 10 veya 10dan k���kse "kaybettiniz yazip tekrar sayi isteyin
		 *Oyun gibi kod yazarken while i�indeki sarti d�ng�n�n devam etme kosuluna g�re ayarlayin,
		 */
		Scanner scan = new Scanner(System.in);
		int s=20;
		do {
			if(s<=10) {
				System.out.println("Kaybettiniz");
			}
			System.out.println("Bir sayi giriniz");
			s=scan.nextInt();
		
		}while(s<=10);
		
		System.out.println("Kazandiniz");
		scan.close();
		
		int a=1;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<11);
		

	}

}
