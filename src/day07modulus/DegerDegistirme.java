package day07modulus;

public class DegerDegistirme {

	public static void main(String[] args) {
		/*sayı1 ve sayı2 adlı iki integer variable oluşturunuz ve
		bunların değerlerini yer değiştiriniz.*/
		//1. yol
		int sayi1=12;
		int sayi2=5;
		System.out.println(sayi1+"-"+sayi2);//12-5
		int degis=0;
		
		degis=sayi1;
		sayi1=sayi2;
		sayi2=degis;
		System.out.println(sayi1+"-"+sayi2);//5-12
		//2. yol
		
	
		}

}