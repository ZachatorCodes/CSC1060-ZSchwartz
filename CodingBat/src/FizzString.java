
public class FizzString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizzString("fig");
		fizzString("dib");
		fizzString("fib");
	}
	
	public static void fizzString(String str) {
		if ((str.charAt(0) == 'f') && (str.charAt(str.length() - 1) == 'b')) {
			System.out.println("FizzBuzz");
		}
	}
}
