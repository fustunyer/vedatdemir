package day27consructors;

import java.util.Scanner;

public class C01 {
	//class lar object lerın kalibidir. Yani classlari object uretebilmek icin olusutururuz.
	//her class olustugunda Java bundan object uretecegini ongorur.
	//bu object uretebilmek icin her class olusurken Java o classin "constuctor" ini default olarak uretir.
	//Consructor class ile ayni isimde olmak zorunda ancak parametreler degistirilebilir veya cogaltilabilir.
	//Object uretiminde sadece constructor kullnilabilir.
	//Constructorlar parametreli olabilirler ancak parametre sayilari ve cesitleri farkli olmalidir
	//method ile constructor arasinda 2 fark vardir
	//1. constructor in return type olmaz. methodun ise mutlaka return type vardir(void,String, int, ...)
	//2. consructorin ismi class ile ayni olmak zorundadir. methodlar class ile ayni da olabilir farkli da olabilir
	//bir constructor yazarsan java defsult constructoru siler senion yazdigini kullanir. 
	
	
	C01(){
		System.out.println("paranetresiz constructor");
		
	}
	C01(String s){
		System.out.println("String parametreli constructor");
	}
	C01(int i){
		System.out.println("int parametreli consructor");
	}
	//method yazarken return type mutlaka varrdir.
	public static String C01(String s) {
		return s+" method calistirdi";
		
	}
	

	public static void main(String[] args) {
	//class ismi   object isim verin      new keyword kullanin     Constructors		
		C01             obj1          =           new                 C01();
		Scanner         scan          =           new               Scanner(System.in);
		C01             obj2          =           new                 C01(25);
		System.out.println(C01("fatih"));//bu C01 methodu
		//inheritance miras
		System.out.println("bir String yaziniz");
		String str=scan.next();
		C01("fatih").contains("f");
		
		

	}

}
