package day07modulus;

public class Q01 {

	public static void main(String[] args) {
		//asagidaki compile time error nasil duzeltilir?
		
		//float num1=3.23;
		//double num2=3.23;
		// 1. yol:virgullu sayinin sonuna f veya F yazilir.
		float num1=3.23F;//boolean-char-byte-short-int-long-float-double
		
		
		//2. yol; Expilicit Norrowing 
		float num2=(float) 3.23;
		
		//3. yol, float yerine double yazarak
		double num3=3.23;
		
		System.out.println(num1+num2+num3);
		

	}

}
