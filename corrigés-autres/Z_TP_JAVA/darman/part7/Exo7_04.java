package darman.part7;

import java.util.Arrays;
import java.util.Scanner;

public class Exo7_04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] tab= {12,87,3,17,62,43,23,-2,98,9,33};
		System.out.printf("Tableau initial\ntab=%s\n",Arrays.toString(tab));
		
		System.out.printf("\nIndice de la valeur a supprimer (entre 0 et %d) : ",tab.length-1);
		int indice=sc.nextInt();
		
		int[] newTab=new int[tab.length-1];
		for(int i=0;i<tab.length-1;i++) {
			newTab[i]=i<indice?tab[i]:tab[i+1];
		}
		System.out.printf("Nouveau tableau\nnewTab=%s\n",Arrays.toString(newTab));
		sc.close();
	}

}
