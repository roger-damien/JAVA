package darman.part1;

public class Exo1_06 {
	
	public static void main (String[] args){
		byte a=1,b=2,c;
		System.out.println("Avant : a="+a+", b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("Apres : a="+a+", b="+b);
	}
	
}
