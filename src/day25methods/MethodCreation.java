package day25methods;

public class MethodCreation {

	public static void main(String[] args) {
		carpma(3,10);
		System.out.println(carpma2(2,5));
		carpma(5,4);//20
		carpma(5.0,4);//20.0
		
		int a=5;
		int b=4;
		System.out.println(a*b);
		
		

	}
	//Methodlar main methodun disina yazilir.
	//main methoddan cagirmak icin methodun static olmasi gerekir. 
	//methodun return type eger "void" degilse mutlaka bir deger return etmelidir.
	//methodun icine yazdigimiz variable lara "parametre
	public static void carpma(int a,int b) {
		System.out.println(a*b);		
	}
	public static int carpma2(int a, int b) {
		return a*b;//10
	}
	//methodun ismini degistirmeden sadece parametrelerin sayisi,variable type i veya bunlarin sirasi dewgistirilerek farkli 
	//methodlar olusturulur. buna METHOD OVERLOADING denir.
	public static void carpma(double y,int x) {
		System.out.println(y*x);
	}
	public static double carpma(int y,double x) {
		return y*x;
	}
	public static void carpma(int n1) {
		System.out.println("Ikinci  carpma methodu");
	}
	public static void carpma(byte n1) {
		System.out.println("Altýncý carpma methodu");
	}
	public static void carpma(long n1) {
		System.out.println("ucuncu carpma methodu");
	}
	public static void carpma(double n1,double n2) {
		System.out.println("dorduncu carpma methodu");
	}
	public static void carpma(double n1,int n2,short n3) {
		System.out.println("Besinci carpma methodu");
	}
	
	
	
}
