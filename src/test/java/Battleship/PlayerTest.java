package Battleship;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	//@Test
	public void testMarcableposition1() {
		
		//Player p = new Player();
		//Row = true Col = true, find water
		/*int row = 0;
		String col = "A";
		boolean result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);*/
		

		//Row = false Col = false, dont find water
		/*int row = 10;
		String col = "M";
		Boolean result = p.marcableposition(p.getM_playerboard(), col, row);
		assertFalse(result);*/
		
		/*int row = 10;
		String col = "A";
		boolean result = p.marcableposition(p.getM_playerboard(), col, row);
		assertFalse(result);*/
		
		/*int row = 7;
		String col = "J";
		boolean result = p.marcableposition(p.getM_playerboard(), col, row);
		assertFalse(result);*/
		
		/*p.getM_playerboard().getM_board()[7][7] = 1;
		int row = 7;
		String col = "H";
		boolean result = p.marcableposition(p.getM_playerboard(), col, row);
		assertFalse(result);
		*/
	}
	
	@Test
	public void testMarcableposition() {
		
		
		Player p = new Player();
		

		
	//Boundary testing of the board
		
		//Column A
		int row = 0;
		String col = "A";
		boolean result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 1;
		col = "A";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 2;
		col = "A";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 3;
		col = "A";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 4;
		col = "A";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 5;
		col = "A";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 6;
		col = "A";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 7;
		col = "A";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		//Column H
		row = 0;
		col = "H";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 1;
		col = "H";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 2;
		col = "H";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 3;
		col = "H";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 4;
		col = "H";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 5;
		col = "H";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 6;
		col = "H";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 7;
		col = "H";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
				
		//Row 0
		row = 0;
		col = "A";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 0;
		col = "B";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 0;
		col = "C";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 0;
		col = "D";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 0;
		col = "E";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 0;
		col = "F";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 0;
		col = "G";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 0;
		col = "H";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
				
		//Row 7
		row = 7;
		col = "A";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 7;
		col = "B";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 7;
		col = "C";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 7;
		col = "D";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 7;
		col = "E";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 7;
		col = "F";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 7;
		col = "G";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 7;
		col = "H";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
	//Limit testing of the board
		//Interior Limit (true values) 
		
		//Column B
		row = 1;
		col = "B";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 2;
		col = "B";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 3;
		col = "B";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 4;
		col = "B";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 5;
		col = "B";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 6;
		col = "B";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);

		
		//Column G
		row = 1;
		col = "G";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 2;
		col = "G";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 3;
		col = "G";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 4;
		col = "G";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 5;
		col = "G";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 6;
		col = "G";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		//Row 1
		row = 1;
		col = "B";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 1;
		col = "C";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 1;
		col = "D";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 1;
		col = "E";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 1;
		col = "F";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 1;
		col = "G";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		//Row 6
		row = 6;
		col = "B";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 6;
		col = "C";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 6;
		col = "D";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 6;
		col = "E";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 6;
		col = "F";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 6;
		col = "G";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		//Exterior Limit (false values)
		
		row = -1;
		col = "G";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertFalse(result);
		
		row = 8;
		col = "G";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertFalse(result);
		
		row = 0;
		col = "I";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertFalse(result);
		
		row = -20;
		col = "Z";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertFalse(result);
		
	//Interior values or equivalent partition values  (True values)
		
		//Row 2
		row = 2;
		col = "C";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 2;
		col = "D";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 2;
		col = "E";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 2;
		col = "F";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		//Row 3
		row = 3;
		col = "C";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 3;
		col = "D";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 3;
		col = "E";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 3;
		col = "F";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		//Row 4
		row = 4;
		col = "C";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 4;
		col = "D";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 4;
		col = "E";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 4;
		col = "F";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		//Row 5
		row = 5;
		col = "C";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 5;
		col = "D";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 5;
		col = "E";
		result = p.marcableposition(p.getM_playerboard(), col, row);
		assertTrue(result);
		
		row = 5;
		col = "F";
		result = p.marcableposition(p.getM_playerboard(), col, row);
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
	public void testCPUinsertship() {
		
		/*MockObject allocates on A-0, C-2, H-0, H-7 */
		Player p = new Player();
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
	public void testCPUinsertship1() {
		
		
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
		//Nested loop testing N iterations (All possible)
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
	public void testshoot() {
		
		Player you = new Player();
		Player bot = new Player();
		MockInterfaceRandom mockobject = new MockInterfaceRandom();
		/*MockObject allocates on A-0, C-2, H-0, H-7 */
		bot.CPUinsertship(mockobject.randomallocation());
		//int [][] direction = mockobject.randomshot();
		int[][] randomization = {{50,7}};
		int result = you.shoot(bot.getM_playerboard(), randomization);
		you.getM_playerboard().printadversaryboard();
		assertEquals(-1,result);
		
	}
	
	@Test
		public void testCPUshoot() {
			
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
		public void testCPUshoot_real() {
			
			Player you = new Player();
			Player bot = new Player();
			RealRandom rand = new RealRandom();
			/*MockObject allocates on A-0, C-2, H-0, H-7 */
			you.CPUinsertship(rand.randomallocation());
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
		public void testchooseshotdirection() {
		Player you = new Player();
		Player bot = new Player();
		MockInterfaceRandom mockobject = new MockInterfaceRandom();
		int [][] direction = mockobject.randomshot();
		assertNotNull(direction);
		
		
	}
	
	@Test
	public void looptest0times() {
	Player you = new Player();
	int ships_to_locate = 0;
	int loops = 0;
	int row = -1;
	int col = -1;
	while (ships_to_locate > 0) {
		switch (ships_to_locate) {
		case 1:
			row = 7; col = 7;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 2:
			row = 0; col = 7;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 3:
			row = 5; col = 5;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 4:
			row = 0; col = 0;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		default:
			break;
		}
		ships_to_locate--;
		loops++;
	}
		you.getM_playerboard().printboard();
		assertEquals(0, loops);
	}
	
	@Test
	public void looptest1times() {
	Player you = new Player();
	int ships_to_locate = 1;
	int loops = 0;
	int row = -1;
	int col = -1;
	while (ships_to_locate > 0) {
		switch (ships_to_locate) {
		case 1:
			row = 7; col = 7;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 2:
			row = 0; col = 7;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 3:
			row = 5; col = 5;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 4:
			row = 0; col = 0;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		default:
			break;
		}
		ships_to_locate--;
		loops++;
	}
		you.getM_playerboard().printboard();
		assertEquals(1, loops);
		
	}
	
	@Test
	public void looptest2times() {
	Player you = new Player();
	int ships_to_locate = 2;
	int loops = 0;
	int row = -1;
	int col = -1;
	while (ships_to_locate > 0) {
		switch (ships_to_locate) {
		case 1:
			row = 7; col = 7;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 2:
			row = 0; col = 7;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 3:
			row = 5; col = 5;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 4:
			row = 0; col = 0;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		default:
			break;
		}
		ships_to_locate--;
		loops++;
	}
		you.getM_playerboard().printboard();
		assertEquals(2, loops);
	}
	
	@Test
	public void looptest3times() {
	Player you = new Player();
	int ships_to_locate = 3;
	int loops = 0;
	int row = -1;
	int col = -1;
	while (ships_to_locate > 0) {
		switch (ships_to_locate) {
		case 1:
			row = 7; col = 7;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 2:
			row = 0; col = 7;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 3:
			row = 5; col = 5;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 4:
			row = 0; col = 0;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		default:
			break;
		}
		ships_to_locate--;
		loops++;
	}
		you.getM_playerboard().printboard();
		assertEquals(3, loops);
		
	}
	
	@Test
	public void looptest4times() {
	Player you = new Player();
	int ships_to_locate = 4;
	int loops = 0;
	int row = -1;
	int col = -1;
	while (ships_to_locate > 0) {
		switch (ships_to_locate) {
		case 1:
			row = 7; col = 7;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 2:
			row = 0; col = 7;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 3:
			row = 5; col = 5;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		case 4:
			row = 0; col = 0;
			you.getM_playerboard().getM_board()[row][col] = 1;
			break;
		default:
			break;
		}
		ships_to_locate--;
		loops++;
	}
		you.getM_playerboard().printboard();
		assertEquals(4, loops);
		
	}

}
