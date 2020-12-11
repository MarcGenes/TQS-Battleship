package Battleship;
import java.util.Scanner;

public class LecturaDatosTest implements EntradaDatosTest{
	
	private Scanner leer;
	
	LecturaDatosTest()
	{
		leer = new Scanner(System.in);
		
		
	}
	public String entrarLetra() 
	{
		return leer.next();
		
	}
	public int entrarNumero() 
	{
		return leer.nextInt();
		
	}

}
