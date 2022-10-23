public class Exo_06 {

	public static void main(String[] args) {

		int Colonne = 4;
		int nb = 1;

		String a = "Car";
		String b = "Hex";
		String c = "Dec";

		// String str = String.format( "%d - %s", nb, a ); // %d pour un entier en base
		// décimale ;%s pour un string...

		System.out.printf("%3s %5s %5s %11s %5s %5s %11s %5s %5s %11s %5s %5s \n\n", a, b, c, a, b, c, a, b, c, a, b,
				c);

		for (int i = 0; i < 128; i++) {

			if (Character.isJavaIdentifierPart(i)) {
				System.out.printf("'%1c' %5h %5d \t", i, i, i);

				if (nb == Colonne) {
					System.out.printf("\r");
					nb = 0;
				}
				nb++;
			}

			// Solution Boris avec modulo

//		for (int i = 0; i < 128; i++) {
//
//			if (Character.isJavaIdentifierPart(i)) {
//
//				if (nb % Colonne != 0) { // si le modulo est différent de 0
//					System.out.printf("\t\t"); // on ajoute 2 tab
//				}
//
//				System.out.printf("'%c' %5h %5d", i, i, i);
//				nb++;
//
//				if (nb % Colonne == 0) { // si le modulo est égal à 0
//					System.out.printf("\r"); // on passe à la ligne
//				}
//
//			}
			// Fin Solution Boris avec modulo

		}
	}
}