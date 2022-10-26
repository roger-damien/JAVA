package darman.part1;

public class Exo1_07 {
	
	public static void main (String[] args){
		byte a=1,b=2,c=3,d;
		// Controle initial
		System.out.println("Avant : a="+a+", b="+b+", c="+c);
		d=a;
		a=b;
		b=c;
		c=d;
		// Controle final
		System.out.println("Après : a="+a+", b="+b+", c="+c);
	}
	
}
