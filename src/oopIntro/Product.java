package oopIntro;

public class Product {
	private int id ; // tc kimlik no gibi ,ki�ileri ay�rmak i�in
	private String name;      // ad�
	private double unitPrice; // birim fiyat�
	private String details ;// a��klamalar�
	private double discount; // indirim
	private double unitPriceAfterDiscount;  //indirimden sonraki fiyat
	
	public Product() {
	}
	public Product (int id,String name,double unitPrice,String details,
			double discount) {
		this();   // default constructoru �ag�rmak i�in
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.details=details;
		this.discount=discount;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice*this.discount / 100);
	}

	
	}


