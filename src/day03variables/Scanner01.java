package day03variables;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		// kullanicidan veri almak nasil yapilir?
		
		Scanner input = new Scanner(System.in);
		System.out.println("Yasinizi giriniz");
		byte yas = input.nextByte();
		System.out.println("Yasiniz: "+yas);
		
		input.close();
		
		
		
		

	}

}
