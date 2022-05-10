package com.cg.code;

import java.util.Collections;

public class SortingCollectionsEx {
	public static void main(String[] args) {
		ArrayList<Product> prodlist=new ArrayList<Product>();
		
		Product p1=new Product(100,"Dhoni,500,3);
		Product p2=new Product(200,"Ramesh",600,2);
		Product p3=new Product(300,"Alexa",450,5);
		Product p4=new product(400,"Watch",7500,5);
		Product p5=new Product(500,"Clothes",10000,4);
		
		prodlist.add(p1);
		prodlist.add(p2);
		prodlist.add(p3);
		prodlist.add(p4);
		prodlist.add(p5);
		
		for(Product p:prodList)
		{
			System.out.println(p);
		}
		Colections.sort(prodList);
		System.out.println("----Sorting the ProductList---");
		for(product p:prodlist)
		{
			System.out.println(p);
		}
		System.out.println("***********");
		sortByRatings sortByRatings=new SortByRatings();
		Collections.sort(prodList,sortByRatings);
		System.out.println("---sorted by Ratings High to Low---");
		for(Product p:prodList) {
			System.out.println(p);
		}
		sortByname sortName=new SortByName();
		Collections.sort(prodList,sortname);
		System.out.println("---sorted based on names");
		for(Product p:prodList) {
			System.out.println(p);
		}
	}
}
