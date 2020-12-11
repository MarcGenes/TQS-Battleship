package Battleship;

public class main {

	public static void main(String[] args) {

		Player you = new Player();
		Player cpu = new Player();
		
		RealRandom rand = new RealRandom();
		
		you.insertship();
		
		System.out.println("This is your board");
		
		you.getM_playerboard().printboard();
		
		cpu.CPUinsertship(rand.randomallocation());
		
		boolean finish = false;
		
		do {
			
			int[][] direction = you.chooseshotdirection(cpu.getM_playerboard());
			 
			you.shoot(cpu.getM_playerboard(), direction);
			
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
				
			
			
				 
			
		} while (finish == false);
		
		if (you.getM_playerboard().getM_strikes() == 4) {
			System.out.println("You win like a champ");
		}else {
			System.out.println("You lose like a champ");
		}

	}

}
