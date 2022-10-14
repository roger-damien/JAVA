package darman.part4;

import java.util.Scanner;

public class Exo4_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Score du 1er prétendants : ");
		double pretentant1 = scanner.nextFloat();
		System.out.printf("Score du 2eme prétendants : ");
		double pretendant2 = scanner.nextFloat();
		System.out.printf("Score du 3eme prétendants : ");
		double pretendant3 = scanner.nextFloat();
		System.out.printf("Score du 4eme prétendants : ");
		double pretendant4 = scanner.nextFloat();

		if (pretentant1 > 50) {
			System.out.printf("Elu au premier tour");
		} else if (pretentant1 < 12.5 || pretendant2 > 50 || pretendant3 > 50 || pretendant4 > 50) {
			System.out.printf("Battu, éliminé, sorti !!!");
		} else if (pretentant1 >= pretendant2 && pretentant1 >= pretendant3 && pretentant1 >= pretendant4) {
			System.out.printf("Ballotage favorable");
		} else {
			System.out.printf("Ballotage défavorable");
		}

	}

}

//	Variables A, B, C, D en Numérique
//	Variables C1, C2, C3, C4 en Booléen
//	Début
//	Ecrire "Entrez les scores des quatre prétendants :"
//	Lire A, B, C, D
//	C1 ← A > 50
//	C2 ← B > 50 ou C > 50 ou D > 50
//	C3 ← A >= B et A >= C et A >= D
//	C4 ← A >= 12,5
//	Si C1 Alors
//	  Ecrire “Elu au premier tour"
//	Sinonsi C2 ou Non(C4) Alors
//	  Ecrire “Battu, éliminé, sorti !!!”
//	SinonSi C3 Alors
//	  Ecrire "Ballotage favorable"
//	Sinon
//	  Ecrire "Ballotage défavorable"
//	FinSi
//	Fin
