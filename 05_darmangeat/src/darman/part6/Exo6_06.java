package darman.part6;

public class Exo6_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] suite = new int[8];
		suite[0] = 1;
		suite[1] = 1;

		System.out.println("suite[0] = " + suite[0]);
		System.out.println("suite[1] = " + suite[1]);

		for (int i = 2; i < 8; i++) {
			suite[i] = suite[i - 1] + suite[i - 2];
			System.out.println("suite[" + i + "] = " + suite[i]);

		}

	}

}

//Tableau Suite[7] en Entier
//Variable i en Entier
//Début
//Suite[0] ← 1
//Suite[1] ← 1
//Pour i ← 2 à 7
//  Suite[i] ← Suite[i-1] + Suite[i-2]
//i suivant
//Pour i ← 0 à 7
//  Ecrire Suite[i]
//i suivant
//Fin