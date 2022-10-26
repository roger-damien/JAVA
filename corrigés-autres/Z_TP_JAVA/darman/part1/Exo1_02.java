package darman.part1;

public class Exo1_02 {
	
	public static void main (String[] args){
		byte a=5,b=3,c;
		c=(byte)(a+b);
		a=2;
		c=(byte)(b-a);
		
		// a=2, b=3, c=1
		// Controle
		System.out.println("a="+a+", b="+b+", c="+c);
	}
	
}
