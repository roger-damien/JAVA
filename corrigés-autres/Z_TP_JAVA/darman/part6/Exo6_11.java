package darman.part6;

public class Exo6_11 {

	public static void main(String[] args) {
		int[] tab1={4,8,7,9,1,5,4,6},tab2={7,6,5,2,1,3,7,4};
		int schtroumpf=0;
		for(int i=0;i<tab1.length;i++) {
			for(int j=0;j<tab2.length;j++) {
				schtroumpf+=tab1[i]*tab2[j];
			}
		}
		System.out.printf("Schtroumpf : %d",schtroumpf);
	}

}
