package producteg;

public class Product {
	private String id;
	private String name;
	private String maker;
	private int prince;
	private String date;
	
	public Product(String id, String name, String maker, int prince, String date) {
		super();
		this.id = id;
		this.name = name;
		this.maker = maker;
		this.prince = prince;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrince() {
		return prince;
	}

	public void setPrince(int prince) {
		this.prince = prince;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}

//Product p = new Product("101","canday");
//p.id = "book";  => p.setId("book")
//howm = p.prince; howm => p.getPrice()