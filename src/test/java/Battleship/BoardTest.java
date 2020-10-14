package Battleship;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testGenerateboard() {
		
		Board b = new Board();
		
		b.generateboard();
		
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
		
		assertEquals(b.generateboard(), exampleboard);
		
		
	}

}
