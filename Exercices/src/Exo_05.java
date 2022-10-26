import java.util.Scanner;

public class Exo_05 {

	
		
		static final int maxCol = 8;
		static final int maxLigne = 10;
		
		public static void main(String[] args) {	
		
			
			int bInf, bSup, nb, x;
			char rep;
			
			System.out.println("\nAffichage desMULTIPLES");
			do {
				
				// saisir paramètres
				System.out.print("\tNombres divisibles par : ");
				nb = (new Scanner(System.in)).nextInt();
				
				System.out.print("\tLimite inférieure : ");
				bInf = (new Scanner(System.in)).nextInt();
				
				System.out.print("\tLimite supérieure : ");
				bSup = (new Scanner(System.in)).nextInt();
				
			System.out.println("\n\nAffichage des multiples de " + nb + " entre " + bInf + " et " + bSup + "\n");	
			
			//  Afficher multiples
			x = bInf;
			while (x <= bSup ) {
				if (x % nb == 0)
					System.out.print("\t(" + x++ + ")");
				else 
					System.out.println("\t(" + x++ );
				
				if ((x - bInf) % maxCol == 0) System.out.println();
				// maxCol caracteres affiches
				if ((x - bInf) % (maxCol + maxLigne) == 0) {
					
					
					System.out.println("\nAppuyez sur ENTREE ...");
					// maxLigne ligne affiches
					
					(new Scanner (System.in)).nextLine();
				
				}
														
			} // while
			// --------TESTER FIN
				
			do {
				
				System.out.print("\n\nVoulez-vous continuer (o/n) : ");
			rep = ((new Scanner (System.in)) .nextLine()).charAt(0);
			} while (rep != 'o' && rep != 'O' && rep != 'n' && rep != 'N');
			
			
			} while (rep == 'o' && rep == 'O');//
			
			}
	}
