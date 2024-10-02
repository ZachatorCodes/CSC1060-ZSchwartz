
public class Start1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 2, 3};
		int[] array2 = {1, 3};
		System.out.println(start1(array1, array2));
		
	}

	public static int start1(int[] a, int[] b) {
		int numOf1s = 0;
		
		if (a.length > 0 && a[0] == 1) {
			numOf1s++;
		}
		
		if (b.length > 0 && b[0] == 1) {
			numOf1s++;
		}
		
		return numOf1s;
	}
		 
}
