package tekrarEdenKarakterleriBulma;

public class Main {
	//girilen metinin içerisindeki karakterleri sayar
	public static void main(String[] args) {

		String text = "yazıa yazmanın kuralları vardır virgül eleman gibi"; // girilen metin
		int length = text.length();
		char text1[] = new char[length];
		char text2[][] = new char[length][length];
		char harf[] = new char[29];
		int j = 0;
		
		for (int i = 0; length > i; i++) {     //text1 char array '-' le doldurur
			text1[i] = '-';
		}
		for (int i = 0; length > i; i++) {		//text1 char array boşlukları silerek yerleştirir

			if (text.charAt(i) != ' ') {
				text1[j] = text.charAt(i);
				j++;
			}

		}

		//System.out.println(text1);
		int m = 0;
		for (int i = 0; length > i; i++) {		// text1 içerisindeki karakterleri bulur ve harf char array'e yerleştirir

			if (varmı(text1[i], harf)) {

			} else {
				harf[m] = text1[i];
				m++;
			}
		}
		//System.out.println(harf);
		karakterbul(text1, harf);    // karakterleri sayar

		matrisYazdier(text2);  	// matris ekrana yazdırır
	}

	private static void matrisYazdier(char[][] text) {

		for (int i = 0; i < text.length; i++) // matris.length = satir sayisi
		{
			for (int j = 0; j < text[0].length; j++) { // matris[0].length=sutun sayisi
				System.out.print(text[i][j] + "\t");
			}
			System.out.println();
		}

	}

	private static boolean varmı(char varmı, char[] text) {
		for (char i : text) {
			if (i == varmı) {
				return true;
			}

		}
		return false;
	}

	private static void karakterbul(char[] text, char[] ara) {
		char[][] bulunan = new char[ara.length][2];		
		int say = 0;
		for (int i = 0; ara.length > i; i++) {
			if(ara[i]=='-') break;
			bulunan[i][0] = ara[i];
			//System.out.println("harf tarama = ");
			
			
			for (int j = 0; text.length > j; j++) {
				if (ara[i] == text[j]) {
					say++;
				} else {
				}
			}
			//System.out.println(ara[i]);
			//System.out.println(say);
			bulunan[i][1]=(char)(say+'0');  // sayı 9 dan büyük gelirse hatalı karakter gönderiyor
			say = 0;
		}
		matrisYazdier(bulunan);
	}
}
