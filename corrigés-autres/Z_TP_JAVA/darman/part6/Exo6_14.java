package darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Combien de notes sont a saisir ? ");
		int n=sc.nextInt();
		double[] notes=new double[n];
		
		double sum=0,moy;
		for(int i=0;i<n;i++) {
			System.out.printf("Entrer une note : ");
			notes[i]=sc.nextDouble();
			sum+=notes[i];
		}
		moy=sum/n;
		int more=0;
		for(int i=0;i<n;i++) {
			if(notes[i]>moy)more++;
		}
		
		System.out.printf("\nnotes=%s\n",Arrays.toString(notes));
		System.out.printf("Moyenne : %.2f\n",moy);
		System.out.printf("%d notes sont superieures a la moyenne",more);
		
		sc.close();
	}

}
