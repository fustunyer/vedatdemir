package day16switch;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// kullnýcýdan gün numarasýný alýn ekrana gün ismini yazdýrýn
		 // 1 pazartesi

		Scanner scan =new Scanner(System.in);
		System.out.println("1 de 7 ye kadar rakam giriniz");
		int sayi=scan.nextInt();
		
		switch(sayi) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("1den 7 ye kadar dedik dikkat et kardesim!");
			break;
					
		}
		
		scan.close();
		
		
	}

}
