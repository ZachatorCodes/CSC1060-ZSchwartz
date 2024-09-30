
public class PlusOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(plusOut("12xy34xyabcxy", "xy"));
		System.out.println(plusOut("12xy34xyabcxy", "xy").equals("++xy++xy+++xy"));
	}

	public static String plusOut(String str, String word) {
		String answer = "";

		for (int i = 0; i < str.length(); i++) {
			if ((i + word.length() <= str.length()) && (str.substring(i, i + word.length()).equals(word))) {
				answer += word;
				i += word.length() - 1;
			} else {
				answer += "+";
			}
		}
		return answer;
	}
}
