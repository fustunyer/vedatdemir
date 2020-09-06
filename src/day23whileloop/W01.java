package day23whileloop;

public class W01 {

	public static void main(String[] args) {
		
		 //  baslangc   kosul    artis azalis
		/*for (int i = 0; i < 10 ; i++) {
			System.out.println(i);//kod
		}
		
		int i=5;//baslangic
		while(i<100) {//kosul
			System.out.print(i+"-");//code
			i+=5;//artis azalis=====>cok onemli cunku artis azalis olmazsa sonsuz dongu olusur.i+=5=>=i=i+5
		*/
		
		//Ilk 10 sayma sayisini buyukten kucuge yazdiriniz, while-loop kullaniniz
		int j=10;
		while(j>1) {
			System.out.print(j+"-");
			j--;			
		}System.out.println(1);
			
		//Ilk 100 cift sayma sayisini yazdiran program yaziniz, while-loop kullaniniz
		//1. yol
		int z=2;
		while(z<=200) {
			System.out.print(z+" ");//2 4 6 8 10    200
			z=z+2;
		}
		System.out.println();
		//2.yol
		int k=1;
		while(k<=100) {
			System.out.print(2*k+"-");
			k++;
		}
		System.out.println();
		//3. yol
		int m=1;
		while(m<=200) {
			if(m%2==0) {
				System.out.print(m+"/");
			}
			m++;
		}
		System.out.println();
		//j'den onceki tum kucuk harfleri yazdiran bir program yaziniz, while-loop kullaniniz abcdefgij
		char y='a';
		while(y<'j') {
			System.out.print(y);//a b c d e f g h i 
			y++;
		}
		
		
		//Ilk 5 buyuk harfin ASCII degerleri toplamini ekrana yazdiran bir program 
				//yaziniz while-loop kullaniniz
			
		
		}	
	}
	
