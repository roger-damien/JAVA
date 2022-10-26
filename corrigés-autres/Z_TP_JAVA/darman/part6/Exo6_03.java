package darman.part6;

import java.util.Scanner;
import java.util.Arrays;

public class Exo6_03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] notes=new double[9];
		for(int i=0;i<9;i++) {
			System.out.printf("Entrer une note : ");
			notes[i]=sc.nextDouble();
		}
		System.out.printf("notes=%s\n",Arrays.toString(notes));
		
		sc.close();
	}

}
