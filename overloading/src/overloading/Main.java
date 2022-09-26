package overloading;

public class Main {

	public static void main(String[] args) {
		Islemler islemler = new Islemler();
		System.out.println(islemler.topla(3, 4));
		// alttakide aynı method ismini kullanır ama faklı method lardır aslında
		System.out.println(islemler.topla(4, 6, 7)); // ister sayısı ve ister türü faklı ile sarklı bir method dur.

	}

}
