package day19forloop;

public class ForLoop01 {

	public static void main(String[] args) {
		//10 defa "merhaba" yazdiran kod yazin
		
		/*System.out.println("merhaba");
		System.out.println("merhaba");
		System.out.println("merhaba");
		System.out.println("merhaba");
		System.out.println("merhaba");
		System.out.println("merhaba");
		System.out.println("merhaba");
		System.out.println("merhaba");
		System.out.println("merhaba");
		*/
		
		
		for(int i=1;i<=10; i++ ) {
			System.out.println("merhaba");
		}
		
		
		//1 den 50 ye kadar sayilari yazdirin
		for (int i = 1; i <51 ; i++) {
			System.out.print(2*i+"-");
		}
		//1 den yuze kadar tek sayilari yazdir.
		System.out.println();
		for (int i = 1; i <101; i++) {
			if(i%2!=0) {
				System.out.print(i+"-");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
