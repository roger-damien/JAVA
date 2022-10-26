package darman.part1;

public class Exo1_05 {
	
	public static void main (String[] args){
		byte a=5,b=2;
		a=b;
		b=a;
		
		// a=2, b=2
		// Moralité : Non elles ne permettent pas d'échanger les valeurs de a et b
		//            Si on inverse les 2 dernieres instructions => a=5, b=5
		//
		// Controle
		System.out.println("a="+a+", b="+b);
	}

}
