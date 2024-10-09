import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	static String[][] board = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
	static Random randomObj = new Random();
	static Scanner scannerObj = new Scanner(System.in);
	static boolean winBool = false;

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe!");
		printBoard();
		while (!winBool) {
			
			playGame();
		}
	}
	
	public static void playGame() {
		if (winBool == true) {
			System.out.println("You win!");
			printBoard();
			return;
		}
		
		System.out.println("What row do you want to play in?");
		int row = scannerObj.nextInt();
		
		System.out.println("What column do you want to play in?");
		int column = scannerObj.nextInt();
		
		if (board[row - 1][column - 1] == "X") {
			System.out.println("You've already played here! Pick another spot.");
			playGame();
		}
		else if (board[row - 1][column - 1] == "O") {
			System.out.println("Your opponent already played here! Pick another spot.");
			playGame();
		}
		else {
			board[row - 1][column - 1] = "X";	
		}
		
		printBoard();
		
		System.out.println();
		
		checkForWin();
		
		cpuMove();
	}
	
	public static void cpuMove() {
		int randRow = randomObj.nextInt(2);
		int randColumn = randomObj.nextInt(2);
		
		if (board[randRow][randColumn] == "O" || board[randRow][randColumn] == "X") {
			cpuMove();
		}
		else {
			board[randRow][randColumn] = "O";
		}
		
		printBoard();
		
		checkForWin();
	}
	
	public static void checkForWin() {
		if ((board[0][0] == "X" && board[0][1] == "X" && board[0][2] == "X") || (board[0][0] == "O" && board[0][1] == "O" && board[0][2] == "O")) {
			winBool = true;
		}
		if ((board[1][0] == "X" && board[1][1] == "X" && board[1][2] == "X") || (board[1][0] == "O" && board[1][1] == "O" && board[1][2] == "O")) {
			winBool = true;
		}
		if ((board[2][0] == "X" && board[2][1] == "X" && board[2][2] == "X") || (board[2][0] == "O" && board[2][1] == "O" && board[2][2] == "O")) {
			winBool = true;
		}
		
		if ((board[0][0] == "X" && board[1][0] == "X" && board[2][0] == "X") || (board[0][0] == "O" && board[1][0] == "O" && board[2][0] == "O")) {
			winBool = true;
		}
		if ((board[0][1] == "X" && board[1][1] == "X" && board[2][1] == "X") || (board[0][1] == "O" && board[1][1] == "O" && board[2][1] == "O")) {
			winBool = true;
		}
		if ((board[0][2] == "X" && board[1][2] == "X" && board[2][2] == "X") || (board[0][2] == "O" && board[1][2] == "O" && board[2][2] == "O")) {
			winBool = true;
		}
		
		if ((board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X") || (board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O")) {
			winBool = true;
		}
		if ((board[0][2] == "X" && board[1][1] == "X" && board[2][0] == "X") || (board[0][2] == "O" && board[1][1] == "O" && board[2][0] == "O")) {
			winBool = true;
		}
	}
	
	public static void printBoard() {
		System.out.println(Arrays.deepToString(board).replace("], ", "]\n"));
	}

}
