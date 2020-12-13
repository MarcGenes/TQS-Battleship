package Battleship;

public class MockInterfaceRandom implements InterfaceRandom{
	
	@Override
	public int[][] randomallocation() {
		int[][] randomization = {{7,7},{0,7},{0,0},{7,0}}; // aqui se meten los barcos
		return randomization;
	}

	//mocks entrada Automated Test
	@Override
	public int[][] randomallocation1() {
		int[][] randomization = {{7,7},{0,7},{0,0},{7,0}}; // aqui se meten los barcos
		return randomization;
	}
	@Override
	public int[][] randomallocation2() {
		int[][] randomization = {{2,3},{3,3},{4,3},{5,3}}; // aqui se meten los barcos
		return randomization;
	}

	@Override
	public int[][] randomallocation3() {
		int[][] randomization = {{0,1},{0,2},{0,3},{0,4}}; // aqui se meten los barcos
		return randomization;
	}

	@Override
	public int[][] randomallocation4() {
		int[][] randomization = {{6,4},{5,5},{4,6},{3,7}}; // aqui se meten los barcos
		return randomization;
	}


	@Override
	public int[][] randomshot() {  // aqui se dispara ( siempre al mismo sitio, o player o cpu, para no ganar al otro)
		int[][] randomization = {{7,7}};
		return randomization;
	}

}
