package exercice_04;

public class Item_04 {

	public static void main(String[] args) {
		System.out.printf("Nombres premiers de 2 a 100 :\n");
		for(int i=2;i<=100;i++) {
			for(int j=i-1;j>=1;j--) {
				if(j==1) {
					System.out.printf("%d  ",i);
				}
				else if(i%j==0) {
					break;
				}
			}
		}
	}

}
