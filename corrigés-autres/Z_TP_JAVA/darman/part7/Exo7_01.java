package darman.part7;

import java.util.Arrays;
import java.util.Scanner;

public class Exo7_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Combien de valeur vas-tu saisir ? ");
		int n=sc.nextInt();
		int[] tab=new int[n];
		
		System.out.printf("Valeur 1 (0): ");
		tab[0]=sc.nextInt();
		for(int i=1;i<n;i++) {
			System.out.printf("Valeur %d (%d): ",i+1,i);
			int v=sc.nextInt();
			boolean find=false;
			for(int j=0;j<i;j++) {
				if(v<tab[j]) {
					for(int k=i-1;k>=j;k--) {
						tab[k+1]=tab[k];
					}
					tab[j]=v;
					find=true;
					break;
				}
			}
			if(!find)tab[i]=v;
		}
		
		String texte="";
		for(int i=1;i<n;i++) {
			if(tab[i]!=tab[i-1]+1) {
				texte="non ";
				break;
			}
		}
		
		System.out.printf("\ntab=%s\n",Arrays.toString(tab));
		System.out.printf("Les nombres sont %sconsecutifs",texte);
		
		sc.close();
	}

}
