package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update(); // reference type .

		// value type
		int sayı = 10;
		int sayı2 = 20;
		sayı2=sayı;				// sayı2 artık sayı birin değerinde.
		sayı=40;				// sayı yeni değeri 40 oldu
		System.out.println(sayı2); // sayı2 10 olarak kaldı reference olmadığı için değeri ne verilirse o kalır.
		
		
		// reference sample
		int[] sayılar1 = new int[] { 1, 2, 3 };
		int[] sayılar2 = new int[] { 4, 5, 6 };
		System.out.println(sayılar2[0]); // saylar2 nesnesinin adresi sayılar2 de oyuzden ilk eleman 4
		sayılar2 = sayılar1;
		System.out.println(sayılar2[0]); // sayılar2 nesnesinin adresi artık sayılar1'de yani sayılar1'in dizisine
											// iki farklı isimden ulaşılıyor artık
		sayılar1[0] = 35;
		System.out.println(sayılar2[0]); // sayılar2 ve sayılar1 aynı nesnenin iki farklı adı olduğu için bir eleman
											// değişirse ikisindede aslında aynı eleman değişmiş olur.
		System.out.println(sayılar1[0]);
		System.err.println(sayılar2[0]); // iki side aynı nesnenin farklı isimleri
											// {4,5,6} artık bellekte çöp durumuna geldi kullanılmayan bir nesne oldu.
	}
}
