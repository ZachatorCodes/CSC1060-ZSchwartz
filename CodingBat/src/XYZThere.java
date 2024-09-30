
public class XYZThere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(xyzThere("abc.xyzxyz"));
	}

	public static boolean xyzThere(String str) {
		for (int i = 0; i < str.length() - 2; i++) {
			String xyzSubString = str.substring(i, i + 3);
			if (xyzSubString.equals("xyz")) {
				if (i == 0) {
					return true;
				}
				if (i != 0 && (str.charAt(i - 1) != '.')) {
					return true;
				}
			}
		}
		return false;
	}
}
