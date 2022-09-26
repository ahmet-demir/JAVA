
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int listeUzunlugu = 6;

		String[] PazarListe = new String[listeUzunlugu];
		PazarListe[0] = "ekmek";
		PazarListe[1] = "tuz";
		PazarListe[3] = "biber";
		PazarListe[4] = "domates";
		PazarListe[5] = "kıyma";
		PazarListe[2] = "patates";

		for (int i = 0; i < PazarListe.length; i++) {
			System.out.println(PazarListe[i]);
		}
		for (String liste : PazarListe) {
			System.out.println(liste);
		}
		String[] dolap = { "yumurta", "salça", "çikolata", "sarımsak", "patates", "biber" };
		for (String liste : dolap) {
			System.out.println(liste);
		}
		for (String Dliste : dolap) {
			for (String Pliste : PazarListe) {
				if (Pliste == Dliste) {
					System.out.println("zatenvar = " + Dliste);
				}
			}
		}

		// Multi Dimensional Arrays
		int[][] mtrx = new int[4][4];
		int[] eleman = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
		int k = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(k);
				mtrx[i][j] = eleman[k];
				k++;
				System.out.println("mtrx = " + mtrx[i][j]);
			}
		}
	}
}
