/**
 * 
 */
package parchisClasesPruebasUnits;

/**
 * 
 */
public class Jugador extends Usuario {

	private String nombre;
	private Tablero tablero;
	private Ficha ficha;
	private Ficha ficha2;
	
	public Jugador(String nombre, Tablero tablero, Ficha ficha, Ficha ficha2, String user1, String pass1) {
		
		super(user1,pass1);
		this.nombre = nombre;
		this.tablero = tablero;
		this.ficha=ficha;
		this.ficha2=ficha2;
		
	}
	
	public void tirarDado(Dado d) {
		
		d.tirar();
		
	}
	
	public int consultarDado(Dado d) {
		
		return d.mostrarTirada();
		
	}
	
	public int consultarTablero() {
		
		boolean[] casillas = tablero.consultarCasillas();
		
		int posicion = 0;
		
		for (int i = 0; i<tablero.consultarNumCasillas(); i++) {
			
			if (casillas[i]==true) {
				
				posicion = i;
				break;
				
			}
			
		}
		
		return posicion;
		
	}
	
	public void moverFicha(int cs) {
		
		ficha.mover(cs);
		
	}
	
	public String getNombre(){
		
		return nombre;
		
	}
	
}
