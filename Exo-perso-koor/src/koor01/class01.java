package koor01;

public class class01 {

	public class Mathematiques {

		public static int mini(int a, int b) {
			return a < b ? a : b;
		}

		public static int maxi(int a, int b) {
			return a > b ? a : b;
		}

	}

	public static void main(String[] args) {

		System.out.println("mini( 3, 5 ) == " + Mathematiques.mini(3, 5));
		System.out.println("mini( 11, 5 ) == " + Mathematiques.mini(11, 5));
		System.out.println("maxi( 3, 5 ) == " + Mathematiques.maxi(3, 5));

	}

}
