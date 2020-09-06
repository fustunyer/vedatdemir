package day24dowhileloop;

public class Q01 {
	
	public static void main(String[] args) {
		//Ilk 5 buyuk harfin ASCII degerleri toplamini ekrana yazdiran bir program 
		//yaziniz while-loop kullaniniz A B C D E
		char harf='A';
		int sum=0;
		while(harf<='E') {
			sum=sum+harf;
			harf++;
		}
		System.out.println(sum);
		System.out.println('A'+'B'+'C'+'D'+'E');//65+66+67+68+69
		
		
		
		
		
		
		
	}
	
	
	
	

}
