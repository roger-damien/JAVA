package exercice_07;

import java.util.Scanner;
import static java.lang.Math.PI;

public class item3 {

	public static void main(String[] args) {
		
		System.out.println("Indiquez le diamètre du cerle :");
		Scanner clavier = new Scanner(System.in);
		//float diametre = clavier.nextFloat();
		double diametre = clavier.nextDouble();
		
		double surface =  (Math.PI * (diametre / 2));
		
		System.out.printf("La surface du cercle est de %.6f", surface);
	}

}
