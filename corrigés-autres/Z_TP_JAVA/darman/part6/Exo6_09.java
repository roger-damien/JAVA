package darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		System.out.printf("Combien de valeur vas-tu saisir ? ");
		int n=sc.nextInt();
		int[] tab=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.printf("Valeur %d : ",i+1);
			tab[i]=sc.nextInt();
			sum+=tab[i];
		}
		
		System.out.printf("tab=%s\n",Arrays.toString(tab));
		System.out.printf("La somme de tous les elements du tableau est %d",sum);
		sc.close();
	}

}
