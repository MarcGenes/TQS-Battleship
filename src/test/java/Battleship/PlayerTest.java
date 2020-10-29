package Battleship;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testMarcableposition() {
		
		Board b = new Board();
		
		Player p = new Player();
		
		int row = 1;
		
		String col = "C";
		
		boolean result = p.marcableposition(b, col, row);
		
		assertTrue(result);
		
		
	}
	
	@Test
	public void testInsertship() {
		
		Player p = new Player();
		
		p.insertship();
		
		//Testing EVERY valid position in the board (limit testing & border testing)
		/*This test passes ok when you put a ship in the edges of the board*/
		/*A-0, A-7, H-0, H-7*/
		
		/*The order to interact with the matrix is the following getM_board()[0-7][A-B]*/
		
		for (int row = 0; row < 8; row++) {

			for (int col = 0; col < 8; col++) {
				
					if (col == 0) {
						if (row == 0 || row == 7) {
							assertEquals(1, p.getM_playerboard().getM_board()[row][col]);
						}else {
							assertEquals(0, p.getM_playerboard().getM_board()[row][col]);
						}
						
					}else if (col == 7) {
						if (row == 0 || row == 7) {
							assertEquals(1, p.getM_playerboard().getM_board()[row][col]);
						}else {
							assertEquals(0, p.getM_playerboard().getM_board()[row][col]);
						}
					}else {
						assertEquals(0, p.getM_playerboard().getM_board()[row][col]);
					}
					
				}
				
				
			}
		
		/*
		assertEquals(1, p.getM_playerboard().getM_board()[0][0]);
		assertEquals(1, p.getM_playerboard().getM_board()[7][0]);
		assertEquals(1, p.getM_playerboard().getM_board()[0][7]);
		assertEquals(1, p.getM_playerboard().getM_board()[0][7]);
		*/
		
		
		//Testing interior limit (limit testing)
		/*B-1, B-2, B-3, B-4*/
		/*
		for (int row = 0; row < 8; row++) {

			for (int col = 0; col < 8; col++) {
				
					if (col == 1) {
						
						if (row == 1 || row == 2 || row == 3 || row == 4) {
							
							assertEquals(1, p.getM_playerboard().getM_board()[row][col]);
							
						}
						
						
					}else {
						assertEquals(0, p.getM_playerboard().getM_board()[row][col]);
					}
					
				}
				
				
			}
		*/
		/*
		assertEquals(1, p.getM_playerboard().getM_board()[1][1]);
		assertEquals(1, p.getM_playerboard().getM_board()[2][1]);
		assertEquals(1, p.getM_playerboard().getM_board()[3][1]);
		assertEquals(1, p.getM_playerboard().getM_board()[4][1]);
		*/
		
		p.getM_playerboard().printboard();
		
		
	}
	

}
