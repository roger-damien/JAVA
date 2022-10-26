package darman.part6;

import java.util.Arrays;

public class Exo6_04 {

	public static void main(String[] args) {
		// {0,1,4,9,16,25}
		
		int[] nb=new int[6];
		
		/**/
		for(int i=0;i<6;i++) {
			nb[i]=i*i;
		}
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",nb[i]);
		}
		// Amelioration 1
		System.out.printf("\n");// Pas dans l'algorithme, pour la mise en forme
		for(int i=0;i<6;i++) {
			nb[i]=i*i;
			System.out.printf("%d ",nb[i]);
		}
		// Amelioration 2
		for(int i=0;i<6;i++) {
			nb[i]=i*i;
		}
		System.out.printf("\nnb=%s\n",Arrays.toString(nb));
		/**/
	}
	
}
