package day17stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		
		String str="Java ogreniyorum. ";
		
		//String methodlari ifadeyi ddegistirmemizi silmemizi kese\memizi saymamizi  vb....bircok isi kolaylikla yapmamizi saglar.
		//1.charAt() methodu
		System.out.println(str.charAt(0));//charAt() methodu String de istedigimiz index te \ki karakteri almamizi saglar.
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(6));//index in Stringin indexini asti .Run Time Error.kodu calistirdiktan sonra alinan hatalar.
		
		//2.contains() methodu
		System.out.println(str.contains("J"));
		System.out.println(str.contains("j"));
		System.out.println(str.contains("Java"));
		/*contains metodu Stringde herhangi bir karakter veya karkaterler olup 
		 *olmadığını kontrol etmek için kullanılır.varsa true yoksa false olur.
		 */
		System.out.println("**********************");
		//3.endsWith() methodu
		System.out.println(str.endsWith("m"));
		System.out.println(str.endsWith("."));
		System.out.println("**********************");
		//4.length() methodu
		System.out.println(str.length());
		
		String str1="123456";
		String str2="123456";
		System.out.println(str1+str2);
		System.out.println(str1.charAt(0)*2);//Compile time error
		
		//5. toUpperCase() tum harfleri buyuk yazar
		String str4="Vedat java calisiyor";
		System.out.println(str4.toUpperCase());//
		System.out.println(str2.toUpperCase());
		
		//6.toLowerCase() 
		String str5="Fatih  ustunyer";
		System.out.println(str5.toLowerCase());
		
		//7.replace() methodu
		System.out.println(str5.replace("Fatih", "Busra"));
		System.out.println(str5.replace("Fatih  ", ""));
		
		
		String str6="Fatih 1234[]';=-?>,<`";
		//8.replaceAll() 
		System.out.println(str6.replaceAll("\\d", "*"));//  \\d    >>>ifadesi tüm rakamlar anlamındadır(digit)
		System.out.println(str6.replaceAll("\\D", "*"));//   \\D    >>>ifadesi rakamlar dışındaki her şey demektir
		System.out.println(str6.replaceAll("\\s", "*"));//  \\s     >>> space demektir
		System.out.println(str6.replaceAll("\\S", "*"));//  \\S    >>> space dışındaki her şey demektir		
		System.out.println(str6.replaceAll("\\w", "*"));//  \\w ifadesi (word-->kelime ve harf) --> a-->z ve A-->Z ve 0-->9 ve  _
		System.out.println(str6.replaceAll("\\W", "*"));//  \\W ifadesi a-->z ve A-->Z ve 0-->9 ve  _  dışındaki her şey
				
	}

}
