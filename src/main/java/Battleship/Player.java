package Battleship;

public class Player {
	
	public boolean marcableposition(Board board, String position_col, int position_row) {
		//returns true if the selected position is available to put a ship on it.
		//returns false if the selected position has already a ship on it.
		
		int col_to_numeric = -1;
		
		boolean selectable = false;
		boolean correct_value = true;
		
		switch (position_col) {
		case "A":
			col_to_numeric = 0;
			break;
		case "B":
			col_to_numeric = 1;
			break;
		case "C":
			col_to_numeric = 2;
			break;
		case "D":
			col_to_numeric = 3;
			break;
		case "E":
			col_to_numeric = 4;
			break;
		case "F":
			col_to_numeric = 5;
			break;
		case "G":
			col_to_numeric = 6;
			break;
		case "H":
			col_to_numeric = 7;
			break;
			
		default:
			System.out.println(" Incorrect value for function marcableposition switch_case has failed ");
			correct_value = false;
			break;
		}
		
		if (correct_value && board.getM_board()[position_row][col_to_numeric] == 0) {
			selectable = true;
		}
		
		
		return selectable;
	}

}
