package darman.part1;

public class Exo1_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 3;
		int c = 2;
		int d = c;
		c = b;
		b = a;
		a = d;

		System.out.println("Affiche valeur a : " + a + " et b :  " + b + " et c :  " + c + " et d :  " + d);

	}

}
