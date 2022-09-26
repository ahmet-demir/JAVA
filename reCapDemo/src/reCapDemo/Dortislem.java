package reCapDemo;

public class Dortislem {

	public int Topla(int number, int number2) {
		int toplam = 0;

		toplam = number + number2;

		return toplam;
	}

	public int Cikar(int number, int number2) {
		int cikan = 0;
		cikan = number - number2;
		return cikan;
	}

	public int Carp(int number, int number2) {
		int carpim = 0;
		carpim = number * number2;
		return carpim;
	}

	public int Bol(int number, int number2) {
		int bolum = 0;
		if (number == 0 || number2 == 0) {
			return bolum;
		}
		bolum = number / number2;
		return bolum;
	}
}
