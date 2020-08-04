package TicTacToe;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
	static String[] board;

	public static void main(String[] args) {
		board = new String[9];
		populateEmptyBoard();
		System.out.println("Welcome to 2 Player Tic Tac Toe.");
		System.out.println("--------------------------------");
	}

	//This function is used to reset the board
	static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}
		currentState = PLAYING;
		currentPlayer = Toss();
      if(currentPlayer == 1)
      {
         currentPlayer = CROSS;
      }
      else
      {
         currentPlayer = NOUGHT;
      }
	}

	//Function to generate random player
	public static int Toss() {
		final Random r = new Random();
		return r.nextInt(1) + 1;
	}

	//Function to print the game board
	public static void printBoard() {
		for(int row = 0; row < ROWS; ++row)
		{
			for(int col = 0; col < COLS; ++col)
			{
				printCell(board[row][col]); //print each of the cells
				if(col != COLS - 1)
				{
					System.out.println("|"); //print vertical partition
				}
			}
			System.out.println();
			if(row != ROWS - 1)
			{
				System.out.println("----------"); //print horizontal partition
			}
		}
		System.out.println();
	}

	//Function to print a cell with the specified content
	public static void printCell(int content) {
		switch(content)
		{
			case EMPTY :
				System.out.print(" ");
				break;
			case NOUGHT :
				System.out.print(" O ");
				break;
			case CROSS :
				System.out.print(" X ");
				break;
		}
	}
}
