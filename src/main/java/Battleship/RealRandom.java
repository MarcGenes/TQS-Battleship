package Battleship;
import java.util.Random;

public class RealRandom implements InterfaceRandom {

	@Override
	public int[][] randomallocation() {
		
		int[][] randomization = {{-1,-1},{-1,-1},{-1,-1},{-1,-1}};
		
		Random random = new Random();
		
		int positions_inserted = 0;
		
		do {
			
			boolean allocable = true;
			
			int randomrow = random.nextInt(8);
			int randomcol = random.nextInt(8);
			
			for (int i = 0; i < 4; i++) {
				
				if (randomization[i][0] == randomrow && randomization[i][1] == randomcol ) {
					allocable = false;
				}
				
			}
			
			if (allocable) {
				
				randomization[positions_inserted][0] = randomrow;
				randomization[positions_inserted][1] = randomcol;
				
				positions_inserted++;
				
				
			}
			
			
		} while (positions_inserted != 4);
		
		
		
		return randomization;
	}

	@Override
	public int[][] randomshot() {
		// TODO Auto-generated method stub
		
		
		Random random = new Random();
		int randomrow = random.nextInt(8);
		int randomcol = random.nextInt(8);
		int[][] result = {{randomrow, randomcol}};
		
		return result;
	}

	@Override
	public int[][] randomallocation1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[][] randomallocation2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[][] randomallocation3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[][] randomallocation4() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
