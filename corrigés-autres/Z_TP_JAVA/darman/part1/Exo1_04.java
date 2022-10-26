package darman.part1;

public class Exo1_04 {
	
	public static void main (String[] args){
		byte a=3,b=10,c;
		c=(byte)(a+b);
		b=(byte)(a+b);
		a=c;
		
		// a=13, b=13, c=13
		// Controle
		System.out.println("a="+a+", b="+b+", c="+c);
	}
	 
}
