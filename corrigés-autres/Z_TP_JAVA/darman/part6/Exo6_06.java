package darman.part6;

import java.util.Arrays;

public class Exo6_06 {

	public static void main(String[] args) {
		// {1,1,2,3,5,8,13,21}
		
		int[] n=new int[8];
		
		n[0]=n[1]=1;
		for(int i=2;i<8;i++) {
			n[i]=n[i-1]+n[i-2];
		}
		for(int i=0;i<8;i++) {
			System.out.printf("%d ",n[i]);
		}
		
		System.out.printf("\nnb=%s\n",Arrays.toString(n));
	}

}
