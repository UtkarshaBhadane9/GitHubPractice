package com.collections.ArrayListEx;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {

		// ArrayList<Integer> ar1 = new ArrayList<Integer>();

		ArrayList<Object> ar = new ArrayList<Object>();

		ar.add(35.4);
		ar.add(new String("Pune"));
		ar.add('R');
		ar.add(null);
		ar.add(new Integer(55));
		ar.add(null);
		ar.add("Pune");
		ar.add(new Byte((byte) 10));
		ar.add(new ArrayListEx1());
		System.out.println(ar);
		System.out.println("size = " + ar.size());
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}

}
