package darman.part4;

import java.util.Scanner;

public class Exo4_04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double prix=0;
		
		System.out.printf("Nombre de copies : ");
		int n=sc.nextInt();
		
		if(n<=10) {
			prix=0.10*n;
		}
		else if(n<=30) {
			prix=0.10*10+0.09*(n-10);
		}
		else { 
			prix=0.10*10+0.09*20+0.08*(n-30);
		}
		
		/* Avec une boucle for
		for(int i=1;i<=n;i++) {
			if(i<=10) {
				prix+=0.10;
			}
			else if(i<=30) {
				prix+=0.09;
			}
			else { 
				prix+=0.08;
			}
		}
		*/
		
		System.out.printf("La facture pour %d copie(s) s'eleve a %.2f €",n,prix);
		
		sc.close();
	}
	
}
