package darman.part4;

import java.util.Scanner;

public class Exo4_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez le sexe (M/F) :");
		char sexe = scanner.nextLine().charAt(0);

		System.out.println("Entrez l’âge: ");
		int age = scanner.nextInt();

		if ((sexe == 'm' && age >= 20) || (sexe == 'f' && age >= 18 && age <= 35)) {
			System.out.println("Imposable");
		} else {
			System.out.println("Non Imposable");
		}

	}

}

//	Variable sex en Caractère
//	Variable age en Numérique
//	Variables C1, C2 en Booléen
//	Début
//	Ecrire "Entrez le sexe (M/F) : "
//	Lire sex
//	Ecrire "Entrez l’âge: "
//	Lire age
//	C1 ← sex = "M" ET age > 20
//	C2 ← sex = "F" ET (age > 18 ET age < 35)
//	Si C1 ou C2 Alors
//	  Ecrire "Imposable"
//	Sinon
//	  Ecrire "Non Imposable"
//	FinSi
//	Fin