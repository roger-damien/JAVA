/* Importation des dépendances */
import static java.lang.System.out;
import java.util.Scanner;

/* Déclaration de la classe principale de l’application */
public class Version1
{
/* Déclaration de la méthode point d’entrée de l’application*/
public static void main(String [] args)
{
    Scanner sc = new Scanner(System.in);
    String nom, prenom, rue, ville, codePostal, carteFnte;
   char rep ='o';

   do { // SAISIE
    System.out.println ("Nom du cavalier\t: ");
    nom = sc.nextLine();
    System.out.println ("Prénom du cavalier\t: ");
    prenom = sc.nextLine();
    System.out.println ("Saisissez votre Adresse :\t: ");
    System.out.println ("N° de rue et rue :\t: ");
    rue = sc.nextLine();
    System.out.println ("Ville :\t: ");
    ville = sc.nextLine();
    System.out.println ("Code Postal :\t: ");
    codePostal = sc.nextLine();
    System.out.println ("N° de carte FNTE\t: ");
    carteFnte = sc.nextLine();

   // BOUCLE 3 CHEVAUX PREFERES 
int i = 0;

String[] chevalPrefere;
chevalPrefere = new String[4];

    for (i=1; i<chevalPrefere.length; i++)
    {
        System.out.println ("Cheval Préféré n°" + i + "\t:");
    chevalPrefere[i] = sc.nextLine();
    }

    // PRESENTATION
    System.out.println ("\n\nCavalier : ");
    System.out.println ("\n" + "Cavalier n° : "  + carteFnte + "\n" + nom + " " + prenom + "\n" + rue + " " + codePostal + " " + ville + "\n" + "Chevaux : "  + chevalPrefere[0] + " " + chevalPrefere[1] + " " + chevalPrefere[2]);


    // MESSAGE DE FIN
   System.out.println ("\n\nVoulez-vous continuer (O/N) ?");
   rep = sc.nextLine().charAt(0);
} 

 //tant que la réponse n'est pas O ou N, on repose la question
 while (rep != 'o' && rep != 'n');
 {
    
     System.out.println("\n\nAu revoir !");
    
     
 }
sc.close();
}
}