package com.multidimention.datatype;

import java.util.ArrayList;

public class MultiDimentionalArrayList {
	public static void main(String[] args) {

		ArrayList<ArrayList<String>> biDemArrList = new ArrayList<ArrayList<String>>();

		ArrayList<String> smallArrayList = new ArrayList<String>();
		smallArrayList.add("ruhul");
		smallArrayList.add("abedin");
		smallArrayList.add("madam");
		smallArrayList.add("islam");

		ArrayList<String> smallArrayList1 = new ArrayList<String>();
		smallArrayList1.add("ruhul-");
		smallArrayList1.add("abedin-");
		smallArrayList1.add("madam-");
		smallArrayList1.add("islam-");

		biDemArrList.add(smallArrayList);
		biDemArrList.add(smallArrayList1);

		System.out.println(biDemArrList.size());

		for (ArrayList<String> oneList : biDemArrList) {
			{
				for (String s : oneList) {
					System.out.println(s);
				}
			}
		}

	}
}
