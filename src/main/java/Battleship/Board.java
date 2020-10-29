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

	public void printboard() {
		
		System.out.println("  A B C D E F G H");
		
		int row_number = 0;
		
		for (int row = 0; row < 8; row++) {
			
			System.out.print(row_number);
			System.out.print(" ");
			
			for (int col = 0; col < 8; col++) {
				
				System.out.print(m_board[row][col]);
				System.out.print(" ");
				
			}
			System.out.println();
			row_number++;
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
