package sample.javaprogram;

import java.util.Scanner;

public class SwapArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Enter array length
		System.out.print("Enter length of Array:");
		int len = sc.nextInt();
		String a[] = new String[len];
		String b[] = new String[len];
		// Enter value for first Array
		for (int i = 0; i < len; i++) {
			System.out.println("Enter value for Array1:");
			a[i] = sc.next();
		}
		// Enter value for second Array
		for (int i = 0; i < len; i++) {
			System.out.println("Enter value for Array2:");
			b[i] = sc.next();
		}

		// Print first Array
		System.out.println("First Array :");
		for (int i = 0; i < len; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		// Print second Array
		System.out.println("Second Array :");
		for (int i = 0; i < len; i++) {
			System.out.print(b[i]+" ");
		}
//Swap Array
		String c;
		for (int i = 0; i < len; i++) {
			c = b[i];
			b[i] = a[i];
			a[i] = c;

		}
		
		// Print first Array after swap
		System.out.println();
		System.out.println("First Array after Swap :");
		for (int i = 0; i < len; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		// Print second Array after swap
		System.out.println("Second Array after Swap:");
		for (int i = 0; i < len; i++) {
			System.out.print(b[i]+" ");
		}
		sc.close();
	}

}
