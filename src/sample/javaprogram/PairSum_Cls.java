package sample.javaprogram;
//To find a value close to a given one in an array;
public class PairSum_Cls {
	static int minimumDiff = Integer.MAX_VALUE;

	public static void main(String[] args) {
		int l = 0, r = 0, c = 0;
		int a[] = { 12, 23, -34, -15, 25, -11 };
		int x = -5;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				c = Math.abs((a[i] + a[j]) - x);
				if (c < minimumDiff) {
					minimumDiff = c;
					l = i;
					r = j;
				}
			}
		}
		System.out.println(" The pair whose sum is closest to "+x+" : " + a[l] + " " + a[r]);
	}
}
