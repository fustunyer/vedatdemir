package day08incrementdecrement;

public class Concatenation {

	public static void main(String[] args) {
		
		int a=4;
		int b=5;
		String str="Java";
		String str1="kolaydir";
		
		System.out.println(str+ " "+str1);//Java kolaydir
		System.out.println(str+" "+(a+b));//Java 9
		System.out.println(str+" "+a+b);//Java 45
		System.out.println(a+b+" "+str);//45 Java
		
		int n1= 2;
		int n2= 3;
		String s1= "Study";
		
		//ekrana "61 Study-1"
		System.out.println((n1*n2)+""+(n2-n1)+" "+s1+(n1-n2));
		
		

	}

}
