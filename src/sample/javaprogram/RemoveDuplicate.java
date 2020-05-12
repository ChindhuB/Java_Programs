package sample.javaprogram;

import java.util.HashSet;

public class RemoveDuplicate {
	static String arr[];
	static String dupelem[];

//get Duplicate element and Remove 
	public static void getDuplicate(String duparr[]) {
		arr = duparr;
		int j = 0;
		int len = arr.length;
		dupelem = new String[len];
		// HashSet used to identify duplicate elements in Array
		HashSet<String> arrhash = new HashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			if (!(arrhash.add(arr[i]))) {
				dupelem[j] = arr[i];
				arr[i] = null;
				j++;
			}
		}

	}

//Display duplicate elements stored in another Array
	public static void displayDupelem() {
		System.out.println("Elements Repeated in Array:");
		for (String i :dupelem ) {
			if(i!=null)
			System.out.print(i + " ");
		}
	}

//Display Array after removal
	public static void displayArray() {
		System.out.println("Array after removing duplicate elements :");
		for (String i : arr) {
			
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		getDuplicate(new String[] { "21455", "3687", "21455", "4567", "3345", "24565", "71244", "3687" });
		displayArray();
		System.out.println();
		displayDupelem();

	}

}
