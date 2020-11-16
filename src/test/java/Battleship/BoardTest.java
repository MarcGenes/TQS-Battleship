package Battleship;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testGenerateboard() {
		
		Board b = new Board();
		
		
		for (int row = 0; row < 8; row++) {
			
			for (int col = 0; col < 8; col++) {
				
				assertEquals(0, b.getM_board()[row][col]);
				
			}
			
		}
		b.printboard();
		b.printadversaryboard();
	}
	@Test
	public void testGenerateboard1() {
		
		Board b = new Board();
		
		//Boundary/Frontier testing of the board
		
		for (int i = 0; i < 8; i++) {

			assertEquals(0, b.getM_board()[0][i]);
			assertEquals(0, b.getM_board()[7][i]);
			
			assertEquals(0, b.getM_board()[i][0]);
			assertEquals(0, b.getM_board()[i][7]);
			
		}
		
		//Interior limit testing of the board
		
		for (int i = 1; i < 7; i++) {
					
					assertEquals(0, b.getM_board()[1][i]);
					assertEquals(0, b.getM_board()[6][i]);
					
					assertEquals(0, b.getM_board()[i][1]);
					assertEquals(0, b.getM_board()[i][6]);
					
				}
		
		//Interior values  of the board
		
		for (int i = 2; i < 6; i++) {
			
			assertEquals(0, b.getM_board()[2][i]);
			assertEquals(0, b.getM_board()[5][i]);
			
			assertEquals(0, b.getM_board()[i][2]);
			assertEquals(0, b.getM_board()[i][5]);
			
		}
		
		/*
		String exampleboard[] = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
								   " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
								   " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
								   " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
								   " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
								   " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
								   " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
								   " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
								   " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
								   " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",};
		
		assertEquals(exampleboard, b.generateboard());
		*/
		
		
		
	}
	
	@Test
	public void printboard() {
		
		Board b = new Board();
		
		b.printboard();
		
		for (int row = 0; row < 8; row++) {
			
			for (int col = 0; col < 8; col++) {
				
				assertEquals(0, b.getM_board()[row][col]);
				
			}
			
		}
		
		/*
		String example[] = {"A","B","C","D","E","F","G","H",
					  "1","0","0","0","0","0","0","0","0",
					  "1","0","0","0","0","0","0","0","0",
					  "1","0","0","0","0","0","0","0","0",
					  "1","0","0","0","0","0","0","0","0",
					  "1","0","0","0","0","0","0","0","0",
					  "1","0","0","0","0","0","0","0","0",
					  "1","0","0","0","0","0","0","0","0",
					  "1","0","0","0","0","0","0","0","0",
		};
		
		assertEquals(example, b.printboard());
		*/
		
	}

}
