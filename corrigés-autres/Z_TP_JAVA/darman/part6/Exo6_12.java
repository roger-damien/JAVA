package darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Combien de valeur vas-tu saisir ? ");
		int n=sc.nextInt();
		int[] tab=new int[n],up=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.printf("Valeur %d : ",i+1);
			
			/**/
			tab[i]=sc.nextInt();
			up[i]=tab[i]+1;
			// OU
			// up[i]=sc.nextInt()+1;
			/**/
			
		}
		for(int i=0;i<n;i++) {
			System.out.printf("%d ",up[i]);
		}
		
		System.out.printf("\nup=%s\n",Arrays.toString(up));
		sc.close();
	}

}
