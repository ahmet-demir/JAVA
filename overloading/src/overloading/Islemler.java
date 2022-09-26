package overloading;

public class Islemler {

	public int topla(int number1, int number2) {
		int toplam = number1 + number2;
		return toplam;
	}

	public int topla(int number1, int number2, int number3) { // tek fark isterler kısmının faklı olması
		int toplam = number1 + number2 + number3;
		return toplam;
	} // bu şekilde aynı isimle birden fazla method yazılabilir ve overloading
		// yapılmış olur.
}
