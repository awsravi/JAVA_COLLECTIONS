package com.awsravi.colle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableArrayList {

	public static void main(String[] args) {

		List<String> originalList = new ArrayList<String>();

		originalList.add("ravi");
		originalList.add("dada");
		originalList.add("khaleel");
		originalList.add("madhu");
		// Original list

		System.out.println("Original list : "+originalList);

		// Create unmodifiableList

		List readOnlyList = Collections.unmodifiableList(originalList);

		System.out.println("Create unmodifiableList : "+readOnlyList);

		// Modification operations on readOnlyList throws UnsupportedOperationException

		try {
			readOnlyList.add("ravikumar");
			readOnlyList.add("syed dada");

		} catch (UnsupportedOperationException e) {
			System.out.println("Modification operations on readOnlyList throws UnsupportedOperationException : "+"we cant modify the readonlyList");
		}

		originalList.add("ravikumar");
		originalList.remove("dada");
		originalList.set(1, "syed dada");

		System.out.println("ReadOnlyList : " + readOnlyList);

		/*
		 * output
		 * 
		 * [ravi, dada, khaleel, madhu]
		 *  [ravi, dada, khaleel, madhu]
		 *   we cant modify the readonlyList 
		 *   ReadOnlyList : [ravi, syed dada, madhu, ravikumar]
		 * 
		 * 
		 * 
		 */

	}
}