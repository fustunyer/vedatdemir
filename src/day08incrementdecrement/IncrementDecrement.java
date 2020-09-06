package day08incrementdecrement;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int yas=25;
		System.out.println(yas);//25
		//3 yil sonra yas ne olur?
		yas = yas+3; // "=" matematikteki esittir anlaminda degil assisgment deger atama anlamindadir 
		System.out.println(yas);// bir variable artis oldugunda increment, azalis oldugunda decrement yapmis oluruz.
		yas=yas+25;
		System.out.println(yas);//
		yas=yas*2;
		System.out.println(yas);
		yas=yas/2;//53
		System.out.println(yas);
		yas=yas-40;//13
		System.out.println(yas);
		
		int boy=25;
		
		//yas variableini 1 azaltma;
		//1.yol
		boy=boy-1;//25-1=24
		System.out.println(boy);
		//2.yol
		boy-=1;
		System.out.println(boy);//24-1=23
		//3.yol
		boy--;//23-1=22
		System.out.println(boy);
		// 3azaltma
		boy-=3;
		//5 artirma
		boy+=5;
		System.out.println(boy);
		boy/=4;
		System.out.println(boy);//6
		System.out.println(boy++);//6--> once yazdir sonra arttir
		System.out.println(boy);//7
		System.out.println(++boy);//8-->once arttir sonra yazdir
		
		
				
		

	}

}
