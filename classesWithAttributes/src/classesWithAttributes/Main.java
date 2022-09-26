package classesWithAttributes;

public class Main {
	public static void main(String[] args) {

		 Product product = new Product(); 

		 product.set_name("laptop");
		 product.set_Id(123);
		 product.set_stock(54); // set ederek değer veriyoruz
		
		// artık Product oluşturuken içerisine dğrudan göndererk set edilebilir
		//Product product = new Product(123,"Laptop","bişey",1548,54,"sarı"); // bu şekilde set etmeden daha Product Classını cağırırken değerlerini gönderdik
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product); // yukarıda formunu doldurduğumuz product nesnesini ProductManager class sından
										// aldımız productManager içerisine yolluyoruz orada işlenip kayıt eilecek
		System.out.println(product.get_kod());

	}
}
