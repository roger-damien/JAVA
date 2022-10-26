package darman.part2;

import java.util.Scanner;

public class Exo2_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double nbre,carre;
		System.out.printf("Entre un nombre : ");
        nbre=sc.nextDouble();
		
        carre=Math.pow(nbre,2);
        System.out.printf("Le carre de %f est %f",nbre,carre);
        
        sc.close();
	}

}
