package darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] notes=new double[9];
		double sum=0;
		for(int i=0;i<9;i++) {
			System.out.printf("Entrer une note : ");
			notes[i]=sc.nextDouble();
			sum+=notes[i];
		}
		System.out.printf("notes=%s\n",Arrays.toString(notes));
		System.out.printf("Moyenne : %.2f\n",sum/9);
		
		sc.close();
	}

}
