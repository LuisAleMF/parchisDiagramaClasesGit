/**
 * 
 */
package parchisClasesPruebasUnits;

/**
 * 
 */
public class Tablero {

	private int numCasillas;
	private int[] casillas; 
	
	/**
	 * 
	 */
	public Tablero() {
		
		numCasillas = 21;
		casillas = new int[numCasillas];
		casillas[0] = true;
		
	}
	
	/**
	 * @param numCasillas
	 */
	public Tablero(int numCasillas) {	
		
		this.numCasillas = numCasillas;
		casillas = new boolean[numCasillas+1];
		casillas[0] = 0;
		
	}
	
	public void cambiarFicha(int origen, int destino) {
		
		casillas[origen] = false;
		casillas[destino] = true;
		
	}
	
	public int consultarNumCasillas() {
		
		return numCasillas;
		
	}
	
	public boolean[] consultarCasillas() {
		
		return casillas;
		
	}

}
