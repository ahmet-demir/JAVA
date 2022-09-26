package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		//OgretmenKredi ogretmenKredi = new OgretmenKredi();
		//ogretmenKredi.Hespla();
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new OgretmenKredi()); // KrediUI BaseKredi bekliyor.
		// OretmenKredi içerisinde de BaseKredi var olduğundan KrediHesapla Çalışacaktır.
	}

}
