package darman.part3;

import java.util.Scanner;

public class Exo3_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un 1er nombre :");
		int nombre1 = scanner.nextInt();
		System.out.println("Entrez un 2eme nombre :");
		int nombre2 = scanner.nextInt();

		if (nombre1 == 0 || nombre2 == 0) {
			System.out.println("Le produit est nul");
		} else if ((nombre1 < 0 & nombre2 < 0) || (nombre1 > 0 & nombre2 > 0)) {
			System.out.println("Le produit est positif");
		} else {
			System.out.println("Le produit est négatif");
		}

	}

}

//Variables m, n en Entier
//Début
//Ecrire "Entrez deux nombres : "
//Lire m, n
//Si m = 0 OU n = 0 Alors
//  Ecrire "Le produit est nul"
//SinonSi (m < 0 ET n < 0) OU (m > 0 ET n > 0) Alors
//  Ecrire "Le produit est positif"
//Sinon
//  Ecrire "Le produit est négatif"
//Finsi
//Fin