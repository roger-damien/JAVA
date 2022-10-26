package darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Combien de valeur vas-tu saisir ? ");
		int n=sc.nextInt();
		int[] tab=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.printf("Valeur %d (%d): ",i+1,i);
			tab[i]=sc.nextInt();
		}
		
		
		int max=tab[0],pos=0;
		for(int i=1;i<n;i++) {
			if(tab[i]>max) {
				max=tab[i];
				pos=i;
			}
		}
		
		System.out.printf("\ntab=%s\n",Arrays.toString(tab));
		System.out.printf("Le plus grand entier est %d, c'est la valeur en position %d",max,pos);
		
		sc.close();

	}

}
