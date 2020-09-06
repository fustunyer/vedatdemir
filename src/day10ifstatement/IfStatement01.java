package day10ifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		//Kullanıcıdan bir tamsayı alın eğer tamsayı 3 ile bölünebiliyorsa ekrana “3’ün katı” yazdırın.
		//3 ile bölünemiyorsa ekrana “3’ün katı değildir” yazdırın.
		
		Scanner input=new Scanner(System.in);
		System.out.println("Bir tamsayi yaziniz.");
		int num=input.nextInt();
		//3 ile bolunebilmesi demek 3 e bolundugunde 0 kalanini vermek demektir.
		if(num%3==0) {
			System.out.println("3'un kati");
		}if(num%3!=0) {
			System.out.println("3'un kati degildir.");
		}
		
		input.close();
		
		

	}

}
