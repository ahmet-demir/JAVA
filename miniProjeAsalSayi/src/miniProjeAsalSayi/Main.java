package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {

		int number = 2000;

		// int remainder = number %2; // 2 e bölümünden kalan rakamı verir.
		// System.out.println(remainder);

		// örnek verilen sayının asal olup olmadığını belirle.

		int tamBolunen = 0;
		int[] tamBolunenSayilar = new int[1000];
		for (int i = 2; i <= number / 2; i++) {

			int sayi = number % i;

			if (0 == sayi) {

				tamBolunenSayilar[tamBolunen] = i;
				tamBolunen++;

			}

		}

		if (tamBolunen > 0) {
			for (int i : tamBolunenSayilar) {

				if (i == 0) {
					System.out.println("Bulunan bölen sayı sayısı = " + tamBolunen);
					break;
				}
				System.out.println("saı asal değil, bölündüğü sayılar = " + i);
			}
		} else if (tamBolunen == 0) {
			System.out.println("asal sayıdır");
		}

	}

}
