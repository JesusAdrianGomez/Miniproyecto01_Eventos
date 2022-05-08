
package co.edu.univalle.modelo;

/**
 * Archivo: Jugador.java
 * Fecha de Creación: 07/05/2022
 * 
 * Esta clase es la encargada de generar Jugadores para la partida, enviandoles el respectivo nombre.
 * 
 * @author Julian Alexander Alvarez Payares <alvarez.julian@correounivalle.edu.co> GitHub: https://github.com/Anezeres 
 * @author 
 */

public class Jugador {
    String nombre;
    int sumatoriaPuntos;
    int lanzamientosRealizados;
    int[] dados;

    public Jugador(String nombre) {
        this.nombre = nombre;
        lanzamientosRealizados = 0;
        int sumatoriaPuntos = 0;
        int[] dados = new int[2];
    }
    
    
    /* Getters and Setters de la Clase Jugador */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSumatoriaPuntos() {
        return sumatoriaPuntos;
    }

    public int getLanzamientosRealizados() {
        return lanzamientosRealizados;
    }


    public int[] getDados() {
        return dados;
    }
    
    
    
    
          
    
}
