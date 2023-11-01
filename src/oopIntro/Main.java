package oopIntro;

public class Main {

	public static void main(String[] args) {
	  Product product1 = new Product(1,"Lenovo V14",15000,"16 Gm Ram",10);   // referans oluþturma
                                                                          // constructor
	  Product product2 = new Product(); 
	  product2.setName("Lenovo V15");
	  product2.setId(2);
	  product2.setDetails("16 GM Ram");
	  product2.setDiscount(10);
	  product2.setUnitPrice(16000);
	  
	  System.out.println("Ýndirimden sonraki fiyat: " +product2.getUnitPriceAfterDiscount());
	 /*product2.id= 2 ;
	  product2.name = "Lenovo V15";         // ürün nesnesini olþturduk
	  product2.unitPrice = 16000;
	  product2.details = "32 GM Ram";*/
	/*
	 /*
	  Product product3 = new Product();   
	
	Product[] products = {product1,product2,product3};
	      // veri tipi
	for (Product product : products) {
		System.out.println(product.name);
	} 
	System.out.println("Ürün sayýsý:" + products.length);

	 ProductManager aa = new ProductManager();
		aa.addToCart(product3);   // productýn bellek adresini göndermiþ olduk
		aa.addToCart(product2);
		aa.addToCart(product1);*/
		
	Category category1 = new Category();
	category1.setId(1);
	category1.setName("Ýçeçek");
	
	Category category2 = new Category();
	category2.setId(2);
	category2.setName("Yiyecek");
	
	System.out.println(category1.getName());
	System.out.println(category2.getName());
	
	}
	
	
	
	
	
	}
