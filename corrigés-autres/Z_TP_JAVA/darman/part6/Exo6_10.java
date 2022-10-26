package darman.part6;

import java.util.Arrays;

public class Exo6_10 {

	public static void main(String[] args) {
		int[] tab1={4,8,7,9,1,5,4,6},tab2={7,6,5,2,1,3,7,4};
		int[] tab3=new int[tab1.length];
		for(int i=0;i<tab1.length;i++) {
			tab3[i]=tab1[i]+tab2[i];
		}
		System.out.printf("tab3=%s\n",Arrays.toString(tab3));
	}

}
