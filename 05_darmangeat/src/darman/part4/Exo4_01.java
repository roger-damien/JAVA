package darman.part4;

public class Exo4_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int toto = 1;
		int tutu = 2;
//		String tata = "OK";
		String tata = "OIK";

		if (!(tutu > (toto + 4)) & tata == "OK") {
			tutu += 1;
			System.out.println("tutu += 1");
		} else {
			tutu -= 1;
			System.out.println("tutu -= 1");
		}
	}

}
//Si Tutu <= Toto + 4 ET Tata <> "OK" Alors
//Tutu ← Tutu - 1
//Sinon
//Tutu ← Tutu + 1
//Finsi