
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
    private int numeroLanzamientos;
    int lanzamientosRestantes;
    int[] dados;

    public Jugador(String nombre,int numLanzamientos) {
        this.nombre = nombre;
        numeroLanzamientos=numLanzamientos;
        lanzamientosRestantes= numeroLanzamientos;
        lanzamientosRealizados = 0;
        sumatoriaPuntos = 0;
        dados = new int[2];
    }

    public int getLanzamientosRestantes() {
        return lanzamientosRestantes;
    }
    
    public void calcularLanzamientosRestantes(){
        
        lanzamientosRestantes=numeroLanzamientos-lanzamientosRealizados;
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
