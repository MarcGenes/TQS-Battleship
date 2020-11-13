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
	
	//@Test
	public void testInsertship() {
		
		//Player p = new Player();
		
		//p.insertship();
		
		//Testing EVERY valid position in the board (limit testing & border testing)
		/*This test passes ok when you put a ship in the edges of the board*/
		/*A-0, A-7, H-0, H-7*/
		
		/*The order to interact with the matrix is the following getM_board()[0-7][A-B]*/
		/*
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
		*/
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
		
		//p.getM_playerboard().printboard();
		
		
	}
	
	
	@Test
	public void CPUinsertship() {
		
		
		Player p = new Player();
		/*MockObject allocates on A-0, C-2, H-0, H-7 */
		MockInterfaceRandom MockObject = new MockInterfaceRandom();
		
		p.CPUinsertship(MockObject.randomallocation());
		
		p.getM_playerboard().printboard();
		
		for (int row = 0; row < 8; row++) {

			for (int col = 0; col < 8; col++) {
				
				if (row == 0 && col == 0) {
					assertEquals(1, p.getM_playerboard().getM_board()[row][col]);
				}else if (row == 2 && col == 2) {
					assertEquals(1, p.getM_playerboard().getM_board()[row][col]);
				}else if (row == 0 && col == 7) {
					assertEquals(1, p.getM_playerboard().getM_board()[row][col]);
				}else if (row == 7 && col == 7) {
					assertEquals(1, p.getM_playerboard().getM_board()[row][col]);
				}else {
					assertEquals(0, p.getM_playerboard().getM_board()[row][col]);
				}
						
					
				}
				
				
			}
		
		
		
	}
	
	
	@Test
	public void CPUinsertship1() {
		
		
		Player p = new Player();
		
		RealRandom random = new RealRandom();
		
		int[][]rand = random.randomallocation();
		
		int row0 = rand[0][0];
		int col0 = rand[0][1];
		
		int row1 = rand[1][0];
		int col1 = rand[1][1];
		
		int row2 = rand[2][0];
		int col2 = rand[2][1];
		
		int row3 = rand[3][0];
		int col3 = rand[3][1];

		p.CPUinsertship(rand);
		
		for (int row = 0; row < 8; row++) {

			for (int col = 0; col < 8; col++) {
				
				if (row == row0 && col == col0) {
					assertEquals(1, p.getM_playerboard().getM_board()[row][col]);
				}else if (row == row1 && col == col1) {
					assertEquals(1, p.getM_playerboard().getM_board()[row][col]);
				}else if (row == row2 && col == col2) {
					assertEquals(1, p.getM_playerboard().getM_board()[row][col]);
				}else if (row == row3 && col == col3) {
					assertEquals(1, p.getM_playerboard().getM_board()[row][col]);
				}else {
					assertEquals(0, p.getM_playerboard().getM_board()[row][col]);
				}
						
					
				}
				
				
			}
		
		p.getM_playerboard().printboard();
		
		//Test has to be under here
	}
	
	@Test
	public void shoot() {
		
		Player you = new Player();
		
		Player bot = new Player();
		
		MockInterfaceRandom mockobject = new MockInterfaceRandom();
		/*MockObject allocates on A-0, C-2, H-0, H-7 */
		bot.CPUinsertship(mockobject.randomallocation());
		int [][] direction = mockobject.randomshot();
		int result = you.shoot(bot.getM_playerboard(), direction);
		you.getM_playerboard().printadversaryboard();
		assertEquals(1,result);
		
	}
	
	@Test
		public void CPUshoot() {
			
			Player you = new Player();
			
			Player bot = new Player();
			
			MockInterfaceRandom mockobject = new MockInterfaceRandom();
			/*MockObject allocates on A-0, C-2, H-0, H-7 */
			you.CPUinsertship(mockobject.randomallocation());
			int result = bot.CPUshoot(you.getM_playerboard(), mockobject.randomshot());
			bot.getM_playerboard().printadversaryboard();
			assertEquals(1,result);
			
		}
		
	@Test
		public void CPUshoot_real() {
			
			Player you = new Player();
			
			Player bot = new Player();
			RealRandom rand = new RealRandom();
			MockInterfaceRandom mockobject = new MockInterfaceRandom();
			/*MockObject allocates on A-0, C-2, H-0, H-7 */
			you.CPUinsertship(mockobject.randomallocation());
			int[][] position = rand.randomshot();
			int result = bot.CPUshoot(you.getM_playerboard(), position);
			bot.getM_playerboard().printadversaryboard();
			
			int row = position[0][0];
			int col = position[0][1];
			if (you.getM_playerboard().getM_board()[row][col] == 0) {
				assertEquals(0,result);
			}else {
				assertEquals(1,result);
			}
			
		}	
	
	@Test
		public void chooseshotdirection() {
		Player you = new Player();
		Player bot = new Player();
		MockInterfaceRandom mockobject = new MockInterfaceRandom();
		int [][] direction = mockobject.randomshot();
		assertNotNull(direction);
		
		
	}

}
