package darman.part4;

import java.util.Scanner;

public class Exo4_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nombre de photocopies :");
		int nombreDePhotocopies = scanner.nextInt();

		double prixTotal = 0;
		for (int i = 1; i <= nombreDePhotocopies; i++) {
			if (i >= 1 && i <= 10) {
				prixTotal = prixTotal + 0.10;
//                System.out.println("+0.10");
			}
			if (i >= 11 && i <= 30) {
				prixTotal = prixTotal + 0.09;
//                System.out.println("+0.09");
			}
			if (i >= 30) {
				prixTotal = prixTotal + 0.08;
//                System.out.println("+0.08");

			}
		}

		System.out.println("Le prix total est: " + prixTotal + "€");
	}
}

//Variables n, p en Numérique
//Début
//Ecrire "Nombre de photocopies : "
//Lire n
//Si n <= 10 Alors
//  p ← n * 0,1
//SinonSi n <= 30 Alors
//  p ← 10 * 0,1 + (n – 10) * 0,09
//Sinon
//  p ← 10 * 0,1 + 20 * 0,09 + (n – 30) * 0,08
//FinSi
//Ecrire "Le prix total est: ", p
//Fin