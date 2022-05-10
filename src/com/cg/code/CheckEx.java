package com.cg.code;

import java.util.ArrayList;
import java.util.Collections;

public class CheckEx {
	public static void main(String[] args) {
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Akash");
		list2.add("Dhoni");
		list2.add("Virat");
		list2.add("Raina");
		System.out.println("----------");
		for(String s:list2) {
			System.out.println(s);
		}
		System.out.println("--------");
		String name=list2.get(0);
		System.out.println(name);
		
		collections.sort(list1);
		System.out.println("---After sorted---");
		System.out.println(list1);
		Collections.sort(list2);
		System.out.println("after sorting the names");
		System.out.println(list2);
	}
}
