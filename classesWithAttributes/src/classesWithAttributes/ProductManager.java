package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) { // Add ekle demek
														// get olarak çağılmalı
		System.out.println("Ekleme başarılı " + product.get_name());
		// product class da girilen bilgilerin veri tabanına kaydını yapan yer burası
		// olacak
		// Main de çalıştığında product nesnesindeki bilgileri işleyecek
	}

}
