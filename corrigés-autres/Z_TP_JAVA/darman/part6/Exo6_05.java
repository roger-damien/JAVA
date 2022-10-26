package darman.part6;

import java.util.Arrays;

public class Exo6_05 {

	public static void main(String[] args) {
		// {1,3,5,7,9,11}
		
		int[] n=new int[7];
		n[0]=1;
		
		/**/
		for(int k=1;k<7;k++) {
			n[k]=n[k-1]+2;
		}
		for(int i=0;i<7;i++) {
			System.out.printf("%d ",n[i]);
		}
		
		// Amelioration 1
		System.out.printf("\n%d ",n[0]);
		for(int k=1;k<7;k++) {
			n[k]=n[k-1]+2;
			System.out.printf("%d ",n[k]);
		}
		
		// Amelioration 2
		for(int k=1;k<7;k++) {
			n[k]=n[k-1]+2;
		}
		System.out.printf("\nnb=%s\n",Arrays.toString(n));
		/**/
		
	}

}
