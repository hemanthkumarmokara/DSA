// Java program to demonstrate working of HashTable
import java.util.*;

class Hashing1 {
	public static void main(String args[])
	{

		// Create a HashTable to store
		// String values corresponding to integer keys
		Hashtable<Integer, String>
			hm = new Hashtable<Integer, String>();

		// Input the values
		hm.put(1, "Hemanth");
		hm.put(12, "raja");
		hm.put(15, "neel");
		hm.put(3, "sukku");

		// Printing the Hashtable
		System.out.println(hm);
	}
}
