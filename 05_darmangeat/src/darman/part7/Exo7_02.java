package darman.part7;

import java.util.Arrays;

public class Exo7_02 {

	public static void main(String[] args) {
		System.out.printf("Tri par sélection\n");
		int[] tab = { 3, 12, 21, 45, 122, 78, 64, 53, 89, 28, 84, 46 };
		System.out.printf("tab=%s\n", Arrays.toString(tab));
		for (int i = 0; i < tab.length - 1; i++) {
			for (int j = i + 1; j < tab.length; j++) {
				if (tab[j] > tab[i]) {
					int temp = tab[j];
					tab[j] = tab[i];
					tab[i] = temp;
				}
			}
		}
		System.out.printf("tab=%s\n", Arrays.toString(tab));

		System.out.printf("\nTri à bulles\n");
		int[] tab1 = { 3, 12, 21, 45, 122, 78, 64, 53, 89, 28, 84, 46 };
		System.out.printf("tab=%s\n", Arrays.toString(tab1));
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < tab1.length - 1; i++) {
				if (tab1[i] < tab1[i + 1]) {
					int temp = tab1[i];
					tab1[i] = tab1[i + 1];
					tab1[i + 1] = temp;
					flag = true;
				}
			}
		}

	}

}
//
//Pour i ← 0 à N - 2
//posmaxi = i
//Pour j ← i + 1 à N - 1
//  Si t[j] > t[posmaxi] alors
//    posmaxi ← j
//  Finsi
//j suivant
//temp ← t[posmaxi]
//t[posmaxi] ← t[i]
//t[i] ← temp
//i suivant
//Fin
//Tri à bulles :
//…
//Yapermut ← Vrai
//TantQue Yapermut
//Yapermut ← Faux
//Pour i ← 0 à N - 2
//  Si t[i] < t[i + 1] Alors
//    temp ← t[i]
//    t[i] ← t[i + 1]
//    t[i + 1] ← temp
//    Yapermut ← Vrai
//  Finsi
//i suivant
//FinTantQue
//Fin