package Battleship;

public class MockInterfaceRandom implements InterfaceRandom{

	@Override
	public int[][] randomallocation() {
		int[][] randomization = {{7,7},{2,2},{0,7},{0,0}};
		return randomization;
	}

	@Override
	public int[][] randomshot() {
		int[][] randomization = {{7,7}};
		return randomization;
	}

}
