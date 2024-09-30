
public class ZipZap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(zipZap("zipXzap"));
		System.out.println(zipZap("zipXzap").equals("zpXzp"));
	}

	public static String zipZap(String str) {
		String answer = "";

		if (str.length() <= 2) {
			return str;
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals("z") && str.substring(i + 2, i + 3).equals("p")) {
				answer += str.substring(i, i + 1) + str.substring(i + 2, i + 3);
				i += 2;
			} else {
				answer += str.charAt(i);
			}
		}
		return answer;
	}

}
