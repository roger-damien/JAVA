import java.util.Scanner;



public class Exo_08 {

	static final int maxCol = 8;
	static final int maxLigne = 10;
	static int bInf, bSup, nb, x;
	static String rep = "";
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		do {
			
			SaisirParametres();
			AfficherMultiples();
			Visualiser();

		} while (rep.equalsIgnoreCase("o"));
	}



////////////////////	METHODE VISUALISER ()

	public static String Visualiser() {
		// String rep = "";

		do {
			
			System.out.print("\n\nVoulez-vous continuer (o/n) : ");
			rep = scanner.nextLine();
			
			if (rep.equalsIgnoreCase("o")) {
				System.out.println("Youpi on continue");
				break;
				
			} else if (rep.equalsIgnoreCase("n")) {
				
				System.out.println("On arrete");
				break;
				
			}
			

		} while (!rep.equalsIgnoreCase("o") || !rep.equalsIgnoreCase("n"));
		
		return rep;
		

	}

//////////////////// METHODE Saisir Paramètres ()		

	public static void SaisirParametres() {

		System.out.println("\nSaisissez les paramètres ");

			// saisir paramètres
			System.out.print("\tNombres divisibles par : ");
			nb = scanner.nextInt();

			System.out.print("\tLimite inférieure : ");
			bInf = scanner.nextInt();

			System.out.print("\tLimite supérieure : ");
			bSup = scanner.nextInt();
			System.out.println("\n\nAffichage des multiples de " + nb + " entre " + bInf + " et " + bSup + "\n");
			scanner.nextLine();
	}

		
////////////////////	METHODE Affichage des MULTIPLES	()

	public static void AfficherMultiples() {

		x = bInf;
		while (x <= bSup) {
			if (x % nb == 0)
				System.out.print("\t(" + x++ + ")");
			else
				System.out.println("\t(" + x++);

			if ((x - bInf) % maxCol == 0)
				System.out.println();
			// maxCol caracteres affiches
			if ((x - bInf) % (maxCol + maxLigne) == 0) {

				Obtenir();

			}
		}
	}

////////////////////	METHODE Obtenir ()

	public static void Obtenir() {
		System.out.println("\nAppuyez sur ENTREE ...");
		// maxLigne ligne affiches

		(new Scanner(System.in)).nextLine();

	}

}
