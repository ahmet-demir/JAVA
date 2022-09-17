
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

	}

}
