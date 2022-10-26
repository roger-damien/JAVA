package exercice_05;

import java.util.Scanner;

public class Version2 {

	static int nbDiv=7;
	static final int NBR_BY_LINE=4;
	static final int LINE_BY_PAGE=25;
	static final String TEXT_RESET="\u001B[0m";
	static final String TEXT_RED="\u001B[1;31m";
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String replay="N";
		
		do {
			// ASSIGNATION DU MULTIPLE
			System.out.printf("Affichons les multiples de ");
			nbDiv=(int)Math.floor(sc.nextDouble());
			nbDiv+=nbDiv<0?1:0;
			sc.nextLine();
			
			if(nbDiv!=0) {
				// ASSIGNATION DES BORNES
				System.out.printf("entre ");
				int limitLow=(int)Math.floor(sc.nextDouble());
				limitLow+=limitLow<0?1:0;
				System.out.printf("et ");
				int limitUp=(int)Math.floor(sc.nextDouble());
				limitUp+=limitUp<0?1:0;
				
				if(limitLow>limitUp) {
					int temp=limitUp;
					limitUp=limitLow;
					limitLow=temp;
				}
				sc.nextLine();
				
				// CALCUL ET AFFICHAGE DES MULTIPLES
				int decNbr=0,decLine=0;
				for(int x=limitLow;x<=limitUp;x++) {
					if(decNbr%NBR_BY_LINE!=0) System.out.printf("\t\t");
					
					if(x%nbDiv==0)
						System.out.printf("%s%d",TEXT_RED,x);
					else 
						System.out.printf("%s%d",TEXT_RESET,x);
					
					decNbr++;
					if(decNbr%NBR_BY_LINE==0) {
						System.out.printf("\n");
						if(++decLine>=LINE_BY_PAGE && x!=limitUp) {
							System.out.printf("%sSuite... (appuie sur ENTER)\n",TEXT_RESET);
							decLine=0;
							sc.nextLine();
						}
					}
				}
				System.out.printf("%s\nTerminé\n\n",TEXT_RESET);
			}
			else 
				System.out.printf("%s\nLa division par 0 est impossible%s\n\n",TEXT_RED,TEXT_RESET);
			
			// MESSAGE DE FIN
			do {
				System.out.printf("Recommencer (O/N) : ");
				replay=sc.nextLine().toUpperCase();
				if(replay.equals("O")||replay.equals("N")) {
					System.out.printf("\n");
					break;
				}
			}
			while(true);
			System.out.print("\033[H\033[2J");
		}
		while(replay.equals("O"));
		
		System.out.printf("Au revoir");
		sc.close();
	}

}
