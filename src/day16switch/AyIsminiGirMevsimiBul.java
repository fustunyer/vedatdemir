package day16switch;

import java.util.Scanner;

public class AyIsminiGirMevsimiBul {

	public static void main(String[] args) {
		//ay ismini girince o ayýn mevsimini ekrana yazdýrýn
		/*
		 * aralik ocak subat Kis
		 * mart nisan mayis  ilkbahar
		 * haziran temmuz agustos yaz
		 * eylul ekim kasim sonbahar	
		 * 	 */
		Scanner scan =new Scanner(System.in);
		System.out.println("Ay ismini giriniz");
		String ay=scan.nextLine();
		
		switch(ay) {
		case "aralik":
		case "ocak":
		case "subat":
			System.out.println("kis");
			break;
		case "mart":
		case "nisan":
		case "mayis":
			System.out.println("ilkbahar");
			break;
		case "haziran":
		case "temmuz":
		case "agustos":
			System.out.println("yaz");
			break;
		case "eylul":
		case "ekim":
		case "kasim":
			System.out.println("sonbahar");
			break;
		default:
			System.out.println("lutfen ay ismi giriniz.");
	}
		
		
		scan.close();
		
		
		
		
	}

}
