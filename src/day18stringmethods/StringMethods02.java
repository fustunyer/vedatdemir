package day18stringmethods;

import java.util.Scanner;

public class StringMethods02 {

	public static void main(String[] args) {
		//9)equals()
		
				String a = "Java";
				String b = "Java";
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Java gir");
				String c= scan.next();
				
				
				System.out.println(a==b);//true
				System.out.println(a.equals(b));//true
				
				System.out.println(a==c);//false
				System.out.println(a.equals(c));//true
		
		
		
		//10 )equalsIgnoreCase()  sadece kelimelerin harflerinin ayni olamsini buyuk veya kucuk harfleri onemsemeden kontrol eder.
		
		String str="Vedat Demir";
		System.out.println(str.equalsIgnoreCase("vedat demir"));
		
		//11)startWith()
		System.out.println("**************");
		System.out.println(str.startsWith("v"));
		System.out.println(str.startsWith("V"));
		System.out.println(str.startsWith("d", 2));
		
		//12)indexOf()
		System.out.println("**************");
		System.out.println(str.indexOf("t"));
		System.out.println(str.indexOf("V"));
		System.out.println(str.indexOf("mir"));//
		System.out.println(str.indexOf("w"));//-1 ciktisi olmadigi anlamindadir.
		System.out.println(str.indexOf("q"));
		System.out.println("**************");
		//13) lastIndexOf() metodu son görünümün indexini verir.
		System.out.println(str.lastIndexOf("e"));
		
		//14) substring()   bir Stringin belli bir bölümünü kesip almaya yarar.ÖNEMLÝ
		
		String str2="Calisirsan kazanirsin Vedat!        ";
		System.out.println(str2.substring(11));
		System.out.println(str2.lastIndexOf("V"));
		System.out.println(str2.substring(22));//
		
		System.out.println(str2.substring(0,10));//indexi 0 dan 9 a kadar yazar
		System.out.println(str2.substring(2,3));//2 dahil 3 haric
		System.out.println(str2.substring(3,3));
		//System.out.println(str2.substring(5,3));
		
		//15) trim() metodu String te sadece bas ve son taraflardaki space leri siler
		System.out.println(str2.length());
		System.out.println(str2.trim().length());
		System.out.println("**************");
		String str3="          Calisirsan kazanirsin Vedat!  jns;o valekinjmv'a va'likvna vikrjni fkifsim       ";
		System.out.println(str3.length());
		System.out.println(str3.replace(" ","").length());
		
		scan.close();
		
			
	}

}
