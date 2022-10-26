package darman.part4;

import java.util.Scanner;

public class Exo4_06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Quel est le score du 1er candidat ? ");
		double c1=sc.nextFloat();
		System.out.printf("Quel est le score du 2e candidat ? ");
		double c2=sc.nextFloat();
		System.out.printf("Quel est le score du 3e candidat ? ");
		double c3=sc.nextFloat();
		System.out.printf("Quel est le score du 4e candidat ? ");
		double c4=sc.nextFloat();
		
		if(c1+c2+c3+c4>100){
			System.out.printf("Qui a bourre les urnes ?");
		}
		else if(c1>50){
			System.out.printf("Le 1er candidat est élu !");
		}
		else if(c1<12.5 || c2>50 || c3>50 || c4>50){
			System.out.printf("Le 1er candidat est elimine");
		}
		else if(c1>=c2 && c1>=c3 && c1>=c4){
			System.out.printf("Le 1er candidat est en ballotage favorable");
		}
		else {
			System.out.printf("Le 1er candidat est en ballotage defavorable");
		}
		
		sc.close();
	}
	
}
