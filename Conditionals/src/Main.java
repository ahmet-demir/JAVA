
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number0 = 0;
		int number1 = 14;
		String esit = "eşittir";
		String buyuk = "büyüktür";
		String kucuk = "küçüktür";
		if (number1 == number0) {
			System.out.println(esit);
		} else if (number1 > number0) {

			System.out.println(buyuk);
		} else {
			System.out.println(kucuk);
		}
		int sayi1 = 23;
		int sayi2 = 423;
		int sayi3 = 122;
		int byk = sayi1;
		if (byk < sayi2) {
			byk = sayi2;
		}
		if (byk < sayi3) {
			byk = sayi3;
		}
		System.out.println(byk);
		char girdi = 'A'; // girdi dışarıdan alınan bir veri olacak şimdilik sabit
		switch (girdi) {
		case 'A':
			System.out.println(girdi);
			break;
		case 'B':
			System.out.println(girdi);
			break;
		case 'C':
			System.out.println(girdi);
			break;
		case 'E':
			System.out.println(girdi);
			break;
		case 'D':
			System.out.println(girdi);
			break;
		default:
			System.out.println("tanımsız");
			break;
		}
		for (int i = 5; i <= sayi1; i++) {
			System.out.println(i);
		}
		int[] Array = new int[10];
		System.out.println(Array.length);
		for (int a = 0; a < Array.length; a++) { // şart doğruysa birkere çalışıp sonra artıtıyor
			Array[a] = a;
			System.out.println(Array[a]);
		}
		System.out.println(Array[5]);
		do {
			sayi1 = sayi1 - 1;
			System.out.println(sayi1);
			

		} while (sayi1 >= 22);
		int d = 0 ;
		int t = 10 ;
		while (t > d) {
			System.out.println(d);
			d++;
		}
	}

}
