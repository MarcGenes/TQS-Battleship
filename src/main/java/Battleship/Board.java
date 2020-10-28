package Battleship;

public class Board {
	
	
	
	private int m_board[][] = new int[8][8];
	
	public void generateboard() {
		//generates an empty board in order to start the match
		
		for (int row = 0; row < 8; row++) {

			for (int col = 0; col < 8; col++) {
				
				m_board[row][col] = 0; // 0 means you touched water
				
				
			}
			
		}
		
		
	
	
		
	}

	public Board() {
		generateboard();
	}

	public int[][] getM_board() {
		return m_board;
	}

	public void setM_board(int[][] m_board) {
		this.m_board = m_board;
	};

}
