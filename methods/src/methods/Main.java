package methods;

public class Main {

	public static void main(String[] args) {
		String metin = "demir";
		girdi(metin);
		sayı();
		System.out.println(sayı());
		int toplam = topla(2, 3, 5, 6, 1, 8); // içerisine gönderilen tüm int değerleri toplar
		System.out.println(toplam);
	}

	public static void girdi(String girdi) {
		System.out.println("giriş yapıldı " + girdi);
	}

	public static void cıktı() {
		System.out.println("bulunanlar");
	}

	public static String sayı() {
		String n = "boş ";
		return n;
	}

	public static int topla(int... degerler) {
		int toplam = 0;
		for (int sayı : degerler) {
			toplam = toplam + sayı;
		}
		return toplam;
	}

}
