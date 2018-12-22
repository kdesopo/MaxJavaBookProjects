package ui;

import db.GameBoard;
import business.GamePiece;

public class TicTacToeApp {
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe\n");
		
		GameBoard ticTac = new GameBoard();
		GamePiece X = new GamePiece("X");
		GamePiece O = new GamePiece("O");
		boolean isValid = false;
		boolean hasWinner = false;
		
		while(!hasWinner) {
			while(!isValid) {
				System.out.println(ticTac.toString());
				GamePiece curPiece = ticTac.getTurn().equals("X") ? X : O;
				int row = Console.getInt(ticTac.getTurn() + "'s turn\n"
					+ "Pick a row (1, 2, 3): ", 1, 3) - 1;
				int col = Console.getInt("Pick a column (1, 2, 3): ", 1, 3) - 1;
				
				GamePiece[][] curBoard = ticTac.getBoard();
				
				if(curBoard[row][col] == null) {
					ticTac.addPiece(curPiece, row, col);
					isValid = true;
				} else {
					System.out.println("\nError! A piece is already there. Try again.");
				} 
			}
			
			
			if(ticTac.winner() != null) {
				System.out.println(ticTac.toString());
				System.out.println(ticTac.winner() + " wins!\n");
				System.out.println("Game over!");
				System.exit(0);
			} else if (ticTac.getMovesLeft() == 0) {
				System.out.println(ticTac.toString());
				System.out.println("It's a tie!\n");
				System.out.println("Game over!");
				System.exit(0);
			} else {
				System.out.println("\n...\n...\n");
				ticTac.nextTurn();
				isValid = false;
			}
		}	
	}
}