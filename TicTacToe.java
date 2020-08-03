package TicTacToe;

import java.util.*;
import java.util.Scanner;

public class TicTacToe {
	//Name-Constants to represent seed and cell contents
	public static final int EMPTY = 0;
	public static final int CROSS = 1;
	public static final int NOUGHT = 2;

	//Name-Constants to represent various states of the game
	public static final int PLAYING = 0;
	public static final int DRAW = 1;
	public static final int CROSS_WON = 2;
	public static final int NOUGHT_WON = 3;

	//The game board and game status
	public static final int ROWS = 3, COLS = 3; //no. of rows and columns
	public static int[][] board = new int[ROWS][COLS]; //game board in 2D array containing(EMPTY, CROSS, NOUGHT)
	public static int currentState; //The current state of the game(Playing, Draw, CROSS_WON, NOUGHT_WON)
	public static int currentPlayer; //The current player(CROSS or NOUGHT)
	public static int currentRow, currentCol; //Current seed's rows and columns

	public static Scanner in = new Scanner(System.in); //The input Scanner

	public static void main(String args[]) {
		//Initialize the game board and current status
		initGame();
	}

	//Initialize the game board contents and current states
	public static void initGame() {
		for(int row = 0; row < ROWS; ++row)
		{
			for(int col = 0; col < COLS; ++col)
			{
				board[row][col] = EMPTY; //all cells empty
			}
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
		return r.nextInt(2) + 1;
	}
}



