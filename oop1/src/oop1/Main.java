package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
//		product1.name = " Kıyma Makinesi ";
//		product1.unitPrice = 11500;
//		product1.discount = 8;
//		product1.unitsInStock = 157;
//		product1.imageUrl = "resim.jpg";

		// System.out.println(product1.name);

		product1.setName("Kıyma Makinesi");
		product1.setDiscount(8);
		product1.setUnitPrice(11500);
		product1.setUnitsInStock(157);
		product1.setImageUrl("resim1.jpg");

		Product product2 = new Product();
//		product2.name = " Kurutma Makinesi ";
//		product2.unitPrice = 1500;
//		product2.discount = 9;
//		product2.unitsInStock = 17;
//		product2.imageUrl = "resim2.jpg";

		product2.setName("Kurutma Makinesi");
		product2.setDiscount(9);
		product2.setUnitPrice(1500);
		product2.setUnitsInStock(17);
		product2.setImageUrl("resim2.jpg");

		Product product3 = new Product();
//		product3.name = " Çamaşır Makinesi ";
//		product3.unitPrice = 22500;
//		product3.discount = 10;
//		product3.unitsInStock = 57;
//		product3.imageUrl = "resim3.jpg";

		product3.setName("Çamaşır Makinesi");
		product3.setDiscount(10);
		product3.setUnitPrice(22500);
		product3.setUnitsInStock(57);
		product3.setImageUrl("resim3.jpg");

		Product[] products = { product1, product2, product3 };
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer() ;
		individualCustomer.setCustomerNumber("12");
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("059766666661");
		individualCustomer.setFirstName("ahmet");
		individualCustomer.setLastName("DEMİR");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCompanyName("DEMİRON GAME");
		corporateCustomer.setCompanyId("12");
		corporateCustomer.setPhoneNumber("08504458512");
		corporateCustomer.setTaxNumber("123456");
		corporateCustomer.setCustomerNumber("45");
		
		Customer[] customer = {corporateCustomer,individualCustomer};
		
		for (Customer ccustomer : customer ) {
			System.out.println("Müşteri numaraları = " + ccustomer.getCustomerNumber());
		}
		
	}

}
