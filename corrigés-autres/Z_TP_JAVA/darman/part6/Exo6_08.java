package darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pos=0,neg=0;
		
		System.out.printf("Combien de valeur vas-tu saisir ? ");
		int n=sc.nextInt();
		int[] tab=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.printf("Valeur %d : ",i+1);
			tab[i]=sc.nextInt();
			if(tab[i]>=0)pos++;
			else if(tab[i]<0)neg++;
			//int t=(tab[i]>=0)?pos++:neg++;
		}
		System.out.printf("tab=%s\n",Arrays.toString(tab));
		System.out.printf("Tu as saisi %d valeurs nulles ou positives et %d valeurs negatives",pos,neg);
		sc.close();
	}

}
