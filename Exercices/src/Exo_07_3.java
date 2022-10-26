import java.util.Scanner;

public class Exo_07_3 {
	
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Indiquez le diamètre du cerle :");
		double diametre = clavier.nextDouble();
		double rayon = diametre / 2;
		 
		
		float surface1 =  (float) (Math.PI * (rayon * rayon));
		double surface2 = (Math.PI * (rayon * rayon));
		
		
		System.out.printf("La surface du cercle en float est de %f\n", surface1);
		System.out.printf("La surface du cercle en double est de %s", surface2);
	

	}

}
