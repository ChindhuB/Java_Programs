package sample.javaprogram;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int a[]= {23,-14,34,7,-9,-32,36,18,2};
		Arrays.sort(a);
		for (int i:a)
		System.out.print(" "+i);
	}

}
