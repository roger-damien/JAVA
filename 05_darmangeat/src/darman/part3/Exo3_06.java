package darman.part3;

import java.util.Scanner;

public class Exo3_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez l’âge de l’enfant : ");
		int age = scanner.nextInt();

		if (age >= 12) {
			System.out.println("Catégorie Cadet");
		} else if (age >= 10) {
			System.out.println("Catégorie Minime");
		} else if (age >= 8) {
			System.out.println("Catégorie Pupille");
		} else if (age >= 6) {
			System.out.println("Catégorie Poussin");
		}

	}

}

//Variable age en Entier
//Début
//Ecrire "Entrez l’âge de l’enfant : "
//Lire age
//Si age >= 12 Alors
//  Ecrire "Catégorie Cadet"
//SinonSi age >= 10 Alors
//  Ecrire "Catégorie Minime"
//SinonSi age >= 8 Alors
//  Ecrire "Catégorie "
//SinonSi age >= 6 Alors
//  Ecrire "Catégorie Poussin"
//Finsi
//Fin