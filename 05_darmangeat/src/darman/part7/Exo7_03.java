package darman.part7;

import java.util.Arrays;

public class Exo7_03 {

	public static void main(String[] args) {
		int[] tab = { 3, 12, 21, 45, 122, 78, 64, 53, 89, 28, 84, 46 };
		System.out.printf("Tableau normal\ntab=%s\n", Arrays.toString(tab));

		for (int i = 0; i < Math.floor(tab.length / 2); i++) {
			int temp = tab[i];
			tab[i] = tab[tab.length - 1 - i];
			tab[tab.length - 1 - i] = temp;
		}
		System.out.printf("Chiffres inversés\ntab=%s\n", Arrays.toString(tab));
	}

}

//…
//Pour i ← 0 à (N-1)/2
//  Temp ← T[i]
//  T[i] ← T[N-1-i]
//  T[N-1-i] ← Temp
//i suivant
//Fin