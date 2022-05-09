package co.edu.univalle.casino;

/**
 * Archivo: Principal.java Fecha de Creación: 07/05/2022
 *
 * Esta clase es la encargada de generar Jugadores para la partida, enviandoles
 * el respectivo nombre.
 *
 * @author Julian Alexander Alvarez Payares
 * <alvarez.julian@correounivalle.edu.co> GitHub: https://github.com/Anezeres
 * @author Jesus Adrian Gomez Cadena
 * <jesus.cadena@correounivalle.edu.co> GitHub: https://github.com/JesusAdrianGomez
 */
import co.edu.univalle.modelo.Jugador;
import co.edu.univalle.vista.PrePartida1;
import co.edu.univalle.vista.PrePartida2;
import co.edu.univalle.vista.VentanaDados;
import co.edu.univalle.vista.VentanaSelecJugador;

public class Principal {

    public static void main(String[] args) {
        Jugador uno = new Jugador("julian",3,false);
        Jugador dos = new Jugador("jesus",3,false);
       VentanaDados prueba = new VentanaDados(uno,dos,2);
  
    }

}
