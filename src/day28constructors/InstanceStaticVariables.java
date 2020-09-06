package day28constructors;

public class InstanceStaticVariables {
	
	//classin icinde main methodun dusunda tanimlanan variabllara instance variable denir.
	
	int count=10;
	static String str="Ali";

	public  static void main(String[] args) {
		
		/*for (int i = 0; i < 10; i++) {
			int count=1;
			System.out.println(i+count);
			count++;
		}

		System.out.println(str);*/
	/*	 1)static variablelar calss lara aittir ve diger adi class variable dir
	 * Instance variable lar object lere aittir ve diger adi object variable dir.
	 * 2)static variable lardaki degisikliklerkim tarafindan yapilirsa yapilsin butun object ler tarafindan gorulur.
	 * Instance variablelardaki degisiklikler sadece o object tarafindan gorulur.
	 * 3)static variable class olusturulurken Java tarafindan olusturulur. Instance variable lar object ler uretilirken olusur.
	 *  
		*/
		InstanceStaticVariables isv01=new InstanceStaticVariables();		
		InstanceStaticVariables isv02=new InstanceStaticVariables();
		isv01.count=20;
		System.out.println(isv01.count);//20
		System.out.println(isv02.count);//10
		str="Veli";
		System.out.println(str);
		System.out.println(str);
		
		
		
	}

}
