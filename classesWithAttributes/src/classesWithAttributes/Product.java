package classesWithAttributes;

public class Product {
	public Product(int _Id, String _name, String _description, double _price, int _stoc, String _renk) { 
		this._Id = _Id;
		this._name = _name;
		this._description = _description; 
		this._price = _price;
		this._stock = _stoc;
		this._renk = _renk;
		// method da olduğu gibi Product çalışması içinde değer verilmesini zorunlu
		// tutulabilir.
		System.out.println("Product çalıştı"); // constructor new olduğunda ilk çalışan yerdir
	}

	public Product() {
		// isteyen get ve set yazarek kullansın isteyen yukarıdaki gibi kullansın
		// overloading denir
	}

	private int _Id;
	private String _name;
	private String _description;
	private double _price; // fields yazarken "_vjbdfjvbdflkv" şeklinde olmalıdır yada this.lknbkldfn
							// olarak yazılabilir.
	private int _stock;
	private String _kod;
	private String _renk;

	// private olan değerleri get ve set edebiliriz.
	public int get_Id() {
		return _Id;
	}

	public void set_Id(int _Id) {
		this._Id = _Id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_stock() {
		return _stock;
	}

	public void set_stock(int _stock) {
		this._stock = _stock;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String _renk) {
		this._renk = _renk;
	}

	public String get_kod() {
		_kod = _name.substring(0, 1) + _Id;
		return _kod;
	}

}
