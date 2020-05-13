package sample.javaprogram;

import java.util.Arrays;

public class BinarySearch {
	static int binSer;
	static int arr[];
	static int num;
//Comments added
	public static void binSearch(int serarr[], int binnum) {
		arr = serarr;
		num=binnum;
		Arrays.sort(arr);
		try {
			binSer = Arrays.binarySearch(arr, binnum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void resultDisplay() {
		if (binSer >= 0) {
			System.out.println(" Number " + arr[binSer] + " is present in the Array provided");
		} else {
			System.out.println(" Number " + num + " is not present in the Array provided");

		}
	}

	public static void main(String[] args) {

		binSearch(new int[] { 2, 3, 11, 24, 10, 7, 12, 15, 26, 19 }, 25);
		resultDisplay();
		
	}

}
