package Battleship;

import static org.junit.Assert.*;

import org.junit.Test;

public class mainTest {

	@Test
	public void testwin() {
		
		Player you = new Player();
		Player cpu = new Player();
		
		//RealRandom rand = new RealRandom();
		MockInterfaceRandom mockobject = new MockInterfaceRandom();
		RealRandom rand = new RealRandom();
		
		you.CPUinsertship(rand.randomallocation());
		
		System.out.println("This is your board");
		
		you.getM_playerboard().printboard();
		
		cpu.CPUinsertship(mockobject.randomallocation());
		
		boolean finish = false;
		
		int number_of_plays = 0;
		int[][] direction = mockobject.randomallocation();
	
		int row, col;
		do {
			if (number_of_plays == 0) {
				
				row = direction[0][0];
				col = direction[0][1];
				int[][] shot = {{row,col}};
				you.shoot(cpu.getM_playerboard(), shot);
				
			}else if (number_of_plays == 1) {
				
				row = direction[1][0];
				col = direction[1][1];
				int[][] shot = {{row,col}};
				you.shoot(cpu.getM_playerboard(), shot);
				
			}else if (number_of_plays == 2) {
				
				row = direction[2][0];
				col = direction[2][1];
				int[][] shot = {{row,col}};
				you.shoot(cpu.getM_playerboard(), shot);
				
			}else if (number_of_plays == 3) {
				
				row = direction[3][0];
				col = direction[3][1];
				int[][] shot = {{row,col}};
				you.shoot(cpu.getM_playerboard(), shot);
				
			}
			
			 
			
			
			cpu.CPUshoot(you.getM_playerboard(), rand.randomshot());
			
			System.out.println(" ");
			System.out.println("Your adversary board:");
			System.out.println(" ");
			you.getM_playerboard().printadversaryboard();
			
			System.out.println(" ");
			System.out.println("Your board:");
			System.out.println(" ");
			cpu.getM_playerboard().printadversaryboard();
			
			
			///
			System.out.println(" ");
			System.out.println("Your strikes are: " + you.getM_playerboard().getM_strikes());
			System.out.println(" ");
			
			///
			
			
			if (you.getM_playerboard().getM_strikes() == 4) {
				finish = true;
			}
				
			
			if (cpu.getM_playerboard().getM_strikes() == 4) {
				finish = true;
			}
				
			
			number_of_plays++;
				
			
		} while (finish == false);
		String match_result = null;
		if (you.getM_playerboard().getM_strikes() == 4) {
			System.out.println("You win like a champ");
			match_result = "You win like a champ";
		}else {
			System.out.println("You lose like a champ");
			match_result = "You lose like a champ";
		}
		
		assertEquals("You win like a champ", match_result);

	}
	
	
	
	
	@Test
	public void testlose() {
		
		Player you = new Player();
		Player cpu = new Player();
		
		//RealRandom rand = new RealRandom();
		MockInterfaceRandom mockobject = new MockInterfaceRandom();
		RealRandom rand = new RealRandom();
		
		you.CPUinsertship(mockobject.randomallocation());
		
		System.out.println("This is your board");
		
		you.getM_playerboard().printboard();
		
		cpu.CPUinsertship(rand.randomallocation());
		
		boolean finish = false;
		
		int number_of_plays = 0;
		int[][] direction = mockobject.randomallocation();
	
		int row, col;
		do {
			if (number_of_plays == 0) {
				
				row = direction[0][0];
				col = direction[0][1];
				int[][] shot = {{row,col}};
				cpu.shoot(you.getM_playerboard(), shot);
				
			}else if (number_of_plays == 1) {
				
				row = direction[1][0];
				col = direction[1][1];
				int[][] shot = {{row,col}};
				cpu.shoot(you.getM_playerboard(), shot);
				
			}else if (number_of_plays == 2) {
				
				row = direction[2][0];
				col = direction[2][1];
				int[][] shot = {{row,col}};
				cpu.shoot(you.getM_playerboard(), shot);
				
			}else if (number_of_plays == 3) {
				
				row = direction[3][0];
				col = direction[3][1];
				int[][] shot = {{row,col}};
				cpu.shoot(you.getM_playerboard(), shot);
				
			}
			
			 
			
			
			you.CPUshoot(you.getM_playerboard(), rand.randomshot());
			
			System.out.println(" ");
			System.out.println("Your adversary board:");
			System.out.println(" ");
			you.getM_playerboard().printadversaryboard();
			
			System.out.println(" ");
			System.out.println("Your board:");
			System.out.println(" ");
			cpu.getM_playerboard().printadversaryboard();
			
			
			///
			System.out.println(" ");
			System.out.println("Your strikes are: " + you.getM_playerboard().getM_strikes());
			System.out.println(" ");
			
			///
			
			
			if (you.getM_playerboard().getM_strikes() == 4) {
				finish = true;
			}
				
			
			if (cpu.getM_playerboard().getM_strikes() == 4) {
				finish = true;
			}
				
			
			number_of_plays++;
				
			
		} while (finish == false);
	
		String match_result = null;
		if (you.getM_playerboard().getM_strikes() == 4) {
			System.out.println("You win like a champ");
			match_result = "You win like a champ";
		}else {
			System.out.println("You lose like a champ");
			match_result = "You lose like a champ";
		}
		
		assertEquals("You lose like a champ", match_result);

	}
	
}


