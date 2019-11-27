package com.dev.test;

import java.util.ArrayList;

public class DetailsProduct {
	private String image;
	private String name;
	private int year;
	private double price;

	public DetailsProduct(String image, String name, int year, double price) {
		super();
		this.image = image;
		this.name = name;
		this.year = year;
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static ArrayList<DetailsProduct> getListMacPro() {
		ArrayList<DetailsProduct> macPro = new ArrayList<DetailsProduct>();
		// 2019
		macPro.add(new DetailsProduct("/img/macPro/2019_1.png",
				"MV972 / MV9A2 - Macbook Pro 13 inch 2019 - i5 2.4/8GB/512GB - Newseal Handed", 2019,
				48900000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2019_2.png",
				"MV972 / MV9A2 - Macbook Pro 13 inch 2019 - i5 2.4/8GB/512GB - Newseal Genuine", 2019,
				51500000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2019_3.png",
				"MV962 / MV992 - Macbook Pro 13 inch 2019 - i5 2.4/8GB/256GB - Newseal Handed", 2019,
				42300000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2019_4.png",
				"MV962 / MV992 - Macbook Pro 13 inch 2019 - i5 2.4/8GB/256GB - Newseal Genuine", 2019,
				44000000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2019_5.png",
				"MV912 / MV932 - Macbook Pro 15 inch 2019 - i9 2.3/16GB/512GB - Newseal Handed", 2019,
				59800000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2019_6.png",
				"MV912 / MV932 - Macbook Pro 15 inch 2019 - i9 2.3/16GB/512GB - Newseal Genuine", 2019,
				69500000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2019_7.png",
				"MV902 / MV922 - Macbook Pro 15 inch 2019 - i7 2.6/16GB/256GB - Newseal Handed", 2019,
				53890000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2019_8.png",
				"MV902 / MV922 - Macbook Pro 15 inch 2019 - i7 2.6/16GB/256GB - Newseal Genuine", 2019,
				57000000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2019_9.png",
				"MUHP2 / MUHR2 - Macbook Pro 13 inch 2019 - i5 1.4/8GB/256GB - Newseal Handed", 2019,
				37800000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2019_10.png",
				"MUHP2 / MUHR2 - Macbook Pro 13 inch 2019 - i5 1.4/8GB/256GB - Newseal Genuine", 2019,
				39000000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2019_11.png",
				"MUHN2 / MUHQ2 - Macbook Pro 13 inch 2019 - i5 1.4/8GB/128GB - Newseal Handed", 2019,
				32500000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2019_12.png",
				"MUHN2 / MUHQ2 - Macbook Pro 13 inch 2019 - i5 1.4/8GB/128GB - Newseal Genuine", 2019,
				34000000 / 23000));
		// 2018
		macPro.add(new DetailsProduct("/img/macPro/2018_1.png",
				"MR9V2 - Macbook Pro 13 inch Touch Bar 2018 - SSD 512 - Sliver", 2018, 43800000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2018_2.png",
				"MR9U2 - Macbook Pro 13 inch Touch Bar 2018 - SSD 256 - Sliver", 2018, 40000000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2018_3.png",
				"MR9R2 - Macbook Pro 13 inch Touch Bar 2018 - SSD 512 - Space Grey", 2018, 43800000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2018_4.png",
				"MR9Q2 - Macbook Pro 13 inch Touch Bar 2018 - SSD 256 - Space Grey", 2018, 40000000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2018_5.png",
				"MR972 - Macbook Pro 15 inch Touch Bar 2018 - SSD 512 - Sliver", 2018, 57090000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2018_6.png",
				"MR972 - Macbook Pro 15 inch Touch Bar 2018 - i9 - 512 GB - Sliver", 2018, 62000000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2018_7.png",
				"MR962 - Macbook Pro 15 inch Touch Bar 2018 - SSD 256 - Sliver", 2018, 51500000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2018_8.png",
				"MR942 - Macbook Pro 15 inch Touch Bar 2018 - SSD 512 - Space Grey", 2018, 57090000 / 23000));
		macPro.add(new DetailsProduct("/img/macPro/2018_9.png",
				"MR932 - Macbook Pro 15 inch Touch Bar 2018 - SSD 256 - Space Grey", 2018, 51500000 / 23000));
		return macPro;
	}
}
