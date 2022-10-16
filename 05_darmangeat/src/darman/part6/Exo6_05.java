package darman.part6;

public class Exo6_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nb = new int[7];
		int i, k;
		nb[0] = 1;

		for (i = 1; i <= 6; i++) {
			nb[i] = nb[i - 1] + 2;
			System.out.println("nb[" + (i) + "] = " + nb[i]);

		}

	}

}
//
//Tableau N[6] en Entier
//Variables i, k en Entier
//Début
//N[0] ← 1
//Pour k ← 1 à 6

//  N[k] ← N[k-1] + 2
//k Suivant
//Pour i ← 0 à 6
//  Ecrire N[i]
//i suivant
//Fin