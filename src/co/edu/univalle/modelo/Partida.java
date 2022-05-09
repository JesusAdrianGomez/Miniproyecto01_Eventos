/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.modelo;

/**
 * Archivo: Partida.java
 * Fecha de Creación: 07/05/2022
 * 
 * Esta clase es la encargada de generar Jugadores para la partida, enviandoles el respectivo nombre.
 * 
 * @author Julian Alexander Alvarez Payares <alvarez.julian@correounivalle.edu.co> GitHub: https://github.com/Anezeres 
 * @author 
 */

//la validacion de si son dos o un jugador va a ir en la interface
public class Partida {
 
    private int numeroLanzamientos;
    private int lanzamientosTotales;
    private int lanzamientosRestantes;
    private int lanzamientosEmpate;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador actualTirador;

    public Partida(int numeroLanzamientos, Jugador jugador1, Jugador jugador2) {
        
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.numeroLanzamientos = numeroLanzamientos;
        lanzamientosRestantes = this.numeroLanzamientos;
        lanzamientosTotales = 0;
        lanzamientosEmpate = 0;
    }
    
    public String ganadorParcial(){
        if(jugador1.getSumatoriaPuntos()>jugador2.getSumatoriaPuntos()){
            return jugador1.getNombre();
        }else if(jugador2.getSumatoriaPuntos()>jugador1.getSumatoriaPuntos()){
            return jugador2.getNombre();
        }else{
            return "";
        }
    }
    
    public String quienTira(){
      
        return actualTirador.getNombre();
    }
      
    
    
    
    
    
    
    
    
    
    
    
    
    
}
