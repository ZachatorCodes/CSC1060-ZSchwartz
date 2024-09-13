
public class MakeBricks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeBricks(3, 1, 8); // true
		makeBricks(3, 1, 9); // false
		makeBricks(3, 2, 10); // true
		makeBricks(3, 2, 9); // false
		

	}
	
	public static boolean makeBricks(int small, int big, int goal) {
		if ((big * 5) + small < goal) {
			return false;
		}
		return true;
	}

}
