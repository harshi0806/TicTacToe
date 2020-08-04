package TicTacToe;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
	static String[] board;

	public static void main(String[] args) {
		board = new String[9];
		populateEmptyBoard();
		System.out.println("Welcome to 2 Player Tic Tac Toe.");
		System.out.println("--------------------------------");
		int player = Toss();
		if(player == 1)
		{
			System.out.println("User plays first.");
		}
		if(player == 0)
		{
			System.out.println("Computer plays first.");
		}
	}

	//This function is used to reset the board
	static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}
	}

	//Function to generate random player
	public static int Toss() {
		System.out.println("Toss to see who plays first!");
		Random random = new Random();
		return random.nextInt(2);
	}
}
