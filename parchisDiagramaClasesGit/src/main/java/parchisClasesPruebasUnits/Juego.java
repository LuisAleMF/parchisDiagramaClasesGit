/**
 * 
 */
package parchisClasesPruebasUnits;

/**
 * 
 */
public class Juego {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Tablero tablero = new Tablero();
		Dado dado1 = new Dado();
		Ficha miFicha=new Ficha();
		Ficha miFicha2=new Ficha();
		Ficha suFicha=new Ficha();
		Ficha suFicha2=new Ficha();
		Jugador yo = new Jugador("Angel", tablero, miFicha, miFicha2, "usuario1", "password1");
		Jugador el = new Jugador("Angel", tablero, suFicha, suFicha2, "usuario2", "password2");
		
		do {

			yo.tirarDado(dado1);
			System.out.println("Ha salido el " + yo.consultarDado(dado1));

		} while (yo.consultarDado(dado1) != 5);

		yo.moverFicha(1);
		System.out.println("La ficha sale de casa");
		
		Dado dado2 = new Dado();
		
		int tirada;
		do {

			yo.tirarDado(dado1);
			yo.tirarDado(dado2);
			
			tirada = yo.consultarDado(dado1)+yo.consultarDado(dado2);
			
			System.out.println("Ha salido el " + tirada);		
			yo.moverFicha(tirada);
			
			System.out.println("La ficha esta en la casilla "+yo.consultarTablero());

		} while (yo.consultarTablero() < tablero.consultarNumCasillas());

		System.out.println("Fin del juego");

	}

} 
