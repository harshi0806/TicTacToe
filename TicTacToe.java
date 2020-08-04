package TicTacToe;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
	static String[] board;
	static String turn;

	public static void main(String[] args) {
		board = new String[9];
		populateEmptyBoard();
		System.out.println("Welcome to 2 Player Tic Tac Toe.");
		System.out.println("--------------------------------");
		int player = Toss();
		//player checked 1-user, 0-computer
		if(player == 1)
		{
			System.out.println("User plays first.");
			chooseLetter();
		}
		else
		{
			System.out.println("Computer plays first.");
			chooseLetter();
		}
		printBoard();
	}

	//This function is used to reset the board
	static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}
	}

	/**
	  *Function to generate random player
	  *@return random output to check which player plays first
	  */
	public static int Toss() {
		System.out.println("Toss to see who plays first!");
		Random random = new Random();
		return random.nextInt(2);
	}

	/**
	  *Function to choose letter X or O
	  *@return inputLetter in variable turn
	  */
	public static String chooseLetter() {
		System.out.println("Choose either X or O: ");
		Scanner letter = new Scanner(System.in);
		String inputLetter = letter.next();
		if(inputLetter.equals("X"))
		{
			turn = "X";
		}
		else
		{
			turn = "O";
		}
		return turn;
	}

	//This function displays the board to let player choose the seed
	public static void printBoard() {
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("/---|---|---\\");
	}
}
