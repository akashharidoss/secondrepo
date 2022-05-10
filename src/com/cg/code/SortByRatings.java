package com.cg.code;

import java.util.Comparator;

public class SortByRatings implements Comparator<Product>{
	Public int compare(Product1,Product2) {
		if(p1.getRatings()<p2.getRatings())
			return 1;
		else
			return -1;
	}
}
