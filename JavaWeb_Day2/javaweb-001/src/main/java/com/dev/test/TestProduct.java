package com.dev.test;

import java.util.ArrayList;

public class TestProduct {
	private String imageProduct;
	private String nameProduct;
	private int year;
	
	

	public TestProduct(String imageProduct, String nameProduct, int year) {
		super();
		this.imageProduct = imageProduct;
		this.nameProduct = nameProduct;
		this.year = year;
	}

	public String getImageProduct() {
		return imageProduct;
	}

	public void setImageProduct(String imageProduct) {
		this.imageProduct = imageProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static ArrayList<TestProduct> getListMacpro() {
		ArrayList<TestProduct> macPro = new ArrayList<TestProduct>();

		macPro.add(new TestProduct("/img/macpro2019a.jpg", "Macbook Pro 2019", 2019));
		macPro.add(new TestProduct("/img/macpro2018.jpg", "Macbook Pro 2018", 2018));
		macPro.add(new TestProduct("/img/macpro2017.jpg", "Macbook Pro 2017", 2017));
		macPro.add(new TestProduct("/img/macpro2016.jpg", "Macbook Pro 2016", 2016));
		macPro.add(new TestProduct("/img/macpro2015.jpg", "Macbook Pro 2015", 2015));
		macPro.add(new TestProduct("/img/macpro2013.jpg", "Macbook Pro 2013", 2013));
		macPro.add(new TestProduct("/img/macpro2012.jpg", "Macbook Pro 2012", 2012));
		macPro.add(new TestProduct("/img/macpro2011.jpg", "Macbook Pro 2011", 2011));

		return macPro;
	}

	public static ArrayList<TestProduct> getListMacair() {
		ArrayList<TestProduct> macAir = new ArrayList<TestProduct>();

		macAir.add(new TestProduct("/img/macbookair2018.jpg", "Macbook Air 2018", 2018));
		macAir.add(new TestProduct("/img/macbookair2017.jpg", "Macbook Air 2017", 2017));
		macAir.add(new TestProduct("/img/macbookair2016.jpg", "Macbook Air 2016", 2016));
		macAir.add(new TestProduct("/img/macbookair2015.jpg", "Macbook Air 2015", 2015));
		macAir.add(new TestProduct("/img/macbookair2014.jpg", "Macbook Air 2014", 2014));
		macAir.add(new TestProduct("/img/macbookair2013.jpg", "Macbook Air 2013", 2013));
		macAir.add(new TestProduct("/img/macbookair2012.jpg", "Macbook Air 2012", 2012));
		macAir.add(new TestProduct("/img/macbookair2011.jpg", "Macbook Air 2011", 2011));

		return macAir;
	}

	public static ArrayList<TestProduct> getListImac() {
		ArrayList<TestProduct> iMac = new ArrayList<TestProduct>();

		iMac.add(new TestProduct("/img/imac2019.jpg", "iMac 2019", 2019));
		iMac.add(new TestProduct("/img/imac2018.jpg", "iMac 2018", 2018));
		iMac.add(new TestProduct("/img/imac2017.jpg", "iMac 2017", 2017));
		iMac.add(new TestProduct("/img/imac2015.jpg", "iMac 2015", 2015));
		iMac.add(new TestProduct("/img/imac2013.jpg", "iMac 2013", 2013));
		iMac.add(new TestProduct("/img/imac2011.jpg", "iMac 2011", 2011));

		return iMac;
	}
}
