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
				//System.out.println(b.getM_board()[row][col]);
				
			}
			
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

}
