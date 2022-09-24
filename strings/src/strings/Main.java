package strings;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String metin = "Karakteler bir araya gelerek dizi oluşturur";
		System.out.println("metin boytu = " + metin.length());
		System.out.println("metindeki 5. char eleman = " + metin.charAt(5));
		System.out.println(metin.concat(" eklemede bulunur"));
		System.out.println(metin.startsWith("y")); // başlangıç karakteri omu diye bakar
		System.out.println(metin.endsWith("r")); // son karakteri doğrumu diye bakar
		System.out.println(metin.indexOf("b")); // baştan itibaren ilk "b" bul
		System.out.println(metin.lastIndexOf("i")); // sondan başlayarak ilk "i" bul
		char[] parca = new char[10];
		metin.getChars(0, 10, parca, 0);
		System.out.println(parca);
		String yeniMesaj = metin.replace(' ', '/'); // seçilen karakteri diğer karakterle değiştirir
		System.out.println(yeniMesaj);
		System.out.println(metin.substring(3, 7)); // belirtilen sayılar arasındaki elemanları alır 3,4,5,6 .
													// 7 dahil değil

		for (String kelime : metin.split(" ")) { // " " boluk karakterleri arasında olan tüm karakterleri dödürür.
			System.out.println(kelime);
		}
		System.out.println(metin.toLowerCase()); // tüm harfleri küçük harfe dönüştürür.
		System.out.println(metin.toUpperCase()); // tüm harfleri büyük harfe dönüştürür.
		System.err.println(metin.trim()); // metinde ilk karaktere kadar ve son karakterden sonra olan boşlukları keser.

	}

}
