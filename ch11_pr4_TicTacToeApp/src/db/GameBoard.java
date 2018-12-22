package db;

import business.GamePiece;

public class GameBoard {
	
	private GamePiece[][] board = new GamePiece[3][3];
	private String turn = "X";
	private int movesLeft = 9;
	
	public void nextTurn() {
		if (turn.equals("X")) {
			turn = "O";
		} else {
			turn = "X";
		}
	}
	
	public void addPiece(GamePiece p, int r, int c) {
		board[r][c] = p;
		movesLeft--;
	}

	public GamePiece[][] getBoard() {
		return board;
	}

	public String getTurn() {
		return turn;
	}
	
	public int getMovesLeft() {
		return movesLeft;
	}

	@Override
	public String toString() {
		String boardStr = "+---+---+---+\n";
		String pieceStr = "";
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if(board[r][c] == null) {
					boardStr += "|   ";
				} else {
					pieceStr = board[r][c].getName();
					boardStr += "| " + pieceStr + " ";
				}
				
			}
					
			boardStr += "|\n";
			boardStr += "+---+---+---+\n";
			}
		return boardStr;
	}
	
	public String winner() {	
		GamePiece p1 = null;
		GamePiece p2 = null;
		GamePiece p3 = null;
		
		for(int r = 0; r < 3; r++) {
			p1 = board[r][0];
			p2 = board[r][1];
			p3 = board[r][2];
			
			if(match(p1,p2,p3)) {
				return p1.getName();
			}
		}
		
		for(int c = 0; c < 3; c++) {
			p1 = board[0][c];
			p2 = board[1][c];
			p3 = board[2][c];
			
			if(match(p1,p2,p3)) {
				return p1.getName();
			}
		}
		
		p1 = board[0][0];
		p2 = board[1][1];
		p3 = board[2][2];
		
		if(match(p1,p2,p3)) {
			return p1.getName();
		}

		p1 = board[0][2];
		p2 = board[1][1];
		p3 = board[2][0];
		
		if(match(p1,p2,p3)) {
			return p1.getName();
		}
		
		return null;		
	}
	
	public boolean match(GamePiece p1, GamePiece p2, GamePiece p3) {
		if(p1 == null || p2 == null || p3 == null) {
			return false;
		} else if(p1.equals(p2) && p2.equals(p3)) {
			return true;
		} else {
			return false;
		}
	}
}
