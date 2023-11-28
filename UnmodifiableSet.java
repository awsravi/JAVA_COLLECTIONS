package com.awsravi.colle;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnmodifiableSet {
	public static void main(String[] args) {
		Set<String> originalSet = new HashSet<String>();

		originalSet.add("ravi");
		originalSet.add("dada");
		originalSet.add("khaleel");
		originalSet.add("madhu");
		originalSet.add("viswanath");
		System.out.println(originalSet);

		// Creating read only view of the originalSet

		Set<String> readOnlySet = Collections.unmodifiableSet(originalSet);

		System.out.println("Creating readOnlySet : " + readOnlySet);
		
		//Modification operations on READONLYSET throws UnsupportedOperationException
        try {
        	readOnlySet.add("syed");
        	readOnlySet.remove("khaleel");
        }catch (UnsupportedOperationException e) {
			System.out.println("Trying to modify : Get Exception");
		}
		
      //Modification operations on ORIGINALSET are reflected in readOnlySet also
        
        originalSet.add("khaleel basha");
         
        originalSet.remove("khaleel");
		
		System.out.println("originalSet : "+originalSet);
		//output
		/*[madhu, dada, ravi, khaleel, viswanath]
		Creating readOnlySet : [madhu, dada, ravi, khaleel, viswanath]
		Trying to modify : Get Exception
		originalSet : [madhu, dada, khaleel basha, ravi, viswanath]
		 */
		
	}
}
