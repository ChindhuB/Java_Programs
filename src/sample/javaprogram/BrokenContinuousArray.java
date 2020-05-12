package sample.javaprogram;

import java.util.Arrays;

public class BrokenContinuousArray{
	static int misElem;

	private static int getElement(int contarr[]) {
		Arrays.sort(contarr);
		int arrlen=contarr.length-1;
		int minval=contarr[0];
		int maxval=contarr[arrlen];
		int j=0;
		for(int i=minval;i<maxval;i++) {
			if(i!=contarr[j]) {
				misElem=i;
				break;
			}
			j++;
		}
		return misElem;
	}

	public static void main(String[] args) {
		
		System.out.println("Missing Element in Array : " + getElement(new int[] { 12, 15, 13, 16, 14, 18, 20, 17 }));

	}


}
