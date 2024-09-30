
public class CodeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countCode("AAcodeBBcoleCCccoreDD"));
	}

	public static int countCode(String str) {
		int codeCount = 0;

		for (int i = 0; i < str.length() - 3; i++) {
			String testString = str.substring(i, i + 4);
			if (testString.substring(0, 2).equals("co") && testString.substring(3).equals("e")) {
				codeCount++;
			}
		}
		return codeCount;
	}

}
