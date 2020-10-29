package Battleship;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testMarcableposition() {
		
		Board b = new Board();
		
		Player p = new Player();
		
		int row = 1;
		
		int col = 2;
		
		
		
		assertTrue(p.marcableposition(b, row, col));
		
		
	}

}
