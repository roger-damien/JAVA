package darman.part3;

import java.util.Scanner;

public class Exo3_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Affiche "Ecrire un nombre: "
		System.out.println("Ecrire un premier nombre : ");
		int a = scanner.nextInt();
		System.out.println("Ecrire un second nombre : ");
		int b = scanner.nextInt();

		if (a > 0 && b > 0) {
			System.out.println("Leur produit est positif ");
		} else {
			System.out.println("Leur produit est négatif ");
		}
	}

}

//Variables m, n en Entier
//Début
//Ecrire "Entrez deux nombres : "
//Lire m, n
//Si (m > 0 ET n > 0) OU (m < 0 ET n < 0) Alors
// Ecrire "Leur produit est positif"
//Sinon
// Ecrire "Leur produit est négatif"
//Finsi
//Fin