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
		
		p.getM_playerboard().printboard();
		
		
	}
	

}
