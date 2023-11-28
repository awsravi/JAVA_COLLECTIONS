package com.awsravi.colle;

import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableMap {
	public static void main(String[] args) {
		Map<Integer, String> originalMap = new HashMap<Integer, String>();
		originalMap.put(1, "ravi");
		originalMap.put(2, "dada");
		originalMap.put(3, "khaleel");
		originalMap.put(4, "madhu");
		originalMap.put(5, "sunita");

		System.out.println(originalMap);

		// Creating read only view of the originalMap

		Map<Integer, String> readOnlyMap = Collections.unmodifiableMap(originalMap);
		// System.out.println(readOnlyMap);
		for (Map.Entry<Integer, String> entry : readOnlyMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// Modification operations on readOnlyMap throws UnsupportedOperationException

		try {
			readOnlyMap.put(6, "suniti");

			readOnlyMap.remove(2);
		} catch (UnsupportedOperationException e) {
			System.out.println("Modifications to read only map are not allowed");
		}

		// Modification operations on originalMap are reflected in readOnlyMap also

		originalMap.put(6, "suniti");

		originalMap.remove(2);

		// System.out.println("originalMap : " + originalMap);
		for (Map.Entry<Integer, String> entry : originalMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		// output
		/*
		 * {1=ravi, 2=dada, 3=khaleel, 4=madhu, 5=sunita}
		 *  1: ravi 2: dada 3: khaleel 4:madhu 5: sunita 
		 *  Modifications to read only map are not allowed
		 *  1: ravi 3:khaleel 4: madhu 5: sunita 6: suniti
		 * 
		 * 
		 * 
		 */

	}
}
