package Battleship;

import java.util.ArrayList;

public class MockDatosTest  implements EntradaDatosTest{
	
	private ArrayList<Integer> numerosEntrada = new ArrayList<Integer>();
	private ArrayList<String> letrasEntrada = new ArrayList<String>();
	private int contNumero =0, contLetra=0;
	
	//anotar todas las entradas que se querian para jugar.
	public void entradasteclado(int tipo) 
	{
		//tipo 1 datos entrada barcos ( solo 4 )
		if(tipo==1) {
		
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
	
		
		}
		//tipo 2 datos disparo barcos.
		if(tipo==2) 
		{
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			letrasEntrada.add("A");numerosEntrada.add(3);
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	public int entrarNumero() 
	{
		int res=0;
		if(contNumero<numerosEntrada.size())
		{
			res=numerosEntrada.get(contNumero);
			contNumero++;
		}
		
		return res;
		
	}
	public String entrarLetra()
	{
		String res="";
		if(contLetra < letrasEntrada.size()) 
		{
			res=letrasEntrada.get(contLetra);
			contLetra++;
		}
		
		return res;
		
		
	}

	

}
